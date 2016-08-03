package br.com.AluraJava2;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        System.out.println("Saldo Anterior" + c.getSaldo());
        c.atualiza(this.selic);
        System.out.println("Saldo Atualizado:" + c.getSaldo());
        this.saldoTotal += c.getSaldo();        
        System.out.println(saldoTotal);
    }

    public double getsaldoTotal(){
    	return this.saldoTotal;
    }
}
