package exemplo.banco.dao;

import java.util.List;

import javax.ejb.Remote;

import exemplo.banco.entidades.Conta;

@Remote
public interface ContaDAO {
	public Conta findByNumero(int numero);
	public void criarConta(Conta conta);
	public void atualizarConta(Conta conta);
	public List<Conta> getContas();
}
