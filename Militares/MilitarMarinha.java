public class MilitarMarinha extends Militar {
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
                "getPatente=" + getPatente() +
                ", participouConsertoAviao=" + participouConsertoAviao +
                '}';
    }

    @Override
    public boolean podeProgredir() {
        // Participou do reparo de um avião em alto mar
        if (isParticipouConsertoAviao()) {
            return true;
        } else {
            System.out.println("sinto muito, patente negada...");
        }
        return false;
    }
}