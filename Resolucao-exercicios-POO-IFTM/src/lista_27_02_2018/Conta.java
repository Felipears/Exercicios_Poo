package lista_27_02_2018;

public class Conta {

	private String titular;
	private int numero;
	private double saldo;
	
	public Conta() {
		
	}
	
	public Conta(String titular) {
		this.titular = titular;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	
	
	public void deposita(double quantidade) {
		
		this.saldo +=quantidade;
	}
	
	public boolean saca(double valor) {
		if(this.saldo < valor) {
			return false;
		}
		else {
			this.saldo -= valor;
			return true;
		}
	}

}
