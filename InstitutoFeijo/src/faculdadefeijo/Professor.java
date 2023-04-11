
package faculdadefeijo;
 
public class Professor extends Pessoa{
    private String especialidade;
    private float salario;
    
    Professor(String n,String s,int i) {
    this.setNome(n);
    this.setSexo(s);
    this.setIdade(i);
    this.setSalario (2500f);
    
}
    public void aumentoSalario(float aum){
        salario += aum;
        System.out.println("Seu novo salário é: "+salario);
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
        System.out.println("Especialidade: "+especialidade);
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    
}
