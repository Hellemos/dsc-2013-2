package exemplo3.conversor;

import javax.ejb.EJB;

public class ConversorMB {
	public ConversorMB() {
		super();
	}
	private String valorEmDollar;
	
	@EJB
	ConverterBean conversor;
	
}
