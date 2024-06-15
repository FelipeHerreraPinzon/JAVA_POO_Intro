class Automovil {

    private String fabricante;
    private String modelo;
    private String color = "gris";
    private double cilindraje;
    private int capacidadTanque = 40;

    /// metodos para obtener atributos de la clase
    public String leerFabricante(){
        return this.fabricante;
    }
    public String leerModelo(){
        return this.modelo;
    }
    public String leerColor(){
        return this.color;
    }
    public Double leerCilindraje(){
        return this.cilindraje;
    }
    public Integer leerCapacidadTanque(){
        return this.capacidadTanque;
    }

    // metodos para actualiizar / asignar atributos

    public void asignarFabricante(String fabricante){
        this.fabricante = fabricante;
    }

    public void asignarModelo(String modelo){
        this.modelo = modelo;
    }
    public void asignarColor(String color){
        this.color = color;
    }

    public void asignarCilindraje(Double cilindraje){
        this.cilindraje = cilindraje;
    }

    public void asignarCapacidadTanque(Integer capacidadTanque){
        this.capacidadTanque = capacidadTanque;
    }

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

    public float calcularConsumo(int km, float porcentajeBencina){
        return km / (capacidadTanque * porcentajeBencina);
    }

    public float calcularConsumo(int km, int porcentajeBencina){
        return km / (capacidadTanque * (porcentajeBencina / 100f));
    }


}
