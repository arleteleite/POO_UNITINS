package polimorfismo;

public class Gato extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("O gato faz: MIAU MIAU MIAU");
    }
}