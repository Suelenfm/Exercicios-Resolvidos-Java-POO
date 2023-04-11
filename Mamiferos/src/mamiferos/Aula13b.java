
package mamiferos;

public class Aula13b {

    
    public static void main(String[] args) {
        // PROGRAMA PRINCIPAL
        
        Mamiferos x = new Mamiferos();
        x.emitirSom();
        Lobo l = new Lobo();
        
        l.emitirSom();
        
        Cachorro c = new Cachorro();
        c.emitirSom();
       // c.reagir("Olá");
        
        c.reagir(19,00);
        
    }
    
}
