package transporte;

/**
 * La clase Barco representa un tipo de vehículo que puede navegar.
 *
 * Extiende la clase Vehiculo e implementa la interfaz ConMotor.
 * @see ConMotor
 * @see Vehiculo
 *
 * Tiene métodos para arrancar, describirse y encender su motor.
 *
 * <pre>
 *  Barco barco = new Barco(50);  // Genera instacia de Barco con velocidad máxima de 50 km/h
 *  barco.arrancar();             // Devuelve "El vehículo está en marcha."
 *  barco.encenderMotor();        // Devuelve "El motor del barco está encendido."
 *  barco.describir();            // Devuleve "Soy un barco que navego a 50 km/h."
 * </pre>
 *
 * La clase Barco tiene un atributo velocidadMaxima que se inicializa en el constructor, y siempre es un valor positivo.
 *
 * Métodos que se pueden llamar:
 * <ul>
 *  <li>{@link #arrancar()}: método para arrancar el vehículo</li>
 *  <li>{@link #encenderMotor()}: método para encender el motor del barco</li>
 *  <li>{@link #describir()} método para describir el movimiento y verlocidad barco</li>
 * </ul>
 *
 * @author Sergio Ruiz de León
 * @version 1.0
 * @since 2025-02-23
 *
 */

public class Barco extends Vehiculo implements ConMotor {

  /**
   * Constructor de la clase Barco.
   * @param velocidadMaxima velocidad máxima del barco (entero positivo).
   */
  public Barco(int velocidadMaxima) {
    super(velocidadMaxima);
  }

  /**
   * Método para arrancar el barco.
   */
  @Override
  public void encenderMotor() {
    System.out.println("El motor del barco está encendido.");
  }

  /**
   * Método para describir el barco.
   */
  @Override
  public void describir() {
    System.out.println("Soy un barco que navega a "+velocidadMaxima+" km/h.");
  }

}
