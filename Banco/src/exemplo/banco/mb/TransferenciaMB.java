package exemplo.banco.mb;

import java.util.List;

import javax.ejb.EJB;

import exemplo.banco.FachadaBanco;
import exemplo.banco.entidades.Conta;

public class TransferenciaMB {
	private int contaOrigem;
	private int contaDestino;
	private double valor;
	
	private List<Conta> contas;
	
	@EJB
	FachadaBanco fachada;
	
	public TransferenciaMB() {
		super();
	}

	public int getContaOrigem() {
		return contaOrigem;
	}

	public void setContaOrigem(int contaOrigem) {
		this.contaOrigem = contaOrigem;
	}

	public int getContaDestino() {
		return contaDestino;
	}

	public void setContaDestino(int contaDestino) {
		this.contaDestino = contaDestino;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String efetuarTransferencia() {
		fachada.transferencia(this.contaOrigem, this.contaDestino, this.valor);
		return "ok";
	}

	public List<Conta> getContas() {
		contas = fachada.getContas();
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
}
