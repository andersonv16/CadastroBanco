package cadastrobanco;

import static cadastrobanco.CadastroBanco.clientes;
import javax.swing.JOptionPane;

public class Cliente {
    private String nome;
    private String endereco;
    private String cpf;
    private int idade;

    public Cliente(String nome, String endereco, String cpf, int idade) {
        this.nome = nome;
        this.endereco = endereco;
        this.cpf = cpf;
        this.idade = idade;
    }

    Cliente() {
    }
    
    
    
   public void mudaCPF(String cpf) {
       if (this.idade <= 60) {
        validaCPF(cpf);
    }
    this.cpf = cpf;
}
    private void validaCPF(String cpf) {
        // série de regras aqui falha caso não seja válida.
    
    }
    
    public void mostrarStatus(){
        JOptionPane.showMessageDialog(null, "O Nome do Cliente: " + this.getNome()+
                                             "\nA Idade do Cliente: " + this.getIdade()+
                                             "\nO Cpf do Cliente: " + this.getCpf());
       
    }

    // ..

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    
}
    
