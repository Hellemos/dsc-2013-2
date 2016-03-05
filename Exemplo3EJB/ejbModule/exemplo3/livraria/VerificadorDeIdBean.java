package exemplo3.livraria;

import javax.ejb.Stateless;

/**
 * Session Bean implementation class VerificadorDeIdBean
 */
@Stateless
public class VerificadorDeIdBean implements VerificadorDeId {

    /**
     * Default constructor. 
     */
    public VerificadorDeIdBean() {
    }

	@Override
	public boolean verificarId(String id) {
		if (id.equals("123") || id.equals("999")) {
			return true;
		}
		return false;
	}

}
