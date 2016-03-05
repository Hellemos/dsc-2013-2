package biblio.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import biblio.model.Livro;

/**
 * Session Bean implementation class LivroDAOBean
 */
@Stateless
public class LivroDAOBean implements LivroDAO {

	@PersistenceContext(unitName="biblio")
	private EntityManager em;


	public LivroDAOBean() {
	}

	@Override
	public void insereLivro(Livro livro) {
		em.persist(livro);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Livro> getLivros() {
		Query query = em.createNamedQuery("listaLivros");
		return query.getResultList();
	}

	@Override
	public Livro getLivroById(int id) {
		Query query = em.createNamedQuery("findLivroById");
		return (Livro) query.getSingleResult();
	}

}
