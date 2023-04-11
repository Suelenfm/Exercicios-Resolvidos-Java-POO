package mamiferos;

public class Mamiferos extends Animal{
    protected String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }
}
