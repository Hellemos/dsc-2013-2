package exemplo.loja.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Fornecedor implements Serializable {
	private static final long serialVersionUID = -7574312198049043822L;
	private int id;
	private String nome;
	private String pessoaDeContato;
	private String telefone;
	private Set<Produto> produtos;
	
	public Fornecedor() {
		super();
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getPessoaDeContato() {
		return pessoaDeContato;
	}
	public void setPessoaDeContato(String pessoaDeContato) {
		this.pessoaDeContato = pessoaDeContato;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	@ManyToMany
	public Set<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(Set<Produto> produtos) {
		this.produtos = produtos;
	}
}
