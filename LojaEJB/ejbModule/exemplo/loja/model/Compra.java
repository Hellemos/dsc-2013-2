package exemplo.loja.model;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.*;

@Entity

public class Compra implements Serializable {
	private int id;
	private Calendar data;
	private Cliente cliente;
	private static final long serialVersionUID = 1L;

	public Compra() {
		super();
	}   
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}   
	
	@Temporal(TemporalType.DATE)
	public Calendar getData() {
		return this.data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	@ManyToOne(optional=false)
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
   
}
