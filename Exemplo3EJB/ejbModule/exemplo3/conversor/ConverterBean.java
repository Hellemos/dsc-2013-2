package exemplo3.conversor;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class ConverterBean
 */
@Stateless
@LocalBean
public class ConverterBean {

	/**
	 * Default constructor. 
	 */
	public ConverterBean() {
	}

	private	Double	yenRate	=	new	Double("83.0602");	
	private	Double	euroRate	=	new	Double("0.0093016");	
	public	Double	dollarToYen(Double	dollars)	{	
		Double	result	=	dollars * yenRate;	
		return	result;	
	}	
	public	Double	yenToEuro(Double	yen)	{	
		Double	result	=	yen * euroRate;	
		return	result;	
	}

}
