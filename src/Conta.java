
public abstract class Conta implements IConta {
	
	private static final Integer AGENCIA = 1;
	private static Integer SEQUENCIA = 1;
	private static final Double TAXA_DE_SAQUE= 5.00;
	
	private Integer agencia;
	private Integer numeroDaConta;
	private double saldo;
	private Cliente cliente;
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA;
		this.numeroDaConta = SEQUENCIA++;
		this.cliente = cliente;
	}
	
	public Integer getAgencia() {
		return agencia;
	}
	public Integer getNumeroDaConta() {
		return numeroDaConta;
	}
	public Double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		if(saldo > valor) {
			this.saldo -= (valor+TAXA_DE_SAQUE);
			System.out.printf("O valor %.2f acabou de ser sacado na conta " + numeroDaConta  + " com a taxa de %.2f", valor, TAXA_DE_SAQUE);
			System.out.println();
		}else {
			System.out.println("Saldo insuficiente para realizar o saque!!!");
			System.out.println();
		}
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.printf("O valor %.2f acabou de ser depositado na conta " + numeroDaConta, valor);
		System.out.println();
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		if(saldo > valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			System.out.printf("O valor %.2f está sendo enviado pela conta " + numeroDaConta + " para a " + contaDestino.numeroDaConta, valor);
			System.out.println();
		}else {
			System.out.println("Valor insuficiente para realizar a transferência !!!");
		}
	}
	
	
	protected void imprimirInfoComuns() {
		System.out.println(String.format("Titular da conta: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero da Conta: %d", this.numeroDaConta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
	
}
