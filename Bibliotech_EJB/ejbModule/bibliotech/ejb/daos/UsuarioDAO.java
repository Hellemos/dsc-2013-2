package bibliotech.ejb.daos;

import java.util.List;

import javax.ejb.Remote;

import bibliotech.entities.Livro;
import bibliotech.entities.Usuario;

@Remote
public interface UsuarioDAO {
	public void create(Usuario novo);
	public List<Usuario> getUsuario();
	public Livro getUsuario(int id);
	public void update(Usuario usuario);
	public void delete(Usuario usuario);
}
