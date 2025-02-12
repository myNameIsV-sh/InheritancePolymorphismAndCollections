public class Principal {
  public static void main (String [] args) {
    Zoologico bica = new Zoologico();
    Animal cachorro = new Cachorro();
    Animal gato = new Gato();
    Animal galinha = new Galinha();
    Animal papagaio = new Papagaio();

    bica.adicionar(cachorro);
    bica.adicionar(gato);
    bica.adicionar(galinha);
    bica.adicionar(papagaio);

    bica.listarAnimais();
    bica.animarBicharada();
    bica.alimentarAnimais();

    System.out.println("Total de animais: " + bica.totalAnimais());
  }
}
