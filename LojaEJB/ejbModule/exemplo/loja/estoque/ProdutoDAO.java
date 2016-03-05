package exemplo.loja.estoque;

import java.util.List;

import javax.ejb.Remote;

import exemplo.loja.model.Produto;

@Remote
public interface ProdutoDAO {
	public List<Produto> getProdutos();
}
