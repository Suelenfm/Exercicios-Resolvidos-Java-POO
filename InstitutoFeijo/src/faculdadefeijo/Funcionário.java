
package faculdadefeijo;

public class Funcionário extends Pessoa {
    private String setor;
    private boolean trabalhando;

    public void mudarTrabalho(){
        System.out.println("Mudou de trabalho");
        
    }
    
    
    
    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public boolean getTrabalhando() {
        return trabalhando;
    }

    public void setTrabalhando(boolean trabalhando) {
        this.trabalhando = trabalhando;
        System.out.println("-----------------");
        System.out.println("Funcionário: "+this.getNome());
        
       if (this.getTrabalhando()==true){
           System.out.println("Ativo");
       }else{
           System.out.println("Desligado");
       }
    }
    
    
    
}
