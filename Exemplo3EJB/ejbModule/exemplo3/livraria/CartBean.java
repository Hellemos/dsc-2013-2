package exemplo3.livraria;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Remove;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class CartBean
 */
@Stateless
public class CartBean implements Cart {
	
	@EJB
	VerificadorDeId verificador;
	
	private String customerName;	
	private String customerId;	
	private List<String> contents;	


    /**
     * Default constructor. 
     */
    public CartBean() {
       
    }

	@Override
	public void initialize(String person) throws Exception {
		if (person == null) {
			throw new Exception("Precisa do nome de um usuário");
 		} else {
 			customerName = person;
 		}
		customerId = "0";
		contents = new ArrayList<String>();
	}
	

	@Override
	public void initialize(String person, String id) throws Exception {
		if (person == null) {
			throw new Exception("Precisa do nome de um usuário");
 		} else {
 			customerName = person;
 		}
		
		if (verificador.verificarId(id)) {
			customerId = id;
		} else {
			throw new Exception("Identificador inválido: "+ id);
		}
		
		contents = new ArrayList<String>();
		
	}

	@Override
	public void addBook(String title) {
		contents.add(title);
	}

	@Override
	public void removeBook(String title) throws Exception {
		boolean removeu = contents.remove(title);
		if (!removeu) {
			throw new Exception("Não existe tal livro: "+title);
		}
	}

	@Override
	public List<String> getContents() {
		return contents;
	}

	@Override
	@Remove
	public void remove() {
		contents = null;
	}
    
}
