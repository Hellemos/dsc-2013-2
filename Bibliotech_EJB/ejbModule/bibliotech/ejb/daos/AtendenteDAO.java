package bibliotech.ejb.daos;

import java.util.List;

import javax.ejb.Remote;

import bibliotech.entities.Atendente;

@Remote
public interface AtendenteDAO {
	public void create(Atendente novo);
	public List<Atendente> getAtendentes();
	public Atendente getAtendente(int id);
	public void update(Atendente atendente);
	public void delete(Atendente atendente);
}
