
package exercicioventiladorpoo;

public class Ventilador {
    
    
 private String marca;
 private int potencia;
 private int helices;
 private String modelo;
 private String cor;
 private boolean quebrado;
 private boolean novo;
 
    
 
    public Ventilador (String ma, String mo, String cor, int p,int h){
        this.marca = ma;
        this.modelo=mo;
        this.cor=cor;
        this.potencia=p;
        this.helices=h;
        this.novo();
        
        
    }
 
    public void status (){
        System.out.println("SOBRE O VENTILADOR");
        System.out.println("Marca: "+this.getMarca());
        System.out.println("Modelo:"+this.getModelo());
        System.out.println("Cor:"+ this.getCor());
        System.out.println("Potência: "+this.getPotencia());
        System.out.println("Hélices: "+this.getHelices());
        System.out.println("Possui defeitos de fábrica?" +this.getNovo());
    }
    
    public void defeito(){
        this.novo = true;
    }
    public void novo(){
        this.novo = false;
    }
    
    public boolean getQuebrado() {
        return quebrado;
    }

    public void setQuebrado(boolean quebrado) {
        this.quebrado = quebrado;
    }

    public boolean getNovo() {
        return novo;
    }

    public void setNovo(boolean novo) {
        this.novo = novo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    public int getHelices() {
        return helices;
    }

    public void setHelices(int helices) {
        this.helices = helices;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
 
 
    
}
