public class CondicaoBreakContinue {
    public static void main(String[] args) {
        
        /* CONDIÇÃO DO BREAK, PARADA.
        for(int numero = 1; numero <=5; numero ++){
            if(numero == 3)
               break; 
            System.out.println(numero);
        }
        */
        /* NESSA CONDIÇÃO ELE IRÁ PULAR O 3, E CONTINUAR NO 4 */
        for(int numero = 1; numero <=5; numero ++){
            if(numero == 3)
               continue; 
            System.out.println(numero);
        }
    }
}
