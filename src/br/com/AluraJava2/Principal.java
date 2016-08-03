package br.com.AluraJava2;

public class Principal {

	public static void main(String[] args) {
		Conta c = new ContaCorrente();
		Conta cc = new ContaCorrente();
		Conta cp = new ContaPoupança();

		c.depositaSaldo(1000);
		cc.depositaSaldo(1000);
		cp.depositaSaldo(1000);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo Total: " + adc.getsaldoTotal());

	}
}
