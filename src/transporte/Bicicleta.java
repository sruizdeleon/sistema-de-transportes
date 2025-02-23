package transporte;

/**
 * La clase Bicicleta representa un tipo de vehículo que puede rodar por medio de la fuerza humana.
 *
 * Extiende la clase Vehiculo e implementa la interfaz SinMotor.
 * @see SinMotor
 * @see Vehiculo
 *
 * Tiene métodos para arrancar, describirse y usar la fuerza humana para moverse.
 *
 * <pre>
 *  Bicicleta bicicleta = new Bicicleta(30); // Genera instacia de Bicicleta con velocidad máxima de 30 km/h
 *  bicicleta.arrancar();                    // Devuelve "El vehículo está en marcha."
 *  bicicleta.usarFuerzaHumana();            // Devuelve "Usando fuerza humana para mover la bicicleta."
 *  bicicleta.describir();                   // Devuleve "Soy una bicicleta con una velocidad máxima de 30 km/h."
 * </pre>
 *
 * La clase Bicicleta tiene un atributo velocidadMaxima que se inicializa en el constructor, y siempre es un valor positivo.
 *
 * Métodos que se pueden llamar:
 * <ul>
 *  <li>{@link #arrancar()}: método para arrancar el vehículo</li>
 *  <li>{@link #usarFuerzaHumana()}: método para mover la bicicleta con la fuerza humana</li>
 *  <li>{@link #describir()} método para describir el movimiento y verlocidad de la bicicleta</li>
 * </ul>
 *
 * @author Sergio Ruiz de León
 * @version 1.0
 * @since 2025-02-23
 *
 */

public class Bicicleta extends Vehiculo implements SinMotor {

  /**
   * Constructor de la clase Bicicleta.
   * @param velocidadMaxima velocidad máxima de la bicicleta (entero positivo).
   */
  public Bicicleta(int velocidadMaxima) {
    super(velocidadMaxima);
  }

  /**
   * Método para mover la bicicleta.
   */
  @Override
  public void usarFuerzaHumana() {
    System.out.println("Usando fuerza humana para mover la bicicleta.");
  }

  /**
   * Método para describir la bicicleta.
   */
  @Override
  public void describir() {
    System.out.println("Soy una bicicleta con una velocidad máxima de "+velocidadMaxima+" km/h.");
  }

}