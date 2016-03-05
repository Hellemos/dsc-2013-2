package bibliotech.ejb.daos;

import java.util.List;

import javax.ejb.Remote;

import bibliotech.entities.Livro;

@Remote
public interface LivroDAO {
	public void create(Livro novo);
	public List<Livro> getLivros();
	public Livro getLivro(int id);
	public void update(Livro livro);
	public void delete(Livro livro);
}
