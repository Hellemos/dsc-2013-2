package exemplo3.livraria;

import java.util.List;

import javax.ejb.Remote;

@Remote
public interface Cart {
	public	void	initialize(String	person)	throws Exception;	
	public	void	initialize(String	person,	String	id)	 throws	Exception;	
	public	void	addBook(String	title);	
	public	void	removeBook(String	title)	throws	Exception;	
	public	List<String>	getContents();	
	public	void	remove();
}
