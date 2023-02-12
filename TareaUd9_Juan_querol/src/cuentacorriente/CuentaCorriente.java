package cuentacorriente;

public class CuentaCorriente {
	private String saldo;
	
	public CuentaCorriente() {
		this.saldo="0";
	}

	public String getSaldo() {
		return saldo;
	}
	public void imposiciones(int x) {
		int num = Integer.parseInt(saldo);
		num = num + x;
		saldo = String.valueOf(num);
	}
	public void reintegros(int x) {
		int num = Integer.parseInt(saldo);
		num = num - x;
		saldo = String.valueOf(num);
	}
}
