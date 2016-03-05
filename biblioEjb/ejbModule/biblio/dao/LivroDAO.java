package biblio.dao;

import java.util.List;

import javax.ejb.Remote;

import biblio.model.Livro;

@Remote
public interface LivroDAO {
	public void insereLivro(Livro livro);
	public List<Livro> getLivros();
	public Livro getLivroById(int id);
}
