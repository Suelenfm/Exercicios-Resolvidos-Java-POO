
package polimorfismo12b;
import java.util.Scanner;
public class Polimorfismo12b {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        
       Mamifero m = new Mamifero();
       Reptil r = new Reptil();
       Peixe p = new Peixe ();
       Ave a = new Ave ();
       Arara ar = new Arara();
       
       m.setPeso(22.4f);
       m.setIdade(3);
       m.setMembros(4);
       m.setCorPelo("Preto");
       
        System.out.println(m.toString());
        m.alimentar();
       
       ar.alimentar();
       ar.locomover();
       
       Canguru cg = new Canguru();
       cg.locomover();
    }
    
}
