
import java.util.Scanner;

public class Calculador {
    public static void main(String[] args) throws Exception {
        
        Scanner cal = new Scanner(System.in);
        
        System.out.println("Digite o primeiro número: ");
        int num1 = cal.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = cal.nextInt();
        System.out.println("Digite uma das operações: +, -, *, /");
        System.out.println("Digite a operacao: ");
        String op = cal.next();


        switch  (op){
            case "+":
                System.out.println("A soma dos algarismos é: "+(num1 + num2));
                break;
            case "-":
                System.out.println("A subtração dos algarismos é: "+(num1 - num2));
                break;
            case "*":
                System.out.println("A multiplicação dos algarismos é: "+(num1 * num2));
                break;
            case "/":
            System.out.println("A divisão dos algarismos é: "+(num1 / num2));
                break;
        }
    }
}
