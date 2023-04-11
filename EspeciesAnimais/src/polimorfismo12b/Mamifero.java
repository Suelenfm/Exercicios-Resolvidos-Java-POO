
package polimorfismo12b;

public class Mamifero extends Animal {
private String corPelo;
    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void alimentar() {
        System.out.println("Mamando");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de mamífero");
    }

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public String toString() {
     return "Animal{" + "peso=" + peso + ", idade=" + idade + ", membros=" + membros + " Mamifero" + "corPelo=" + corPelo + '}';
    }
 
        
}
