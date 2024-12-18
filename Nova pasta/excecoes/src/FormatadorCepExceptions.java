public class FormatadorCepExceptions{
    public static void main(String[] args) {
        
        try {
            String cepFormatado = FormatarCep("2376506");
            System.out.println(cepFormatado);
        } catch (cepExceptions e) {
            System.out.println("O cep não corresponde com as regras de negocio");
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    static String FormatarCep(String cep) throws cepExceptions{
        if(cep.length() !=8)/*nao tiver os 8 caracteres lancara a excecao */
            throw new  cepExceptions();

            return"23.765-064";
    }
}