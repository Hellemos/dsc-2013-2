package ecomerce.mbeans;

import javax.ejb.EJB;

import ecomerce.sessions.FachadaEComerce;

public class VendaMB {
	private String produto;
	private String quantidade;
	private String valor;
	private String cliente;
	private String endereco;
	
	@EJB
	private FachadaEComerce fachada;
	
	public VendaMB() {
		super();
	}

	public String getProduto() {
		return produto;
	}

	public void setProduto(String produto) {
		this.produto = produto;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}

	public String getValor() {
		return valor;
	}

	public void setValor(String valor) {
		this.valor = valor;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	

	public String finalizaVenda() {
		fachada.finalizaVenda(produto, quantidade, valor, cliente, endereco);
		return "ok";
	}
}
