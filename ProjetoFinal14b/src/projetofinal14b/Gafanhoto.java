package projetofinal14b;
public class Gafanhoto extends Pessoa{
    
    private String login;
    private int totAssistido;

    public Gafanhoto(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
         this.login = nome;
         totAssistido = 0;
         
                
    }
    
    
    public void viuMaisUm(){
        
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }

    @Override
    public String toString() {
        return "Gafanhoto{" +super.ver()+ "login=" + login + ", totAssistido=" + totAssistido + '}';
    }

   
    
}
