package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Animal();
        Animal meuCachorro = new Cachorro();
        Animal meuGato = new Gato();
        Animal meuPassarinho = new Passarinho();
        Animal minhaBaleia = new Baleia();

        Animal[] animais = {meuAnimal, meuCachorro, meuGato, meuPassarinho, minhaBaleia};

        for(Animal animal : animais){
            animal.emitirSom();
        }


    }
}
