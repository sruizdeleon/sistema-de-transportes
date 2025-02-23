package transporte;

/**
 * Interface SinMotor.
 *
 * Esta interfaz proporciona un método por defecto para simular la acción de empujar usando la fuerza
 * humana.
 * Las clases que implementen esta interfaz, pueden usar la implementación por defecto del método
 * usarFuerzaHumana() para imprimir un mensaje indicando que está moviéndose por medio de fuerza humana.
 *
 * Métodos que se pueden llamar:
 * <ul>
 *  <li>{@link #usarFuerzaHumana()}: método para mover el vehículo con fuerza humana</li>
 * </ul>
 */

interface SinMotor {
  default void usarFuerzaHumana() {
    System.out.println("Usando fuerza humana para moverse.");
  }
}
