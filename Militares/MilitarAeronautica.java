public class MilitarAeronautica extends Militar implements Carreira {
  private int anosPatente, horasVoo;

  public MilitarAeronautica(int matricula, String patente, int anosPatente, int horasVoo) {
    super(matricula, patente);
    this.anosPatente = anosPatente;
    this.horasVoo = horasVoo;
  }

  public int getAnosPatente() {
    return anosPatente;
  }

  public void setAnosPatente(int anosPatente) {
    this.anosPatente = anosPatente;
  }

  public int getHorasVoo() {
    return horasVoo;
  }

  public void setHorasVoo(int horasVoo) {
    this.horasVoo = horasVoo;
  }

  @Override
  public String toString() {
    return "MilitarAeronautica{" +
        "anosPatente=" + anosPatente +
        ", horasVoo=" + horasVoo +
        '}';
  }

  @Override
  public boolean podeProgredir() {
    // Só pode prosseguir se:
    // - tem mais de dois anos em uma patente
    // - possui mais de 100 horas de voo
    if (getAnosPatente() == 2 && getHorasVoo() == 100) {
      String patente = getPatente();
      if (patente.equals("Soldado") || patente.equals("Cabo")) {
        setPatente("Tenente");
        return true;
      }
    }
    return false;
  }
}