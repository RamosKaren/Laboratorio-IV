public class Main {
    public static void main(String[] args){
       
    Animal animal1 = new Perro("snopy");
    Animal animal2 = new Gato("Mitzy");

    animal1.hacerSonido();
    animal2.hacerSonido();
    }
}
abstract class Animal {
    protected String nombre;
    public Animal(String nombre) {
        this.nombre = nombre;
    }
    public abstract void hacerSonido();
}
class Perro extends Animal{
    public Perro(String nombre){
        super(nombre);
    }


@Override
public void hacerSonido(){
    System.out.println(nombre + "  Dice: Gua gua" );
    }
}
class Gato extends Animal{
    public Gato (String nombre){
        super(nombre);
    }
@Override
public void hacerSonido(){
    System.out.println(nombre + " Dice: Miau Miay");
    }
}

