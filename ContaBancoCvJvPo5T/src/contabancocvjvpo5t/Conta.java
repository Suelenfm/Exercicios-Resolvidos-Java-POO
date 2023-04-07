
package contabancocvjvpo5t;
import java.util.Scanner;

public class Conta {
    Scanner entrada = new Scanner(System.in);
    Scanner entradal = new Scanner (System.in);
    
    public int conta;
    protected String tipo;
    private String nome;
    private Long cpf;
    private double saldo;
    private double saque;
    private double depositar;
    private boolean status;
    private int mencc;
    private int menscp;
    private boolean login;

    public void menu(){
       
        
        System.out.println("");
        System.out.println("BEM VINDO AO BANCO FEIJO");
        System.out.println("************************");
        System.out.println("1 - ABRIR CONTA");
        System.out.println("2 - DEPOSITO");
        System.out.println("3 - SACAR");
        System.out.println("4 - PAGAR MENSALIDADE");
        System.out.println("5 - STATUS DA CONTA");
        System.out.println("6 - FECHAR CONTA");
       
        
        
        System.out.print("\nDIGITE UM NÚMERO:");
        int menus = entrada.nextInt();
       String opcao="";
       switch (menus){
          
           case 1: 
           opcao = "";
           abrirConta();
           break;
           
           case 2:
           opcao = "";
           depositar();
           break;
           
           case 3:
           opcao ="";
           sacar();
           break;
           
           case 4:
           opcao="";
           pagarMen();
           break;
           
           case 5:
           opcao="";
           Status();
           break;
           
           
           case 6:
           fecharConta();
           break;
           
           
          
           
           default:
           System.out.println("OPÇÃO INVÁLIDA!");
               break;
          
               
       }
        System.out.println(opcao);
    }
    public void Status (){
        
        
        String respst = null;
        while (!"f".equals(respst)){
             
   
            
        if (status==true){
        System.out.println("NOME: "+this.getNome());
        System.out.println("CPF: "+this.getCpf());
        System.out.println("CONTA: "+this.getConta());
        System.out.println("TIPO: "+this.getTipo());
        System.out.println("");
        System.out.println("ÚLTIMAS MOVIMENTAÇÕES\n");
        System.out.println("DEPÓSITO: "+this.getDepositar());
        System.out.println("SAQUE: "+this.getSaque());
        System.out.println("SALDO:"+this.getSaldo());
                
            System.out.println("SUA CONTA ESTÁ ATIVA! ");    
        }
        
        else if(status ==false){  
                
                    System.out.println("SUA CONTA ESTÁ ENCERRADA. ");
                }
        
        System.out.print("\nDIGITE S PARA MENU PRINCIPAL F PARA SAIR: ");
        respst = entrada.next();
        
        if(respst.equalsIgnoreCase("s"))
        {
            menu();
        }
         break;
        }
    }  
    public void fecharConta(){
        
        String respfc = null;
        System.out.println("SENTIREMOS SAUDADES!");
        System.out.println("CONFIRME SEUS DADOS POR FAVOR...");
        
       System.out.print("NOME: ");
        nome = entrada.next();
        System.out.print("CPF: ");
        cpf = entrada.nextLong();
        System.out.print("TIPO - CC | CP: ");
        tipo = entrada.next();
        if (tipo.equalsIgnoreCase("CC"))
        {
            System.out.println("CONTA CORRENTE: XXXXXX"+ "\nNOME: " +this.getNome()+"\nCPF:"+this.getCpf()); 
            
        }
        else if(tipo.equalsIgnoreCase("CP"))
        {
            System.out.println("CONTA POUPANÇA: XXXXXX"+ "\nNOME: " +this.getNome()+"\nCPF:"+this.getCpf());
        }
      
        System.out.print("DIGITE 'OK' PARA CONFIRMAR' OU 'S' MENU PRINCIPAL: " );
        respfc=entrada.next();

            if (respfc.equalsIgnoreCase("OK"))
            {
                status =false;
             System.out.println("CONTA ENCERRADA ");
                System.out.println("DIGITE SAIR");
                respfc = entrada.next();
                
                menu();
               
            }
            else if (respfc.equalsIgnoreCase("s"))
            {
                menu();
             
            }
        
    }
    public void pagarMen(){
    String resppm = null;
    while (!"f".equals(resppm)){
        if (status==true){
   
            
            System.out.println("");
            System.out.println("PAGAMENTO MENSALIDADE");
            System.out.print("TIPO DE CONTA: "+tipo);
            System.out.println("");
           
             
                if(tipo.equalsIgnoreCase("cc")) 
                    
                {
                    mencc=12;
                    System.out.println("VALOR: "+mencc);
                    if (mencc<=saldo||mencc==saldo)
                    {
                        System.out.println("PAGAMENTO APROVADO");
                        saldo-=mencc;
                    }
                    else 
                            {
                                System.out.println("PAGAMENTO REPROVADO");  
                            }
                }
                
                else if(tipo.equalsIgnoreCase("cp")) 
                    
                {
                    menscp=20;
                    System.out.println("VALOR: "+menscp);
                    if(menscp<=saldo||menscp==saldo)
                    {
                    System.out.println("PAGAMENTO APROVADO");
                    saldo-=menscp;    
                    }
                    
                    else 
                     {
                     System.out.println("PAGAMENTO REPROVADO");  
                     }
                    
                }
   
        }
        else if (status ==false)
                {
                    System.out.println("SUA CONTA ESTÁ ENCERRADA!");
                }
                
    {   
            
                    
        System.out.print("\nDIGITE S PARA MENU PRINCIPAL F PARA SAIR: ");
        resppm = entrada.next();
        
        if(resppm.equalsIgnoreCase("s"))
        {
            menu();
        }
            break;
        }
        
        
        
       }
    
    }
    public void depositar(){
        String resp = null;
        while (!"s".equals(resp)){
            
            if (status==true){
                
                
                
        System.out.println("MENU DEPOSITO");
        System.out.println("********************");
        System.out.print("VALOR DEPOSITO: ");
        depositar = entrada.nextDouble();
        saldo += depositar;
        System.out.println("SALDO ATUAL: "+ saldo);
        
            System.out.print("\nDIGITE S PARA MENU PRINCIPAL F PARA SAIR: ");
            resp = entrada.next();
            
            if (resp.equalsIgnoreCase("s"))
            {
             menu();       
            }
            else if (resp.equalsIgnoreCase("f"))
            {
                System.out.println("OBRIGADA, VOLTE SEMPRE!");
            }
            
            }
        
            else
            {
                System.out.println("CONTA DESATIVADA...");  
            }
                break;
        }
        
    }
    public void sacar(){
        String resps = null;
        while (!"s".equals(resps)){
            if (status==true){
                
        
           
        
        System.out.println("SACAR");
        System.out.println("SALDO ATUAL: "+ saldo);
        System.out.println("********************");
        System.out.println("======================");
        System.out.print("VALOR SAQUE: ");
        saque = entrada.nextDouble();
        
        
        
           if (saldo < saque )
           {    
             System.out.print("Saldo insuficiente | Saldo: " + saldo );
             
             
           }
           else if(saque == saldo || saldo > saque){
               saldo -=saque;
               System.out.println("SAQUE: "+saque+" CONFIRMADO.\nSALDO ATUAL:"+saldo );
               
           }
           System.out.print("\nDIGITE S PARA MENU PRINCIPAL F PARA SAIR: ");
           resps = entrada.next();
            
            if (resps.equalsIgnoreCase("s"))
            {
             menu();       
            }
            else if (resps.equalsIgnoreCase("f"))
            {
                System.out.println("OBRIGADA, VOLTE SEMPRE!");
            
            }
            }
             else
            {
                System.out.println("CONTA DESATIVADA...");  
            }
            break;
        }
    }
    public void abrirConta(){
        String respac = null;
        
        System.out.print("NOME: ");
        nome = entradal.next();
        System.out.print("CPF: ");
        cpf = entrada.nextLong();
        System.out.print("TIPO - CC | CP: ");
        tipo = entrada.next();
        if (tipo.equalsIgnoreCase("CC"))
        {
            System.out.println("CONTA CORRENTE: XXXXXX"+ "\nNOME: " +this.getNome()+"\nCPF:"+this.getCpf()); 
            
        }
        else if(tipo.equalsIgnoreCase("CP"))
        {
            System.out.println("CONTA POUPANÇA: XXXXXX"+ "\nNOME: " +this.getNome()+"\nCPF:"+this.getCpf());
        }
    
        System.out.print("PARABÉNS! SUA CONTA FOI ABERTA!!" );
        
        
        status = true;
        System.out.print("\nDIGITE S PARA MENU PRINCIPAL F PARA SAIR: ");
           respac = entrada.next();
            
            if (respac.equalsIgnoreCase("s"))
            {
             menu();       
            }
            else if (respac.equalsIgnoreCase("f"))
            {
                System.out.println("OBRIGADA, VOLTE SEMPRE!"); 
            }
        
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Long getCpf() {
        return cpf;
    }
    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
    public double getSaque() {
        return saque;
    }
    public void setSaque(double saque) {
        this.saque = saque;
    }
    public double getDepositar() {
        return depositar;
    }
    public void setDepositar(double depositar) {
        this.depositar = depositar;
    }
    public int getConta() {
        
        return conta;
    }
    public void setConta(int conta) {
        this.conta = conta;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getMencc() {
        return mencc;
    }

    public void setMencc(int mencc) {
        this.mencc = mencc;
    }

    public int getMenscp() {
        return menscp;
    }

    public void setMenscp(int menscp) {
        this.menscp = menscp;
    }
    
}
