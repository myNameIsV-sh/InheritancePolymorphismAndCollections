import java.util.HashSet;
import java.util.Set;

public class FolhaDePagamento {
  private Set<Empregado> empregados;

  public FolhaDePagamento() {
    empregados = new HashSet<>();
  }

  public void adicionarFuncionario(Empregado empregado) {
    empregados.add(empregado);
  }

  public void exibirTodos() {
    for (Empregado empregado : empregados) {
      System.out.println("Nome: " + empregado.getNome() + " " + empregado.getSobrenome() +
        ", CPF: " + empregado.getCpf() + ", Vencimento: " + empregado.vencimento());
    }
  }

  public double calcularValorTotal() {
    double total = 0;
    for (Empregado empregado : empregados) {
      total += empregado.vencimento();
    }
    return total;
  }
}

