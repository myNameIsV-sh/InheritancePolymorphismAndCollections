public class Main {
  public static void main(String[] args) {

    CadastroFretes x = new CadastroFretes();

    // Adicionando Parâmetros...
    Fretavel frete1 = new FretePadrao(50.0, 100.0);
    Fretavel frete2 = new FreteExpresso(100.0, 50.0, 2);
    Fretavel frete3 = new FreteSuperExpresso(100.0, 50.0, 2, 450);

    x.adicionarFrete(frete1);
    x.adicionarFrete(frete2);
    x.adicionarFrete(frete3);

    x.exibirTodosFretes();
    x.percorrerListaFrete();

  }
}