package exemplo3.livraria;

import javax.ejb.Remote;

@Remote
public interface VerificadorDeId {
	public boolean verificarId(String id);
}	
