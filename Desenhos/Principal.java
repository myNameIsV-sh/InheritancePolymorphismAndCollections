public class Principal {
  public static void main (String [] args) {
    CadastroDeDesenhos cadastro = new CadastroDeDesenhos();

    cadastro.adicionarDesenho(new Retângulo());
    cadastro.adicionarDesenho(new Círculo());
    cadastro.adicionarDesenho(new Quadrado());
    cadastro.adicionarDesenho(new Pessoa());

    cadastro.desenharTodos();
  }
}
