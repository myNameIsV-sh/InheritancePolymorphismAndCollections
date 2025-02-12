// Aplicação da Herança
public class Assalariado extends Empregado {
  private double salario;

  // Construtor da classe
  public Assalariado (String nome, String sobrenome, String cpf, double salario) {
    // Chamada dos atributos da superclasse
    super (nome, sobrenome, cpf);
    // Atributo próprio da subclasse
    this.salario = salario;
  }

  public double vencimento() {
    return salario;
  }

  public double getSalario() { return salario; }
  public void setSalario() { this.salario = salario; }

}
