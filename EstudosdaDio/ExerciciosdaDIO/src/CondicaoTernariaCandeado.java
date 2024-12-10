import java.util.Scanner;

public class CondicaoTernariaCandeado{
    public static void main(String[] args) {
        Scanner condicao = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        float nota = condicao.nextFloat();

        String resultado = nota >= 7 ? "APROVADO" : nota >=5 && nota <=7 ? "RECUPERAÇÃO" : "REPROVADO";
        System.out.println(resultado);
    }
}