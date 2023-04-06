
package aula09javapoob;

public class Livro implements Publicacao{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;
    
    
    public Livro(String tit,String au,int totp,int PagA, Pessoa leitor ){
        this.titulo = tit;
        this.autor=au;
        this.totPaginas=totp;
        this.pagAtual=PagA;
        this.leitor = leitor;
        
       
    }
    public void detalhes(){
        if (this.getAberto()){
        
        System.out.println("TÍTULO: "+this.getTitulo());
        System.out.println("TOTAL DE PÁGINAS: "+this.getTotPaginas());
        System.out.println("AUTOR: "+ this.getAutor());
        System.out.println("PAROU LEITURA NA PÁGINA: "+this.getPagAtual());
            System.out.println("LEITOR: "+leitor.getNome());
        }else{
            System.out.println("ABRA O LIVRO PARA INICIAR A LEITURA");
        }
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }

    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }

    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
        
    }

    public Pessoa getLeitor() {
        return leitor;
    }

    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
       this.setAberto(true);
    }

    @Override
    public void fechar() {
        this.setAberto(false);
       
    }

    @Override
    public void folhear(int f) {
       this.pagAtual=f;
       
    }

    @Override
    public void avancarPag() {
     if (this.getAberto()){
        if(this.getPagAtual()<this.getTotPaginas()){
            this.setPagAtual(this.getPagAtual()+1);
            System.out.println(this.getPagAtual());
            
        }else{
            System.out.println("FIM DO LIVRO");
        }
     }else{
         System.out.println("ABRA O LIVRO PARA INICIAR A LEITURA...");
     }
       
    }

    @Override
    public void voltarPag() {
      if (this.getAberto()){  
        if (this.getPagAtual()<=this.getTotPaginas()&&this.getPagAtual()!=0){
            this.setPagAtual(this.getPagAtual()-1);
            System.out.println(this.getPagAtual());
            
        }else if(this.getPagAtual()==0){
            System.out.println("OOPS... VOCÊ JÁ ESTÁ NA PÁGINA 0");
            
        }
      }else{
          System.out.println("ABRA O LIVRO PARA INICIAR A LEITURA...");
      }
    }

    
    
    
}
