package exemplo.loja.estoque;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import exemplo.loja.model.Produto;

/**
 * Session Bean implementation class FachadaEstoqueBean
 */
@Stateless
public class FachadaEstoqueBean implements FachadaEstoque {

	@EJB
	private ProdutoDAO produtoDAO;
	
    /**
     * Default constructor. 
     */
    public FachadaEstoqueBean() {
    }

	@Override
	public List<Produto> getProdutos() {
		return produtoDAO.getProdutos();
	}
    
    
}
