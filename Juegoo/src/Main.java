import javax.swing.JOptionPane;
public class Main {
  public static void main(String[] args) {
    //Patrón del Singleton
    Juego primeraInstancia = Juego.getInstance();
    primeraInstancia.setIntentosMax(2);
    primeraInstancia.setAlias("Jaimito");
    System.out.println(primeraInstancia.getIntentosMax());
    System.out.println(primeraInstancia.getAlias());

    Juego segundaInstancia = Juego.getInstance();
    segundaInstancia.setAlias("Pepito");
    segundaInstancia.setRondaPartida(10);
    System.out.println(segundaInstancia.getAlias());
    System.out.println(segundaInstancia.getRondaPartida());

  }
}