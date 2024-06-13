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

    public String verDetalle(){

     /*   StringBuilder sb = new StringBuilder();
        sb.append("auto.fabricante = " + this.fabricante);
        sb.append("\nauto.modelo = " + this.modelo);
        sb.append("\nauto.color = " + this.color);
        sb.append("\nauto.cilindraje = " + this.cilindraje);
        return sb.toString();
      */

        // otra forma mejor asi
      return   "auto.fabricante = " + this.fabricante +
              "\nauto.modelo = " + this.modelo +
              "\nauto.color = " + this.color +
              "\nauto.cilindraje = " + this.cilindraje;

    }

    // metodos con argumentos :
    public String acelerar(int rpm){
        return "el auto " + this.fabricante + " acelerando a " + rpm + "rpm";
    }

    public String frenar(){
        return fabricante + " " + this.modelo + " frenado!!!";
    }

    public String acelerarFrenar(int rpm){
        String acelerar = this.acelerar(2000);
        String frenar = this.frenar();
        return acelerar + "\n" + frenar;
    }
}
