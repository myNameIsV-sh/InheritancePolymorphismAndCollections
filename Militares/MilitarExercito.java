public class MilitarExercito extends Militar {
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
                "getPatente=" + getPatente() +
                ", participouGuerra=" + participouGuerra +
                ", ganhouGuerra=" + ganhouGuerra +
                '}';
    }

    @Override
    public boolean podeProgredir() {
        if (isParticipouGuerra() && isGanhouGuerra()) {
            return true;
            // Verificação implicíta de valores booleanos
        } else {
            System.out.println("sinto muito, patente negada...");
        }
        return false;
    }
}