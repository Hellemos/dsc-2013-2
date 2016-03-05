package exemplo.banco;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

import exemplo.banco.dao.ContaDAO;
import exemplo.banco.entidades.Conta;

/**
 * Session Bean implementation class FachadaBancoBean
 */
@Stateless
public class FachadaBancoBean implements FachadaBanco {
	
	@EJB
	ContaDAO contaDAO;

    /**
     * Default constructor. 
     */
    public FachadaBancoBean() {
    }

	@Override
	public void sacar(int numConta, double valor) {
		Conta conta = contaDAO.findByNumero(numConta);
		if (conta != null) {
			System.err.println("saque ["+conta.sacar(valor)+"] - saldo = R$ "+conta.getSaldo()); 
			contaDAO.atualizarConta(conta);
		}
	}

	@Override
	public void depoistar(int numConta, double valor) {
		Conta conta = contaDAO.findByNumero(numConta);
		if (conta != null) {
			@SuppressWarnings("unused")
			double val = valor / (10 - 10);
			System.err.println("deposito ["+conta.depositar(valor)+"] - saldo = R$ "+conta.getSaldo());
			contaDAO.atualizarConta(conta);
		}
	}

	@Override
	@TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
	public void transferencia(int numContaOrigem, int numContaDestino, double valor) {
		System.err.println("efetuando a transferência...");
		this.sacar(numContaOrigem, valor);
		this.depoistar(numContaDestino, valor);
		System.err.println("transferência ok...");
	}

	@Override
	public List<Conta> getContas() {
		return contaDAO.getContas();
	}

}
