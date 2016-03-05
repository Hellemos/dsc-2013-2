package ecomerce.sessions;

import javax.annotation.Resource;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.jms.JMSContext;
import javax.jms.Queue;
import javax.jms.TextMessage;

/**
 * Session Bean implementation class FachadaEComerceBean
 */
@Stateless
public class FachadaEComerceBean implements FachadaEComerce {

	@Resource(lookup="jms/estoqueQueue")
	Queue estoque;
	//@Resource(lookup="jms/logisticaQueue")
	//Queue logistica;
	//@Resource(lookup="jms/faturamentoQueue")
	//Queue faturamento;
	
	@Inject
	JMSContext context;
	
    /**
     * Default constructor. 
     */
    public FachadaEComerceBean() {
    }

	@Override
	public void finalizaVenda(String produto, String quantidade, String valor,
						 	  String cliente, String endereco) {
		TextMessage msg1 = context.createTextMessage("produto="+produto+"; quantidade="+quantidade);
		context.createProducer().send(estoque, msg1);
		
		//TextMessage msg2 = context.createTextMessage("produto="+produto+"; quantidade="+quantidade+"; cliente="+cliente+"; endereco="+endereco);
		//context.createProducer().send(logistica, msg2);
		
		//TextMessage msg3 = context.createTextMessage("produto="+produto+"; quantidade="+quantidade+"; valor="+valor+"; cliente="+cliente);
		//context.createProducer().send(faturamento, msg3);	
	}

}
