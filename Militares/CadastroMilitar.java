import java.util.ArrayList;
import java.util.List;

public class CadastroMilitar {
    List<Militar> militares = new ArrayList<>();

    public CadastroMilitar() {
        militares = new ArrayList<>();
    }

    public void adicionarMilitar(Militar militar) {
        militares.add(militar);
    }

    public List<Militar> imprimePodeProgredir() {
        List<Militar> militaresAptos = new ArrayList<>();
        for (Militar militar : militares) {
            if (militar.podeProgredir()) {
                militaresAptos.add(militar);
            }
        }
        return militaresAptos;
    }

    public void realizaProgressao() {
        for (Militar militar : militares) {
            // Se a condição for verdadeira o militar irá subir de patente
            if (militar.podeProgredir()) {
                if (militar.getPatente().equals("Soldado")) {
                    militar.setPatente("Cabo");
                } else if (militar.getPatente().equals("Cabo")) {
                    militar.setPatente("Tenente");
                }
            }
        }
    }


}