  // Classe Abstrata
abstract class Empregado {
  // Atributos
  private String nome, sobrenome, cpf;

  // Construtor
  public Empregado(String nome, String sobrenome, String cpf) {
    this.nome = nome;
    this.sobrenome = sobrenome;
    this.cpf = cpf;
  }
  // Método abstrato
  public abstract double vencimento();

  // Métodos Concretos
  // Encapsulamento Getters And Setters
  public String getNome() { return nome; }
  public String getSobrenome() { return sobrenome; }
  public String getCpf() { return cpf; }

  public void setNome(String nome) { this.nome = nome; }
  public void setNome(String sobrenome) { this.sobrenome = sobrenome; }
  public void setCpf(String cpf) { this.cpf = cpf; }

}
