function CalculadoraIdade(){
    //passo 1 e pegar o ano que o usuario digitou*/
    const anoNascimento = document.getElementById('anoNascimento').value;
    //pegar o ano atual
    const anoAtual = new Date().getFullYear();
    /* calcular idade*/
    const Resultado = anoAtual - anoNascimento;
    document.getElementById('resultado').textContent=Resultado
}