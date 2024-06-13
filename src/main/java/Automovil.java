class Automovil {

    String fabricante;
    String modelo;
    String color = "gris";
    double cilindraje;

/*
    public void detalle(){
        String modelo = "otro";
        System.out.println("auto.fabricante = " + this.fabricante);
        System.out.println("auto.modelo = " + this.modelo);
        // imprime la variable local modelo
        System.out.println("auto.modelo = " + modelo);
        // imprime el atributo color, ya que no hay variable local color
        System.out.println("auto.color = " + color);
        System.out.println("auto.cilindraje = " + this.cilindraje);
    }
*/

    public String detalle(){
        StringBuilder sb = new StringBuilder();
        sb.append("auto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindraje = " + this.cilindraje);
        return sb.toString();
    }
}
