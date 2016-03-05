package exemplo.loja.mbean;

import java.util.List;

import javax.ejb.EJB;

import exemplo.loja.estoque.FachadaEstoque;
import exemplo.loja.model.Produto;

public class ProdutosMB {
	private List<Produto> produtos;	
	@EJB
	private FachadaEstoque estoque;

	public ProdutosMB() {
		super();
	}

	public List<Produto> getProdutos() {
		this.produtos = estoque.getProdutos(); 
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
}
