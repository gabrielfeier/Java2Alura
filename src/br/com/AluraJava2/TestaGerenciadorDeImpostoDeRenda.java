package br.com.AluraJava2;

public class TestaGerenciadorDeImpostoDeRenda {
	public static void main(String[] args){
		GerenciadorDeImpostoDeRenda g = new GerenciadorDeImpostoDeRenda();
		
		SeguroDeVida sv = new SeguroDeVida();
		g.adiciona(sv);
		
		ContaCorrente cc = new ContaCorrente();
		cc.depositaSaldo(500);
		g.adiciona(cc);
		
		System.out.println(g.getTotal());
		
		System.out.printf("O saldo é: %.2f", cc.getSaldo());
	}
	
}
