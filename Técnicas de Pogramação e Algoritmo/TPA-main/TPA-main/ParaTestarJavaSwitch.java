
import java.util.Scanner;

public class ParaTestarJavaSwitch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o número da sua fruta: ");
        int NumFruta = scanner.nextInt();

        //verificar se a fruta com switch case
        switch (NumFruta) { //nos parenteses coloca oq ele vai analisar
            case 1:
                System.out.println("Delicia, é Maçã ");
                break;
            case 2:
                System.out.println("Ehhhh, Banana ");
                break;
            case 3:
                System.out.println("A melhor, Laranjaa");
                break;
//default é para qundo o programa verificar as cases e nao bater com o número digitado, vai exibir uma mensagem para reiniciar
            default:
                System.out.print("FRUTA INVÁLIDA");

        }

        //programa que identifica o jogo
        System.out.println("Digite o número do seu jogo: ");
        int JogoCerto = scanner.nextInt();

        //verificar se a fruta com switch case
        switch (JogoCerto) { //nos parenteses coloca oq ele vai analisar
            case 1:
                System.out.println("É Minecraft ");
                break;
            case 2:
                System.out.println("É FIFA");
                break;
            case 3:
                System.out.println("É Fortnite");
                break;
            case 4:
                System.out.println("É Call of Duty");
                break;
            case 5:
                System.out.println("É The Sims");
                break;
//default é para qundo o programa verificar as cases e nao bater com o número digitado, vai exibir uma mensagem para reiniciar
            default:
                System.out.print("JOGO NÃO ENCONTRADO");

        }
        System.out.println("Insira o dia: ");
        int Dia = scanner.nextInt();

        //verificar se a fruta com switch case
        switch (Dia) { //nos parenteses coloca oq ele vai analisar
            case 1:
                System.out.println("Domingo ");
                break;
            case 2:
                System.out.println("Segunda-Feira ");
                break;
            case 3:
                System.out.println("Terça-Feira ");
                break;
            case 4:
                System.out.println("Quarta-Feira ");
                break;
            case 5:
                System.out.println("Quinta-Feira ");
                break;
            case 6:
                System.out.println("Sexta-Feira ");
                break;
            case 7:
                System.out.println("Sábado ");
                break;
//default é para qundo o programa verificar as cases e nao bater com o número digitado, vai exibir uma mensagem para reiniciar
            default:
                System.out.print("DIA INVÁLIDO");

        }

    }
}
