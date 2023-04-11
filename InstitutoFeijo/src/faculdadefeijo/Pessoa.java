package faculdadefeijo;

public abstract class Pessoa {
    private String nome;
    private int idade;
    private String sexo;
    
    
    
    public void fazerAni(){
        this.idade++;
        System.out.println(this.getNome()+" fez aniversário e agora tem: "+ this.getIdade());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    
    public String status() {
        return "\nDados \n"+ "\nNome: " + this.getNome() + "\nIdade: " +this.getIdade()+"\nSexo: " +this.getSexo();
    }
    
}
