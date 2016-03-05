package bibliotech.ejb.daos;

import java.util.List;

import javax.ejb.Remote;

import bibliotech.entities.Emprestimo;

@Remote
public interface EmprestimoDAO {
	public void create(Emprestimo novo);
	public List<Emprestimo> getEmprestimos();
	public Emprestimo getEmprestimo(int id);
	public void update(Emprestimo emprestimo);
	public void delete(Emprestimo emprestimo);
}
