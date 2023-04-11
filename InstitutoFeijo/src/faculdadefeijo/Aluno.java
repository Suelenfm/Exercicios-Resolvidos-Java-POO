
package faculdadefeijo;

public class Aluno extends Pessoa {
   
    private int mat;
    private String curso;

    
    public void fazerMatricula(){
        System.out.println("Matrícula feita");
}
    


    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    
    @Override
    public String status() {
        return  "\nNome: " + this.getNome() + "\nIdade:" +this.getIdade() + "\nSexo: "+ this.getSexo()  + "\nMatrícula: " + mat + "\nCurso:" + curso + "Nome: ";
    }

  

    
    

}
