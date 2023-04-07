
package contabanco;

public class ContaBanco {

    public static void main(String[] args) {
       Conta p1 = new Conta();
       
       p1.setNumConta(1111);
       p1.setDono("Creuza");
       p1.abrirConta("CC");
       
       
       Conta p2 = new Conta();
       p2.setNumConta(222222);
       p2.setDono("João");
       p1.abrirConta("CP");
       
       p1.depositar(1581.20f);
       p2.depositar(120);
       
       p1.sacar((float) (200.50%.2f));
       p2.sacar(900.21f);
       
       p1.pagarMens();
       
       
       p1.estadoAtual();
       p2.estadoAtual();
    }
    
}
