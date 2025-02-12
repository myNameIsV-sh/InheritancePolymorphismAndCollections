import java.util.List;
import java.util.ArrayList;

public class Zoologico {
  private List<Animal> animais = new ArrayList<>();

  public void adicionar (Animal animal) {
    animais.add(animal);
  }

  public void animarBicharada() {
    for (Animal animal : animais) {
      animal.andar();
      animal.emitirSom();
    }
  }
  public void alimentarAnimais() {
    animais.comer();
  }
  public void listarAnimais() {
    System.out.println("Animais que estão no zoológico: ");
    for (Animal animal : animais) {
      System.out.println(animal.getClass().getSimpleName());
    }
  }

  public int totalAnimais() {
    return animais.size();
  }

}

