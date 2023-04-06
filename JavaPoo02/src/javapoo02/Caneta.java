
package javapoo02;
public class Caneta {
    String modelo;
    String cor;
    float ponta;
    boolean tampada;
    String carga;
    int código;
    
    void status (){
    System.out.println("");    
    System.out.println("*****************************");
    System.out.println("O STATUS ATUAL DA CANETA #" + this.código + " É");
    System.out.println("*****************************");
    System.out.println("");
    System.out.println("- Uma caneta " + this.cor);
    System.out.println("- O modelo é " + this.modelo);
    System.out.println("- Ponta de "+ this.ponta);
    System.out.println("- Tampada? "+ this.tampada);
    System.out.println("- Com carga de " + this.carga);
        
    }
    void rabiscar(){
        if (tampada == true){
            System.out.println("Destampe a caneta para rabiscar! ");
        }else{      
            System.out.println("Pode rabiscar! ");
                
        }        
    }
    
    void tampar(){
    this.tampada = true;
    }
    
    void destampada(){
    this.tampada = false;    
    }
    
}
