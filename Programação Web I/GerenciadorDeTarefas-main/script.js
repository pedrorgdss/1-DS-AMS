document.addEventListener('DOMContentLoaded', function() {
    const taskInput = document.getElementById('taskInput');
    const addTaskBtn = document.getElementById('addTaskBtn');
    const taskList = document.getElementById('taskList');
    const pendingCount = document.getElementById('pendingCount');
    
    // Carregar tarefas do localStorage
    loadTasks();
    
    // Adicionar tarefa
    addTaskBtn.addEventListener('click', addTask);
    taskInput.addEventListener('keypress', function(e) {
        if (e.key === 'Enter') {
            addTask();
        }
    });
    
    function addTask() {
        const taskText = taskInput.value.trim();
        if (taskText === '') {
            alert('Por favor, digite uma tarefa!');
            return;
        }
        
        // Criar elemento da tarefa
        const taskItem = document.createElement('li');
        taskItem.className = 'task-item';
        
        const taskCheckbox = document.createElement('input');
        taskCheckbox.type = 'checkbox';
        taskCheckbox.addEventListener('change', toggleTask);
        
        const taskSpan = document.createElement('span');
        taskSpan.className = 'task-text';
        taskSpan.textContent = taskText;
        
        const deleteBtn = document.createElement('button');
        deleteBtn.className = 'delete-btn';
        deleteBtn.textContent = 'Remover';
        deleteBtn.addEventListener('click', deleteTask);
        
        taskItem.appendChild(taskCheckbox);
        taskItem.appendChild(taskSpan);
        taskItem.appendChild(deleteBtn);
        
        taskList.appendChild(taskItem);
        
        // Limpar campo de entrada
        taskInput.value = '';
        
        // Salvar tarefas no localStorage
        saveTasks();
        
        // Atualizar contador
        updatePendingCount();
    }
    
    function toggleTask(e) {
        const taskText = e.target.nextElementSibling;
        if (e.target.checked) {
            taskText.style.textDecoration = 'line-through';
            taskText.style.color = '#999';
        } else {
            taskText.style.textDecoration = 'none';
            taskText.style.color = '#000';
        }
        
        // Salvar tarefas no localStorage
        saveTasks();
        
        // Atualizar contador
        updatePendingCount();
    }
    
    function deleteTask(e) {
        const taskItem = e.target.parentElement;
        taskList.removeChild(taskItem);
        
        // Salvar tarefas no localStorage
        saveTasks();
        
        // Atualizar contador
        updatePendingCount();
    }
    
    function saveTasks() {
        const tasks = [];
        document.querySelectorAll('.task-item').forEach(taskItem => {
            const checkbox = taskItem.querySelector('input[type="checkbox"]');
            const text = taskItem.querySelector('.task-text').textContent;
            tasks.push({
                text: text,
                completed: checkbox.checked
            });
        });
        localStorage.setItem('tasks', JSON.stringify(tasks));
    }
    
    function loadTasks() {
        const savedTasks = localStorage.getItem('tasks');
        if (savedTasks) {
            const tasks = JSON.parse(savedTasks);
            
            tasks.forEach(task => {
                const taskItem = document.createElement('li');
                taskItem.className = 'task-item';
                
                const taskCheckbox = document.createElement('input');
                taskCheckbox.type = 'checkbox';
                taskCheckbox.checked = task.completed;
                taskCheckbox.addEventListener('change', toggleTask);
                
                const taskSpan = document.createElement('span');
                taskSpan.className = 'task-text';
                taskSpan.textContent = task.text;
                
                if (task.completed) {
                    taskSpan.style.textDecoration = 'line-through';
                    taskSpan.style.color = '#999';
                }
                
                const deleteBtn = document.createElement('button');
                deleteBtn.className = 'delete-btn';
                deleteBtn.textContent = 'Remover';
                deleteBtn.addEventListener('click', deleteTask);
                
                taskItem.appendChild(taskCheckbox);
                taskItem.appendChild(taskSpan);
                taskItem.appendChild(deleteBtn);
                
                taskList.appendChild(taskItem);
            });
            
            updatePendingCount();
        }
    }
    
    function updatePendingCount() {
        const totalTasks = document.querySelectorAll('.task-item').length;
        const completedTasks = document.querySelectorAll('.task-item input[type="checkbox"]:checked').length;
        pendingCount.textContent = totalTasks - completedTasks;
    }
});5