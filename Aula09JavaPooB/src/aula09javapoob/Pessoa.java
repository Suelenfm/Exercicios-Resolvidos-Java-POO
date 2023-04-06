
package aula09javapoob;

public class Pessoa {

private String nome, sexo;
private int idade;


public Pessoa(String n, String sx, int id){
    this.nome=n;
    this.sexo=sx;
    this.idade=id;
    
}


public void status(){
    System.out.println("-----------DADOS DO LEITOR-------");
    System.out.println("Nome: "+this.getNome());
    System.out.println("Sexo: "+this.getSexo());
    System.out.println("Idade: "+this.getIdade());
    System.out.println("");
    
}
public void fazerAniv(){
    this.idade++;
    
}
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }



}
