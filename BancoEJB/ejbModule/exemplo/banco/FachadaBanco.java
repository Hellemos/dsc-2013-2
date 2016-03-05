package exemplo.banco;

import java.util.List;

import javax.ejb.Remote;

import exemplo.banco.entidades.Conta;

@Remote
public interface FachadaBanco {
	public void sacar(int numConta, double valor);
	public void depoistar(int numConta, double valor);
	public void transferencia(int numContaOrigem, int numContaDestino, double valor);
	public List<Conta> getContas();
}
