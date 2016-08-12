package br.com.AluraJava2;

public class TestaTributavel {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		cc.depositaSaldo(500);
		System.out.println(cc.calculaTributos());
		
		Tributavel tt = cc;
		

	}

}
