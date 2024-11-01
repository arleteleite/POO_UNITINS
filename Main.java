package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Gato gato = new Gato();
        Animal animal = new Animal();
        Animal passarinho = new Passarinho();

        animal.emitirSom();
        gato.emitirSom();
        cachorro.emitirSom();
        passarinho.emitirSom();


    }
}
