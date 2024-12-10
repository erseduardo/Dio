import java.util.Random;

public class CondicaoDoWhile {
    public static void main(String[] args) {
       
        System.out.println("Discando....");

        do { 
            /*EXECUTA REPETIDAS VEZES ATE ALGUEM ATENDER */
            System.out.println("Telefone tocando...");
        } while (tocando());

        System.out.println("Alô !!! ");
    }

    /*METODO TOCANDO, ONDE FOI PASSADO UMA CONDIÇÃO */
    private static boolean tocando(){
        /*A CONDIÇÃO SERÁ UM VALOR ALEATORIO DE 1 A 3 QUER DIZER QUE ELE ATENDEU*/
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " +atendeu);
        /*NEGA UMA CONDIÇÃO (!) */
        return ! atendeu;
    }
}
