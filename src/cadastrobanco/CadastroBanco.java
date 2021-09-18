package cadastrobanco;

import javax.swing.JOptionPane;

public class CadastroBanco {

static Cliente clientes[] = null;
static Conta contas[] = null;


    public static void main(String[] args) {
        
            // criando os clientes
       
		int QtdeCliente;
		String Quant = JOptionPane.showInputDialog("=====CADASTRAR CLIENTE=====\n"
                        + "\nQuantos Clientes Deseja Cadastrar: ");
		if (Quant == null) {
                    Quant = "0";

		}
		QtdeCliente = Integer.parseInt(Quant);
                
		clientes = new Cliente[QtdeCliente];

		for (int i = 0; i < clientes.length; i++) {
			clientes[i] = new Cliente();
		}
                        for (int i = 0; i < QtdeCliente; i++) {

			clientes[i].setNome(JOptionPane.showInputDialog("=====CADASTRAR CLIENTE=====\n"
                                + "\nDigite o Nome do Cliente: ("+(i + 1) + "/" + QtdeCliente + ")"));

			clientes[i].setEndereco(JOptionPane.showInputDialog("=====CADASTRAR=====\n"
                                + "\nDigite o endereço do Cliente: "+ clientes[i].getNome()));
                        clientes[i].setCpf(JOptionPane.showInputDialog("=====CADASTRAR=====\n"
                                + "\nDigite o Cpf do Cliente: "+ clientes[i].getNome()));
                        clientes[i].setIdade(Integer.parseInt(JOptionPane.showInputDialog("=====CADASTRAR=====\n"
                                + "\nDigite a idade do Cliente: "+ clientes[i].getNome())));
		}

		for (int i = 0; i < QtdeCliente; i++){
                    clientes[i].mostrarStatus();
                }
                JOptionPane.showMessageDialog(null, "Clientes Cadastrados!");

            // Criando conta
         
                
		contas = new Conta[QtdeCliente];
                
                for (int i = 0; i < clientes.length; i++) {
			contas[i] = new Conta();
                }

		for (int i = 0; i < contas.length; i++) {
			contas[i].setTitular(clientes[i].getNome());
                        contas[i].setAgencia(JOptionPane.showInputDialog("=====CADASTRAR=====\n"
                                + "\nDigite a agência do Cliente: " + contas[i].getTitular()));
                        contas[i].setNumConta(JOptionPane.showInputDialog("=====CADASTRAR=====\n"
                                + "\nDigite o número da conta do Cliente: " + contas[i].getTitular()));
              
                }  
                
                	for (int i = 0; i < QtdeCliente; i++){
                    contas[i].mostraStatus();
	} 
    }
}
    

