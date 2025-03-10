public class FretePadrao extends Frete implements Fretavel {

  public FretePadrao(double valorKilometros, double distancia) {
    super(valorKilometros, distancia);
  }

  // Chamada dos métodos encapsulados
  public double calcularFrete() {
    return getvalorKilometros() * getDistancia();
  }

  @Override
  public String toString(){
    return "Frete Padrão" + super.toString();
  }

}
