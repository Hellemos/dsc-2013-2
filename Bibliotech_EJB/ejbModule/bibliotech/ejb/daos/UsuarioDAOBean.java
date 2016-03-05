package bibliotech.ejb.daos;

import java.util.List;

import javax.ejb.Stateless;

import bibliotech.entities.Livro;
import bibliotech.entities.Usuario;

/**
 * Session Bean implementation class UsuarioDAOBean
 */
@Stateless
public class UsuarioDAOBean implements UsuarioDAO {

    /**
     * Default constructor. 
     */
    public UsuarioDAOBean() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public void create(Usuario novo) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Usuario> getUsuario() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Livro getUsuario(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Usuario usuario) {
		// TODO Auto-generated method stub
		
	}

}
