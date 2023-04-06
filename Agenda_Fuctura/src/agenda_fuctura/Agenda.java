
package agenda_fuctura;

public class Agenda {
      private String nome, endereço , email;
    private Long telefone;
    
    public Agenda(String n, String e,String em, Long tel){
        this.setNome(n);
        this.setEndereço(e);
        this.setEmail(em);
        this.setTelefone(tel);
    }
    public void mostra(){
        System.out.println("Nome: "+this.getNome());
        System.out.println("Endereço: "+this.getEndereço());
        System.out.println("Email: "+this.getEmail());
        System.out.println("Telefone: "+this.getTelefone());
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getTelefone() {
        return telefone;
    }

    public void setTelefone(Long telefone) {
        this.telefone = telefone;
    }
}
