import java.text.DecimalFormat;
import java.util.ArrayList;

public class CadastroFretes {
  ArrayList<Fretavel> listaDeFretes = new ArrayList<Fretavel>();

  public void adicionarFrete(Fretavel fretavel){
    listaDeFretes.add(fretavel);
  }

  public String percorrerListaFrete() {
    var i = 0;
    for (Fretavel fretavel : listaDeFretes) {
      i += fretavel.calcularFrete();
    }

    DecimalFormat df = new DecimalFormat("#.00");

    return "Valor total dos fretes:\t" + df.format(i);
  }

  public void exibirTodosFretes() {
    for (Fretavel fretavel : listaDeFretes) {
      System.out.println();
    }
  }


}
