public class Horista extends Empregado {
  private double precoHora, horasTrabalhadas;

  public Horista(String nome, String sobrenome, String cpf, double precoHora, double horasTrabalhadas) {
    super(nome, sobrenome, cpf);
    this.precoHora = precoHora;
    this.horasTrabalhadas = horasTrabalhadas;
  } 

  // Métodos
  @Override
  public double vencimento() {
    return precoHora * horasTrabalhadas;

  // Getters
  public double getPrecoHora() { return precoHora; }
  public double getHorasTrabalhadas() { return horasTrabalhadas; }

  // Setters
  public void setPrecoHora(double precoHora) { this.precoHora = precoHora; }
  public void setHorasTrabalhadas(double horasTrabalhadas) { this.horasTrabalhadas = horasTrabalhadas; }
  }

}
