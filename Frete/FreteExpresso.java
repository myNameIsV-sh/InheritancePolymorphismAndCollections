public class FreteExpresso extends Frete implements Fretavel {
  private int nivelUrgencia;

  public FreteExpresso(double valorKilometros, double distancia, int nivelUrgencia) {
    super(valorKilometros, distancia);
    this.nivelUrgencia = nivelUrgencia;
  }

  public double calcularFrete() {
    return (getDistancia() * getvalorKilometros()) * (getNivelUrgencia() * 100);
  }

  public int getNivelUrgencia() {
    return nivelUrgencia;
  }

  public void setNivelUrgencia(int nivelUrgencia) {
    this.nivelUrgencia = nivelUrgencia;
  }

  @Override
  public String toString() {
    return String.format("Frete Expresso: %s || Nível de urgência: %d", super.toString(), getNivelUrgencia());
  }

}
