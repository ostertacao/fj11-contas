
public class Conta {
	
	private double saldo;
	private String titular;
	private int numero;
	private String agencia;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public Conta() {
		// TODO Auto-generated constructor stub
	}

	public void sacar (double valor) {
		saldo = saldo - valor;
	}

	public void depositar (double valor) {
		saldo = saldo + valor;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}
	
}
