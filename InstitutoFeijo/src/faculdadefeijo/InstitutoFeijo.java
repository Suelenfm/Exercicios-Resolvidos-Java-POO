
package faculdadefeijo;

public class InstitutoFeijo {

    public static void main(String[] args) {
      Aluno a = new Aluno();
     
      
      a.setCurso(" Análise e Desenvolvimento de Sistemas");
      a.setMat(943583485);
      a.setNome("Suelen");
      a.setSexo("F");
      a.setIdade(19);
      System.out.println(a.status());
      a.fazerMatricula();
     
     Funcionário f1 = new Funcionário ();
     f1.setIdade(43);
     f1.setNome(" Arlindo");
     f1.setSexo("M");
     System.out.println(f1.status());
     f1.setTrabalhando(true);
     f1.mudarTrabalho();
     f1.fazerAni();
     
     Professor p = new Professor("Francisco","M",60);
     p.getSalario();
     
    
     System.out.println(p.status());
     p.setEspecialidade("Banco de Dados");
     p.aumentoSalario(100);
        
    }
    
}
