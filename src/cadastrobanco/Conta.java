package cadastrobanco;

import javax.swing.JOptionPane;

public class Conta {
    
    //Atributos
    private String titular;
    private String agencia;
    private String numConta;
    private double saldo;
    private double limite;
        
//Mêtodos
     //Construtor
       public Conta(String titular, String agencia, String numConta, double saldo) {
        this.titular = titular;
        this.agencia = agencia;
        this.numConta = numConta;
        this.saldo = saldo;
    
    }

    Conta() {
    }

    public void saca(double valor) {
        //posso sacar até saldo
        if (valor > this.saldo){ 
            System.out.println("Não posso sacar um valor maior do que o saldo!");
        } else {
            this.saldo = this.saldo - valor;
        }
    }
        void deposita(double quantidade) {
        if (quantidade < 0){ 
            System.out.println("Não posso depositar um valor menor do que zero!");
        } else {
            this.saldo += quantidade;
        }
            
        }
          public void mostraStatus(){
              JOptionPane.showMessageDialog(null, "O Nome do Cliente: " + this.getTitular()+
                                             "\nA agência e Conta: " + this.getAgencia()+ " "+  this.getNumConta()+
                                             "\nO saldo da Conta: " + this.getSaldo());
              
          }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
        
}