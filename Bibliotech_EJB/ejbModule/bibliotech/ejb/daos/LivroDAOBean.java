package bibliotech.ejb.daos;

import java.util.List;

import javax.ejb.Stateless;

import bibliotech.entities.Livro;

/**
 * Session Bean implementation class LivroDAOBean
 */
@Stateless
public class LivroDAOBean implements LivroDAO {

    /**
     * Default constructor. 
     */
    public LivroDAOBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void create(Livro novo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Livro> getLivros() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livro getLivro(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Livro livro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Livro livro) {
		// TODO Auto-generated method stub
		
	}

}
