public class forArray {
    public static void main(String[] args) {
        String alunos [] = {"eduardo", "felipe", "pedro", "miguel"};

        /*for (int x=0; x<alunos.length; x++){
            System.out.println(alunos[x]);
        }*/

        for (String aluno : alunos){
            System.out.println("Nome do aluno é " +aluno);
        }
    }   
}
