public abstract class Frete {
  private double valorKilometros;
  private double distancia;

  public Frete (double valorKilometros, double distancia) {
    this.valorKilometros = valorKilometros;
    this.distancia = distancia;
  }

  public double getvalorKilometros() {
    return valorKilometros;
  }

  public void setvalorKilometros(double valorKilometros) {
    this.valorKilometros = valorKilometros;
  }

  public double getDistancia() {
    return distancia;
  }

  public void setDistancia(double distancia) {
    this.distancia = distancia;
  }


}
