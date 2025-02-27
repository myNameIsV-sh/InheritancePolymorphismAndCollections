public class FreteSuperExpresso extends FreteExpresso implements Fretavel {
  private double valorSeguro;

  public FreteSuperExpresso(double valorKilometros, double distancia, int nivelUrgencia, double valorSeguro){
    super(valorKilometros, distancia, nivelUrgencia);
    this.valorSeguro = valorSeguro;
  }

  public double calcularFrete() {
    return (getDistancia() * getvalorKilometros()) * (getNivelUrgencia() * 100) + getValorSeguro();
  }

  public double getValorSeguro() {
    return valorSeguro;
  }

  public void setValorSeguro(double valorSeguro) {
    this.valorSeguro = valorSeguro;
  }

  @Override
  public String toString() {
    return String.format("Frete Super Expresso: %s || Valor do Seguro: R$.2f", super.toString(), getValorSeguro());
  }
}
