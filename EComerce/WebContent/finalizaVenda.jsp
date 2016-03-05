<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Finaliza Venda de Produto</h2>
<f:view>

		<h:form>
			<h:panelGrid border="1" columns="2">
				<h:outputText value="Produto"></h:outputText>
				<h:inputText value="#{venda.produto}"></h:inputText>
				<h:outputText value="Quantidade"></h:outputText>
				<h:inputText value="#{venda.quantidade}"></h:inputText>
				<h:outputText value="Valor"></h:outputText>
				<h:inputText value="#{venda.valor}"></h:inputText>
				<h:outputText value="Cliente"></h:outputText>
				<h:inputText value="#{venda.cliente}"></h:inputText>
				<h:outputText value="Endere�o"></h:outputText>
				<h:inputText value="#{venda.endereco}"></h:inputText>
			</h:panelGrid>
			<h:commandButton value="Finalizar a Venda" action="#{venda.finalizaVenda}"></h:commandButton>
		</h:form>
	</f:view>
</body>
</html>