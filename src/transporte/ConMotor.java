package transporte;

/**
 * Interface ConMotor.
 *
 * Esta interfaz proporciona un método por defecto para simular la acción de arrancar un motoro.
 * Las clases que implementen esta interfaz, pueden usar la implementación por defecto del método
 * encenderMotor() para imprimir un mensaje indicando que está arrancado.
 *
 * Métodos que se pueden llamar:
 * <ul>
 *  <li>{@link #encenderMotor()}: método para encender el motor</li>
 * </ul>
 */
interface ConMotor {

  /**
   * Método por defecto para encender el motor.
   */
  default void encenderMotor() {
    System.out.println("El motor está encendido.");
  }
}
