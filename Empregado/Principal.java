public class Principal {
  public static void main (String [] args) {
    FolhaDePagamento a = new FolhaDePagamento();

    Empregado empregadoA = new Assalariado("Sam", "Altman", "000.000.000-00", 3000.00);
    Empregado empregadoB = new Comissionado("Lisa", "Su", "111.111.111-11", 10000.00, 0.1);
    Empregado empregadoC = new Horista("Jensen", "Huang", "222.222.222-22", 20.00, 160);

    a.adicionarFuncionario(empregadoA);
    a.adicionarFuncionario(empregadoB);
    a.adicionarFuncionario(empregadoC);

    System.out.println("Todos os funcionários:");
    a.exibirTodos();

    System.out.println("Valor total da folha de pagamento: " + a.calcularValorTotal());
    
  }
}
