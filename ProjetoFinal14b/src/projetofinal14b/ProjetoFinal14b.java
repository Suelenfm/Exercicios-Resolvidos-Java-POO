package projetofinal14b;
public class ProjetoFinal14b {

    public static void main(String[] args) {
        // Programa Principal
        
        Video v [] = new Video [6];
        
       v [0] = new Video ("Java 14");
        v [1] = new Video ("PHP MODERNO");
        
        
        
      /* System.out.println(v[0].toString());*/
       
        
        
        Gafanhoto g [] = new Gafanhoto [2];
        
        g[0] = new Gafanhoto("Fufa",54,"F");
       
        
      
        System.out.println(g[0].toString());
        /*System.out.println("\n----------------------\n");
        System.out.println(g[0].toString());*/
        
        /*Visualizacao vis [] = new Visualizacao [2];
        vis [0] = new Visualizacao (g[0],v[0]);
        System.out.println(vis[0].toString());*/
        
      Visualizacao vis[] = new Visualizacao [2];
      vis[0] = new Visualizacao (g[0],v[0]); //JAVA
      vis[0].avaliar(9);
      System.out.println(vis[0].toString());
      vis[1] = new Visualizacao (g[0],v[1]);  //PHP
      vis[0].avaliar();
      System.out.println(vis[1].toString());   
        
    }
    
}
