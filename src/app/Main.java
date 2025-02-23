package app;

import transporte.*;

public class Main {

  public static void main(String[] args) {
    // Crear instancias de cada tipo de vehículo

    // Coche
    Coche miCoche = new Coche(180);
    miCoche.arrancar();
    miCoche.encenderMotor();
    miCoche.describir();
    System.out.println();

    // Bicicleta
    Bicicleta miBicicleta = new Bicicleta(30);
    miBicicleta.arrancar();
    miBicicleta.usarFuerzaHumana();
    miBicicleta.describir();
    System.out.println();

    // Barco
    Barco miBarco = new Barco(50);
    miBarco.arrancar();
    miBarco.encenderMotor();
    miBarco.describir();
    System.out.println();

    // Avion
    Avion miAvion = new Avion(900);
    miAvion.arrancar();
    miAvion.encenderMotor();
    miAvion.describir();
  }

}
