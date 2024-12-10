public class CondicaoSwitch {
    public static void main(String[] args) {
        String plano = "M";

        switch (plano) {
            case "T":{
                System.out.println("5GB YOUTUBE");
            }
            case "M":{
                System.out.println("Whats e Instagram gratis");
            }
            case "B":{
                System.out.println("100 Minutos de ligação"); /*SEM O BREAK O CODIGO IMPRIME AS CONDICOES, MAS A CONDICAO B SEMPRE IRA IMPRIMIR. */
            }
        }
    }
}
