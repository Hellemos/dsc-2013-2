package exemplo3.contador;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Lock;
import javax.ejb.LockType;
import javax.ejb.Singleton;
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;

/**
 * Session Bean implementation class ContadorBean
 */
@Singleton
@LocalBean
@TransactionManagement(TransactionManagementType.CONTAINER)
public class ContadorBean {

	private int hints;

    /**
     * Default constructor. 
     */
    public ContadorBean() {
    }

    @PostConstruct
    public void init() {
    	hints = 1;
    }
    
    @Lock(LockType.WRITE)
    public int getHints() {
    	return hints++;
    }
}
