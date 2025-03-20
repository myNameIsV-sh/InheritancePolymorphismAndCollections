public class Main {
    public static void main(String[] args) {

        CadastroMilitar cadastro = new CadastroMilitar();

        // Primeiro passo: Criar os militares
        Militar aeronautica = new MilitarAeronautica(111, "Soldado", 2, 100);
        Militar exercito = new MilitarExercito(6, "Soldado", true, true);
        Militar marinha = new MilitarMarinha(1337,"Soldado", true );

        // Segundo passo: Adicionar os militares
        cadastro.adicionarMilitar(aeronautica);
        cadastro.adicionarMilitar(exercito);
        cadastro.adicionarMilitar(marinha);

        System.out.println("Militares que podem progredir: ");
        for (Militar militar : cadastro.imprimePodeProgredir()) {
            System.out.println("Matrícula: " + militar.getMatricula() + ", Patente: " + militar.getPatente());
        }

        cadastro.realizaProgressao();

        System.out.println("Dados após a progressão: ");
        for (Militar militar : cadastro.imprimePodeProgredir()) {
            System.out.println("Matrícula: " + militar.getMatricula() + ", Patente: " + militar.getPatente());
        }

    }

}
