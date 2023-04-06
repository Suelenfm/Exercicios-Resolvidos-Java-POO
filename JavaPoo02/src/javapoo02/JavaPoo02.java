
package javapoo02;
public class JavaPoo02 {

   
    public static void main(String[] args) {
       Caneta c1 = new Caneta();
       c1.cor = "azul";
       c1.carga = "50%";
       c1.modelo = "Bic cristal azul";
       c1.ponta = 0.5f;
       c1.código = 100;
       c1.tampar();
       c1.status();
       c1.rabiscar();
       
       
       Caneta c2 = new Caneta();
       c2.cor = "Vermelha";
       c2.código = 101;
       c2.carga = "100%";
       c2.modelo = "Bic cristal Vermelha";
       c2.ponta = 0.5f;
       c2.destampada();
       c2.status();
       c2.rabiscar();

       
    }
    
}
