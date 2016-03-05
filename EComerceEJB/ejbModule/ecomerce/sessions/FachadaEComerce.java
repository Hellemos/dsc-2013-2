package ecomerce.sessions;

import javax.ejb.Remote;

@Remote
public interface FachadaEComerce {
	public void finalizaVenda(String produto, String quantidade, String valor, 
							  String cliente, String endereco);
}
