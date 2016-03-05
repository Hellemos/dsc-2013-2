package exemplo.loja.estoque;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import exemplo.loja.model.Produto;

/**
 * Session Bean implementation class ProdutoDAOBean
 */
@Stateless
public class ProdutoDAOBean implements ProdutoDAO {

	@PersistenceContext(unitName="LojaEJB")
	private EntityManager em;
	
    /**
     * Default constructor. 
     */
    public ProdutoDAOBean() {
    }

	@SuppressWarnings("unchecked")
	@Override
	public List<Produto> getProdutos() {
		Query query = em.createQuery("SELECT p FROM Produto p");
		return query.getResultList();
	}

}
