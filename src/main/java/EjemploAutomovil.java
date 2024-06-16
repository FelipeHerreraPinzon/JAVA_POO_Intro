public class EjemploAutomovil {
    public static void main(String[] args) {

        // el metodo constructor solamente se puede invocar con new
        Automovil subaru = new Automovil("Subaru", "1999", "Rojo", 2.0 , 150);
        Automovil subaru2 = new Automovil("Subaru", "1999", "Rojo", 2.0 , 150);


        // false en ambos,
        System.out.println("son iguales " + (subaru == subaru2));
        System.out.println("son iguales con equals " + (subaru.equals(subaru2)));

        // definiendo atributos de auto subaru
        // subaru.asignarFabricante();
       //   subaru.asignarModelo();
       //  subaru.asignarCilindraje();
       //  subaru.asignarColor();

        // instanciando objeto mazda
       //  Automovil mazda = new Automovil();
       // mazda.fabricante = "Mazda";
       // mazda.modelo = "1995";
       // mazda.color = "Azul";
       // mazda.cilindraje = 3.0;


        System.out.println();

        // invocar a los metodos de la clase Automovil
        System.out.println(subaru.verDetalle());
        System.out.println();
       // System.out.println(mazda.verDetalle());
        System.out.println();
        System.out.println("acelerar y frenar el subaru");
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println();
     //   System.out.println(mazda.acelerarFrenar(4000));

        //  sobrecarga de metodos
        //  mismo método con diferente tipo o cantidad de argumentos
        System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300, 0.6f));

        //  con porcentaje
        System.out.println("Kilometros por litro: " + subaru.calcularConsumo(300, 60));

        System.out.println(subaru.leerFabricante());
    }
}
