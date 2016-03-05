package exemplo.banco.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.SynchronizationType;

import exemplo.banco.entidades.Conta;

/**
 * Session Bean implementation class ContaDAOBean
 */

@Stateless
public class ContaDAOBean implements ContaDAO {
	
	@PersistenceContext(unitName="BancoEJB", synchronization=SynchronizationType.SYNCHRONIZED)
	private EntityManager em;

    /**
     * Default constructor. 
     */
    public ContaDAOBean() {
    }

	@Override
	public void criarConta(Conta conta) {
		em.persist(conta);
	}

	@Override
	public void atualizarConta(Conta conta) {
		em.merge(conta);
	}

	@Override
	public Conta findByNumero(int numero) {
		Query query = em.createNamedQuery("findByNumero");
		query.setParameter("numero", numero);
		Conta conta = (Conta) query.getSingleResult();
		return conta;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Conta> getContas() {
		Query query = em.createNamedQuery("findAll");
		return query.getResultList();
	}

}
