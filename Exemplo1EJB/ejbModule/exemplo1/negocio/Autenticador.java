package exemplo1.negocio;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class Autenticador
 */
@Stateless
@LocalBean
public class Autenticador {

	private String[] login = {"adm","joap","jose"};
	private String[] senha = {"123","senha","pass"};
    
	
    /**
     * Default constructor. 
     */
    public Autenticador() {
        
    }
    
    public boolean autenticar(String login, String senha) {
    	for (int i = 0; i < 3; i++) {
    		if ( this.login[i].equals(login) && this.senha[i].equals(senha) ) {
    			return true;
    		}
    	}
    	return false;
    }

}
