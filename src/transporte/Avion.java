package transporte;

/**
 * La clase Avion representa un tipo de vehículo que puede volar.
 *
 * Extiende la clase Vehiculo e implementa la interfaz ConMotor.
 * @see ConMotor
 * @see Vehiculo
 *
 * Tiene métodos para arrancar, describirse y encender su motor.
 *
 * <pre>
 *  Avion avion = new Avion(900); // Genera instacia de Avion con velocidad máxima de 900 km/h
 *  avion.arrancar();             // Devuelve "El vehículo está en marcha."
 *  avion.encenderMotor();        // Devuelve "El motor del avión está encendido."
 *  avion.describir();            // Devuleve "Soy un avión que vuela a 900 km/h."
 * </pre>
 *
 * La clase Avion tiene un atributo velocidadMaxima que se inicializa en el constructor, y siempre es un valor positivo.
 *
 * Métodos que se pueden llamar:
 * <ul>
 *  <li>{@link #arrancar()}: método para arrancar el vehículo</li>
 *  <li>{@link #encenderMotor()}: método para encender el motor del avión</li>
 *  <li>{@link #describir()} método para describir el movimiento y verlocidad avión</li>
 * </ul>
 *
 * @author Sergio Ruiz de León
 * @version 1.0
 * @since 2025-02-23
 *
 */
public final class Avion extends Vehiculo implements ConMotor {

  /**
   * Constructor de la clase Avion.
   * @param velocidadMaxima velocidad máxima del avión (entero positivo).
   */
  public Avion(int velocidadMaxima) {
    super(velocidadMaxima);
  }

  /**
   * Método para arrancar el avión.
   */
  @Override
  public void encenderMotor() {
    System.out.println("El motor del avión está encendido.");
  }

  /**
   * Método para describir el avión.
   */
  @Override
  public void describir() {
    System.out.println("Soy un avión que vuela a "+velocidadMaxima+" km/h.");
  }

}