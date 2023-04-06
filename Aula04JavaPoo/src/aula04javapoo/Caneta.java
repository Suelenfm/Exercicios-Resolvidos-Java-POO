
package aula04javapoo;

public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private boolean destampada;
    private String cor;
    
    public Caneta(String m, String c, float p) {
    this.modelo = m;
    this.ponta = p;
    this.cor = c;
    this.tampar();
 
    
    }
    public String getModelo(){
        return this.modelo;
        
    }
    
    public void setModelo (String m){
        this.modelo = m;
    }
    
    public float getPonta (){
        return this.ponta;
    }
    public void setPonta (float p){
        this.ponta = p;
        
    }
    
    public String getCor(){
        return this.cor;
        
    }
    
    public String setCor( String c){
        return this.cor;
    }
    
    
    public void status(){
        System.out.println("SOBRE A CANETA");
        System.out.println("Modelo: "+ this.getModelo());
        System.out.println("Ponta:" + this.getPonta());
        System.out.println("Cor: "+ this.getCor());
        System.out.println("Tampada? " +this.destampada);
        
        
    }
    
    public void tampar(){
        this.tampada = false;
        
    } 
    
    public void destampar (){
        this.destampada = true;
      
    }
  
}
