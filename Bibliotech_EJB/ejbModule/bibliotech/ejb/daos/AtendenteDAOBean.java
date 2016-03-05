package bibliotech.ejb.daos;

import java.util.List;

import javax.ejb.Stateless;

import bibliotech.entities.Atendente;

/**
 * Session Bean implementation class AtendenteDAOBean
 */
@Stateless
public class AtendenteDAOBean implements AtendenteDAO {

    /**
     * Default constructor. 
     */
    public AtendenteDAOBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void create(Atendente novo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Atendente> getAtendentes() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Atendente getAtendente(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Atendente atendente) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Atendente atendente) {
		// TODO Auto-generated method stub
		
	}

}
