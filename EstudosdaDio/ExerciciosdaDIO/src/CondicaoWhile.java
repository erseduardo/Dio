import java.util.concurrent.ThreadLocalRandom;
public class CondicaoWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) { 
            double valorDoce = valorAleatorio();

            /*TRECHO APENAS PARA O NUMERO DA MESADA NÃO FICAR NEGATIVO  */
            if(valorDoce > mesada)
                valorDoce = mesada;

            /*Adiciona o valor aleatorio na variavel valor doce */
            System.out.println("Doce do valor: " +valorDoce+ " adicionado no carrinho");
            mesada = mesada - valorDoce; 
        }
        System.out.println("Mesada: " +mesada);
        System.out.println("João gastou toda sua mesada em doces");

    }
    /*ESSE METODO FOI CRIADO PARA GERAR NUMEROS ALEATORIOS DOS VALORES DO DOCE*/
    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2,8);
    }
    
}
