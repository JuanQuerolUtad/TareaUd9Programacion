package cuentacorriente;

public class PruebaCuentaCorriente {

	public static void main(String[] args) {
		CuentaCorriente cc = new CuentaCorriente();
		cc.imposiciones(200);
		cc.reintegros(300);
		System.out.println(cc.getSaldo());

	}

}
