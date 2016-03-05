mpackage exemplo.banco.entidades;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name="findByNumero", query="SELECT c FROM Conta c WHERE c.numero = :numero"),
	@NamedQuery(name="findAll", query="SELECT c FROM Conta c ORDER BY c.numero")
})
public class Conta implements Serializable {
	private static final long serialVersionUID = -7675215219145494122L;
	private int id;
	private int numero;
	private String titular;
	private double saldo;
	
	public Conta() {
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

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(double valor) {
		if (this.saldo >= valor) {
			saldo -= valor;
			return true;
		}
		return false;
	}

	public boolean depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			return true;
		}
		return false;
	}

}
