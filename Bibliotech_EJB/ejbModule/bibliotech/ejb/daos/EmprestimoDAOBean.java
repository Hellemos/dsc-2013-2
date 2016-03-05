package bibliotech.ejb.daos;

import java.util.List;

import javax.ejb.Stateless;

import bibliotech.entities.Emprestimo;

/**
 * Session Bean implementation class EmprestimoDAOBean
 */
@Stateless
public class EmprestimoDAOBean implements EmprestimoDAO {

    /**
     * Default constructor. 
     */
    public EmprestimoDAOBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void create(Emprestimo novo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Emprestimo> getEmprestimos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Emprestimo getEmprestimo(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Emprestimo emprestimo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Emprestimo emprestimo) {
		// TODO Auto-generated method stub
		
	}

}
