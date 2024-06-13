public class EjemploAutomovil {
    public static void main(String[] args) {

        Automovil auto = new Automovil();

        // definiendo atributos de auto
        auto.fabricante = "Subaru";
        auto.modelo = "1999";
        auto.cilindraje = 2.0;
        auto.color = "Rojo";

        Automovil mazda = new Automovil();
        mazda.fabricante = "Mazda";
        mazda.modelo = "1995";
        mazda.color = "Azul";

        // imprinir atributos auto
        System.out.println("auto.fabricante = " + auto.fabricante);
        System.out.println("auto.modelo = " + auto.modelo);
        System.out.println("auto.color = " + auto.color);
        System.out.println("auto.cilindraje = " + auto.cilindraje);

        System.out.println();

        // imprinir atributos mazda
        System.out.println("mazda.fabricante = " + mazda.fabricante);
        System.out.println("mazda.modelo = " + mazda.modelo);
        System.out.println("mazda.color = " + mazda.color);
        System.out.println("mazda.cilindraje = " + mazda.cilindraje);



    }
}
