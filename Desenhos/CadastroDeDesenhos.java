import java.util.List;
import java.util.ArrayList;

public class CadastroDeDesenhos {
  private List <Desenho> desenhos; // Armazenando uma lista de objetos <Desenho> (Desenho.java) que implementam o método public void desenhar();
				   // desenhos contêm instâncias da classe Desenhos.java; Círculo, Quadrado, Retângulo e Pessoa.java
  public CadastroDeDesenhos() {
    this.desenhos = new ArrayList<>(); // Criando um ArrayList do tipo <Desenho>
  }

  public void adicionarDesenhos(Desenho desenho) { // Só aceita objetos do tipo Desenho
    desenhos.add(desenho); // .add() adiciona itens para o ArrayList desenhos
  }

  public void desenharTodos() {
    for (Desenho desenho : desenhos) { // Um objeto do tipop Desenho vai pecorrer o ArrayList desenhos
      desenho.desenhar(); // Implementação do método public void desenhar() e por consequência o polimorfismo acontece aqui
    }
  }

}
