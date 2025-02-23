package transporte;

/**
 * La clase Coche representa un tipo de vehículo que se puede conducir.
 *
 * Extiende la clase Vehiculo e implementa la interfaz ConMotor.
 * @see ConMotor
 * @see Vehiculo
 *
 * Tiene métodos para arrancar, describirse y encender su motor.
 *
 * <pre>
 *  Coche coche = new Coche(180); // Genera instacia de Coche con velocidad máxima de 180 km/h
 *  coche.arrancar();             // Devuelve "El vehículo está en marcha."
 *  coche.encenderMotor();        // Devuelve "El motor del coche está encendido."
 *  coche.describir();            // Devuleve "Soy un coche que puedo alcanzar 180 km/h."
 * </pre>
 *
 * La clase Coche tiene un atributo velocidadMaxima que se inicializa en el constructor, y siempre es un valor positivo.
 *
 * Métodos que se pueden llamar:
 * <ul>
 *  <li>{@link #arrancar()}: método para arrancar el vehículo</li>
 *  <li>{@link #encenderMotor()}: método para encender el motor del coche</li>
 *  <li>{@link #describir()} método para describir el movimiento y verlocidad coche</li>
 * </ul>
 *
 * @author Sergio Ruiz de León
 * @version 1.0
 * @since 2025-02-23
 *
 */

public class Coche extends Vehiculo implements ConMotor {

  /**
   * Constructor de la clase Coche.
   * @param velocidadMaxima velocidad máxima del coche (entero positivo).
   */
  public Coche(int velocidadMaxima) {
    super(velocidadMaxima);
  }

  /**
   * Método para arrancar el coche.
   */
  @Override
  public void encenderMotor() {
    System.out.println("El motor del coche está encendido.");
  }

  /**
   * Método para describir el coche.
   */
  @Override
  public void describir() {
    System.out.println("Soy un coche que puede alcanzar "+velocidadMaxima+" km/h.");
  }

}
