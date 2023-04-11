
package polimorfismo12b;

public class Reptil extends Animal {

    private String corEscoma;
    
    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comento vegetais");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de Réptil");
    }

    public String getCorEscoma() {
        return corEscoma;
    }

    public void setCorEscoma(String corEscoma) {
        this.corEscoma = corEscoma;
    }
    
}
