public class MilitarExercito extends Militar implements Carreira {
  private boolean participouGuerra, ganhouGuerra;

  public MilitarExercito(int matricula, String patente, boolean participouGuerra, boolean ganhouGuerra) {
    super(matricula, patente);
    this.participouGuerra = participouGuerra;
    this.ganhouGuerra = ganhouGuerra;
  }

  public boolean isParticipouGuerra() {
    return participouGuerra;
  }

  public void setParticipouGuerra(boolean participouGuerra) {
    this.participouGuerra = participouGuerra;
  }

  public boolean isGanhouGuerra() {
    return ganhouGuerra;
  }

  public void setGanhouGuerra(boolean ganhouGuerra) {
    this.ganhouGuerra = ganhouGuerra;
  }

  @Override
  public String toString() {
    return "MilitarExercito{" +
        "participouGuerra=" + participouGuerra +
        ", ganhouGuerra=" + ganhouGuerra +
        '}';
  }

  @Override
  public boolean podeProgredir() {
    // se pode subir de patente se:
    // - se participou de uma guerra
    // - se ganhou a guerra
    if (isParticipouGuerra() && isGanhouGuerra()) {
      String patente = getPatente();
      // Verificação implicíta de valores booleanos
      if (patente.equals("Soldado") || patente.equals("Cabo")) {
        setPatente("Tenente");
        return true;
      }
    }
    return false;
  }
}