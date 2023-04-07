/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultraemojicombat;
import java.util.Scanner;
public class Lutador {
    Scanner entrada = new Scanner(System.in);
    Scanner entradal = new Scanner (System.in);
     
    private String nome;
    private String nacional;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitoria;
    private int derrota;
    private int empate;


public Lutador(String n, String na, int id,float alt,float p, int v,int d,int em){
    this.nome=n;
  this.nacional=na;
    this.idade=id;
   this.altura=alt;
    this.setPeso(p);
    categoria();
   this.vitoria=v;
   this.derrota=d;
    this.empate=em;
    
}    
public void apresenta (){
    
    System.out.println("*****************************\n APRESENTAÇÃO DOS CANDIDATOS!!\n*****************************\n");
    System.out.println("NOME: "+ this.getNome());
    System.out.println("NACIONALIDADE: "+this.getNacional());
    System.out.println("IDADE: "+this.getIdade());
    System.out.println("ALTURA: "+this.getAltura());
    System.out.println("PESO: "+ this.getPeso());
    System.out.println("CATEGORIA: "+this.getCategoria());
    System.out.println("VITÓRIAS: "+this.getVitoria());
    System.out.println("DERROTAS: "+this.getDerrota());
    System.out.println("EMPATES: "+this.getEmpate());
    System.out.println("");
}
   

private void categoria(){
    if (this.getPeso()<52.2){
        this.categoria="INVÁLIDO";
    }else if(this.getPeso()<=70.3){
                this.categoria="LEVE";
                }else if (this.getPeso()<=83.8){
                     this.categoria="MÉDIO";
                }else if (this.getPeso()<=120){
                     this.categoria="PESADO";
                }else{
                   this.categoria="INVÁLIDO"; 
                }
    
            /*52.2<= INVÁLIDO
            70.3<= LEVE
            83.9<= MÉDIO
            120.2<= PESADO
            ELSE = INVÁLIDO
        */
    
}
   
    
    public void empatou(){
        this.setEmpate(this.getEmpate()+1);
    }
    
    public void perdeu(){
         this.setDerrota(this.getDerrota()+1);
    }
    public void ganhou(){
        this.setVitoria(this.getVitoria()+1);
    }
    
    public void status(){
        System.out.println("--------------------------");
        System.out.println(this.getNome());
        System.out.println("É UM PESO "+this.getCategoria());
        System.out.println("COM "+this.getVitoria()+" VITORIAS");
        System.out.println("EMPATES: "+this.getEmpate());
        System.out.println("DERROTAS: "+this.getDerrota());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacional() {
        return nacional;
    }

    public void setNacional(String nacional) {
        this.nacional = nacional;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        this.setCategoria();
       
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        this.categoria = categoria;
     
    }

    public int getVitoria() {
        return vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public int getDerrota() {
        return derrota;
    }

    public void setDerrota(int derrota) {
        this.derrota = derrota;
    }

    public int getEmpate() {
        return empate;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
    
    
}
