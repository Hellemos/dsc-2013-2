package ecomerce.destinations;

import javax.ejb.ActivationConfigProperty;
import javax.ejb.MessageDriven;
import javax.jms.JMSDestinationDefinition;
import javax.jms.JMSDestinationDefinitions;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;


@JMSDestinationDefinitions({
	@JMSDestinationDefinition(name="jms/estoqueQueue", 
							  interfaceName="javax.jms.Queue", 
							  destinationName="FilaEstoque")
})


@MessageDriven(activationConfig={
		@ActivationConfigProperty(propertyName="destinationLookup",propertyValue="jms/estoqueQueue"),
		@ActivationConfigProperty(propertyName="destinationType",propertyValue="javax.jms.Queue")
})
public class EstoqueMDB implements MessageListener {

	public EstoqueMDB() {
		super();
	}
	
	@Override
	public void onMessage(Message message) {
		try {
			if (message instanceof TextMessage) {
				String texto = message.getBody(String.class);
				System.err.println("Mensagem recebida: "+texto);
			}
		} catch (JMSException jmsex) {
			System.err.println("Erro: "+jmsex.getMessage());
		}
	}

}
