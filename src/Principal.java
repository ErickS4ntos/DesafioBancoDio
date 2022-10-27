
public class Principal {

	public static void main(String[] args) {
		Cliente erick = new Cliente();
		erick.setNome("Erick");
		
		Conta contaCorrente = new ContaCorrente(erick);
		Conta contaPoupanca = new ContaPoupanca(erick);
		
		contaCorrente.depositar(100);
		contaCorrente.transferir(50, contaPoupanca);
		
		contaCorrente.imprimirExtrato();
		contaPoupanca.imprimirExtrato();

	}

}
