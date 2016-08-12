package br.com.AluraJava2;

public class TesteConta {

	public static void main(String[] args) {
		ContaCorrente cc = new ContaCorrente();
		try{
		cc.depositaSaldo(-100);
		} catch(IllegalArgumentException e) {
			System.out.println("valor menor que 0");
		}

	}

}
