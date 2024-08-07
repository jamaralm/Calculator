import java.util.*;

public class Calculator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String cont = "s";

        do {

            //Apresenta as operaçoes existentes ao usuario
            System.out.println("Operações: \n 1 - Soma \n 2 - Subtração\n 3 - Sair =(");

            System.out.println("Digite a operação desejada\n");
            Integer operationChoice = sc.nextInt();

            choiceResult(operationChoice);

            if(operationChoice == 3){
                System.out.print("Sistema Encerrado.");
                break;
            };

            System.out.println("Deseja Continuar? s/n \n");
            cont = sc.next();;

            if(Objects.equals(cont, "n")){
                break;
            }

        } while (true);

    }

    static int choiceResult(int opChoice){

        Scanner sc = new Scanner(System.in);
        int firstNumber;
        int secondNumber;

        switch(opChoice){
            case 1:
                System.out.println("Digite o primeiro numero: \n");
                firstNumber = sc.nextInt();
                System.out.println("Digite o Segundo numero: \n");
                secondNumber = sc.nextInt();

                return sum(firstNumber, secondNumber);

            case 2:
                System.out.println("Digite o primeiro numero: \n");
                firstNumber = sc.nextInt();
                System.out.println("Digite o segundo numero: \n");
                secondNumber = sc.nextInt();

                return sub(firstNumber, secondNumber);

            default:
                return 0;
        }

    }

    static int sum(int x, int y){
        int soma = x + y;
        System.out.println("SOMA: " + soma);
        return soma;
    }

    static int sub(int x, int y){
        int sub = x - y;
        System.out.println("SUBTRACAO: " + sub);
        return sub;
    }

}