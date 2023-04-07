
package ultraemojicombat;

import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    
    public void marcarLuta(Lutador l1, Lutador l2 ){
        if (l1.getCategoria().equals(l2.getCategoria()) && l1!=l2) {
            
            this.setAprovada (true);
            this.setDesafiado(l1);
            this.setDesafiante(l2);
            System.out.println("A LUTA FOI APROVADA!");
        }else{
            this.setAprovada(false);
            this.setDesafiado(null);
            this.setDesafiante(null);
            System.out.println("LUTA DESQUALIFICADA");
        }
        
    }
    
    public void lutar(){
        if (this.aprovada){
            System.out.println("##DESAFIADO##");
            desafiado.apresenta();
            System.out.println("##DESAFIANTE##");
            desafiante.apresenta();
            
            Random aleatorio = new Random ();
            int vencedor = aleatorio.nextInt(4);
            switch (vencedor){
                case 0:
                    System.out.println("A LUTA EMPATOU! ");
                    this.desafiado.empatou();
                    this.desafiante.empatou();
                break;
                
                case 1:
                    System.out.println("O VENCEDOR É... "+this.desafiado.getNome());
                    this.desafiado.ganhou();
                    this.desafiante.perdeu();
                break;
                
                case 2:
                    System.out.println("O VENCEDOR É... "+this.desafiante.getNome());
                    this.desafiante.ganhou();
                    this.desafiado.perdeu();
                break;
                
            }
            
        }else{
            System.out.println("A LUTA NÃO PODE ACONTECER!");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    
}
