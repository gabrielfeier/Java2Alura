package br.com.AluraJava2;

public abstract class Conta {
	protected double saldo;

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void sacaSaldo(double valor){
		if(this.saldo > valor){
			this.saldo -= valor;
		}else{
			System.out.println("Valor inválido");
		}
	}
	
	public void depositaSaldo (double valor){
		if (valor < 0) {
            throw new IllegalArgumentException();
        } else {
            this.saldo += valor;        
        }  
	}
	
	public abstract void atualiza(double taxa);
}
