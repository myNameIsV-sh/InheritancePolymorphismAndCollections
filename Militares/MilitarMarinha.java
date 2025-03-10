public class MilitarMarinha extends Militar implements Carreira {
  private boolean participouConsertoAviao;

  public MilitarMarinha(int matricula, String patente, boolean participouConsertoAviao) {
    super(matricula, patente);
    this.participouConsertoAviao = participouConsertoAviao;
  }

  public boolean isParticipouConsertoAviao() {
    return participouConsertoAviao;
  }

  public void setParticipouConsertoAviao(boolean participouConsertoAviao) {
    this.participouConsertoAviao = participouConsertoAviao;
  }

  @Override
  public String toString() {
    return "MilitarMarinha{" +
        "participouConsertoAviao=" + participouConsertoAviao +
        '}';
  }

  @Override
  public boolean podeProgredir() {
    // Participou do reparo de um avião em alto mar
    if (isParticipouConsertoAviao()) {
      String patente = getPatente();
      if (patente.equals("Soldado") || patente.equals("Cabo")) {
        setPatente("Tenente");
        return true;
      }
    }
    return false;
  }
}