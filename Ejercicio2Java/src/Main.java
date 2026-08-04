public class Main {
    public static void main(String[] args) {
        System.out.println("**Sistema de vehículos**");

        //Crear objetos  
        Vehiculo vehiculo1 = new Carro("Toyota" , "Corolla");
        Vehiculo vehiculo2 = new Moto("Honda" , "Civic");

        System.out.println("**Datos del carro**");
        vehiculo1.mostrarDatos();
        System.out.println();

        
        System.out.println("**Datos de la mota**");
        vehiculo2.mostrarDatos();
    }
}
class Vehiculo{
    //Atributos 
    private String marca;
    private String modelo;

    //Constructor
    public Vehiculo(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }

    //Getter 
    public String getMarca(){
        return marca;
    }
    //Setter
    public void setMarca (String marca) {
        this.marca = marca;
    }
    //Getter
    public String getModelo(){
        return modelo;
    }
    //Setter
    public void setModelo (String modelo) {
        this.modelo = modelo;
    }
    public void mostrarDatos(){
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }

}

class Carro extends Vehiculo {
        public Carro (String marca, String modelo) {
            super(marca, modelo);
            
        }
    @Override
    public void mostrarDatos () {
        System.out.println("Tipo: Carro");
        System.out.println("Marca: " + getMarca());
        System.out.println("Modelo: " + getModelo());
    }
}

class Moto extends Vehiculo  {
        public Moto(String marca, String modelo){
            super(marca, modelo);
        }

  @Override 
  public void mostrarDatos(){
    System.out.println("Tipo; Moto");
    System.out.println("Marca: " + getMarca());
    System.out.println("Modelo: " + getModelo()); 
    }
}