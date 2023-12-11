
public class Juego {
  /**
   * Es el número generado para adivinar.
   */
  private int numeroAdivinar;
  /**
   * Es el número introducido por el jugador.
   */
  private int numeroPropuesto;
  /**
   * Son las veces que se intenta adivinar el número.
   */
  private int intentosMax;
  /**
   * Es el numero de acierto en una partida.
   */
  private int puntuacion;
  /**
   * Intentos fallidos del jugador.
   */
  private int fallos;
  /**
   * Nombre del jugador.
   */
  private String alias;

  /**
   * Los intentos que el usuario lleva.
   */
  private int contadorIntentos;
  /**
   * ronda en cada partida. Es constante.
   */
  private int rondaPartida;
  /**
   * Ronda que se esta jugando.
   */
  private int rondaActual;

  private static Juego instance= null;
  private Juego() {}

  public Juego(int numeroAdivinar, int numeroPropuesto, int intentosMax, int puntuacion,
               int fallos, String alias, int contadorIntentos, int rondaPartida, int rondaActual) {
    this.numeroAdivinar = numeroAdivinar;
    this.numeroPropuesto = numeroPropuesto;
    this.intentosMax = intentosMax;
    this.puntuacion = puntuacion;
    this.fallos = fallos;
    this.alias = alias;
    this.contadorIntentos = contadorIntentos;
    this.rondaPartida = rondaPartida;
    this.rondaActual = rondaActual;
  }

  public static Juego getInstance(){
    if (instance == null){
      instance = new Juego();
    }
    return instance;
  }

  public int getNumeroAdivinar() {
    return numeroAdivinar;
  }

  public void setNumeroAdivinar(int numeroAdivinar) {
    this.numeroAdivinar = numeroAdivinar;
  }

  public int getNumeroPropuesto() {
    return numeroPropuesto;
  }

  public void setNumeroPropuesto(int numeroPropuesto) {
    this.numeroPropuesto = numeroPropuesto;
  }

  public int getIntentosMax() {
    return intentosMax;
  }

  public void setIntentosMax(int intentosMax) {
    this.intentosMax = intentosMax;
  }

  public int getPuntuacion() {
    return puntuacion;
  }

  public void setPuntuacion(int puntuacion) {
    this.puntuacion = puntuacion;
  }

  public int getFallos() {
    return fallos;
  }

  public void setFallos(int fallos) {
    this.fallos = fallos;
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(String alias) {
    this.alias = alias;
  }

  public int getContadorIntentos() {
    return contadorIntentos;
  }

  public void setContadorIntentos(int contadorIntentos) {
    this.contadorIntentos = contadorIntentos;
  }

  public int getRondaPartida() {
    return rondaPartida;
  }

  public void setRondaPartida(int rondaPartida) {
    this.rondaPartida = rondaPartida;
  }

  public int getRondaActual() {
    return rondaActual;
  }

  public void setRondaActual(int rondaActual) {
    this.rondaActual = rondaActual;
  }

  public static void setInstance(Juego instance) {
    Juego.instance = instance;
  }


}
