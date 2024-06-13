public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil subaru = new Automovil();

        // definiendo atributos de auto subaru
        subaru.fabricante = "Subaru";
        subaru.modelo = "1999";
        subaru.cilindraje = 2.0;
        subaru.color = "Rojo";

        // instanciando objeto mazda
        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "1995";
        mazda.color = "Azul";
        mazda.cilindraje = 3.0;


        System.out.println();

        // invocar a los metodos de la clase Automovil
        System.out.println(subaru.verDetalle());
        System.out.println();
        System.out.println(mazda.verDetalle());
        System.out.println();
        System.out.println("acelerar y frenar el subaru");
        System.out.println(subaru.acelerar(3000));
        System.out.println(subaru.frenar());
        System.out.println();
        System.out.println(mazda.acelerarFrenar(4000));





    }
}
