<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Teste de Transferência entre Contas</title>
</head>
<body>
<h2>Teste de Transferência entre Contas</h2>
<f:view>

		<h:form>
			<h:panelGrid border="1" columns="2">
				<h:outputText value="Número da conta de origem: "></h:outputText>
				<h:inputText value="#{transferenciaMB.contaOrigem}"></h:inputText>
				<h:outputText value="Número da conta de destino: "></h:outputText>
				<h:inputText value="#{transferenciaMB.contaDestino}"></h:inputText>
				<h:outputText value="Valor a ser transferido: "></h:outputText>
				<h:inputText value="#{transferenciaMB.valor}"></h:inputText>
				<h:commandButton value="Efetuar transferência" action="#{transferenciaMB.efetuarTransferencia}"></h:commandButton>
				
			</h:panelGrid>
		</h:form>

<hr/>		
<h2>Estado das Contas no Banco</h2>

			<h:dataTable border="1" value="#{transferenciaMB.contas}" var="conta">
				<h:column id="column1">
					<f:facet name="header">
						<h:outputText value="Número"></h:outputText>
					</f:facet>
					<h:outputText value="#{conta.numero}"/> 
				</h:column>
				<h:column id="column2">
					<f:facet name="header">
						<h:outputText value="Saldo"></h:outputText>
					</f:facet>
					<h:outputText value="#{conta.saldo}"/>
				</h:column>
				<h:column id="column3">
					<f:facet name="header">
						<h:outputText value="Titular"></h:outputText>
					</f:facet>
					<h:outputText value="#{conta.titular}"/>
				</h:column>
			</h:dataTable>
		
	</f:view>
</body>
</html>