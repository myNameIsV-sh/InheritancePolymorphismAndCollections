public class Principal {
  public static void main (String [] args) {
    FolhaDePagamento a = new FolhaDePagamento();

    Empregado empregadoA = new Assalariado("João", "Silva", "123.456.789-00", 3000.00);
    Empregado empregadoB = new Comissionado("Maria", "Santos", "987.654.321-00", 10000.00, 0.1);
    Empregado empregadoC = new Horista("Carlos", "Oliveira", "111.222.333-44", 20.00, 160);

    a.adicionarFuncionario(empregadoA);
    a.adicionarFuncionario(empregadoB);
    a.adicionarFuncionario(empregadoC);

    System.out.println("Todos os funcionários:");
    a.exibirTodos();

    System.out.println("Valor total da folha de pagamento: " + a.calcularValorTotal());
    
  }
}
