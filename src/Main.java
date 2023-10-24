public class Main {
    public static void main(String[] args) {

        Curso cursoADM = new Curso("Administracao");

        Aluno jose = new Aluno("Jose");
        jose.setMatricula(new Matricula("11100"));

        cursoADM.getAlunos().add(jose);


        Aluno maria = new Aluno("maria");
        maria.setMatricula(new Matricula("12010"));

        cursoADM.getAlunos().add(maria);


        Aluno ana = new Aluno("ana");
        cursoADM.getAlunos().add(ana);


        Aluno paulo = new Aluno("paulo");
        paulo.setMatricula(new Matricula("14010"));

        cursoADM.getAlunos().add(paulo);



        cursoADM.getAlunos().stream()
                .filter(a -> a.getMatricula().isPresent())
                    .forEach(a -> System.out.println(a.getNome() + " - " + a.getMatricula().get().getNumero()));

    }
}