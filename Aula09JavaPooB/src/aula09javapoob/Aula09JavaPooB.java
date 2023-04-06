
package aula09javapoob;
public class Aula09JavaPooB {
    public static void main(String[] args) {
       
        Pessoa p[]=new Pessoa[2];
      
        p[0] = new Pessoa ("Zefa","Feminino",48);
        p[0].status();
        
        Livro n []=new Livro [2];
        
        n[0] = new Livro("A moça", "Gardelha", 50,50,p[0]);
        n[0].abrir();
        
        n[0].avancarPag();
        
        n[0].voltarPag();/*//
        n[0].voltarPag();
        n[0].voltarPag();
        n[0].voltarPag();*/
        n[0].detalhes();
        }
    }
    

