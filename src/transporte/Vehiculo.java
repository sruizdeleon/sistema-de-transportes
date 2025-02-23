package transporte;

  /**
   * La clase Vehiculo representa un tipo de vehículo.
   *
   * Es una clase abstracta que no se puede instanciar.
   *
   * Métodos que se pueden llamar:
   * <ul>
   *  <li>{@link #arrancar()}: método para arrancar el vehículo</li>
   *  <li>{@link #describir()} método para describir el vehículo</li>
   * </ul>
   *
   * @author Sergio Ruiz de León
   * @version 1.0
   * @since 2025-02-23
   */


abstract class Vehiculo {

  protected int velocidadMaxima;

  public Vehiculo(int velocidadMaxima) {
    this.velocidadMaxima = Math.abs(velocidadMaxima);
  }


  public int getVelocidadMaxima() {
      return velocidadMaxima;
  }

  public void setVelocidadMaxima(int velocidadMaxima) {
    this.velocidadMaxima = Math.abs(velocidadMaxima);
  }



  public void arrancar() {
    System.out.println("El vehículo está en marcha.");
  }
  public abstract void describir();


}
