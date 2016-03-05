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
<f:view>

Lista dos Produtos Cadastrados<br><br>
		<h:dataTable border="1" value="#{produtosMB.produtos}" var="produto">
			<h:column id="column1">
				<h:outputText value="#{produto.id}"></h:outputText>
				<f:facet name="header">
					<h:outputText value="Id"></h:outputText>
				</f:facet>
			</h:column>
			<h:column id="column2">
				<h:outputText value="#{produto.descricao}"></h:outputText>
				<f:facet name="header">
					<h:outputText value="Descrição"></h:outputText>
				</f:facet>
			</h:column>
			<h:column id="column3">
				<h:outputText value="#{produto.preco}"></h:outputText>
				<f:facet name="header">
					<h:outputText value="Preço"></h:outputText>
				</f:facet>
			</h:column>
			<h:column id="column4">
				<h:outputText value="#{produto.desconto}"></h:outputText>
				<f:facet name="header">
					<h:outputText value="Desconto"></h:outputText>
				</f:facet>
			</h:column>
		</h:dataTable>
	</f:view>
</body>
</html>