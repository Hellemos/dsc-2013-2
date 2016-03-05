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

Cadastro de Novo Livro<br>
<h:form>
		<h:panelGrid border="1" columns="2">
			<h:outputLabel value="Título:"></h:outputLabel>
			
				<h:inputText value="#{livroMB.titulo}"></h:inputText>
		
			<h:outputLabel value="ISBN:"></h:outputLabel>
		
				<h:inputText value="#{livroMB.isbn}"></h:inputText>
			<h:outputLabel value="Autor:"></h:outputLabel>
			
				<h:inputText value="#{livroMB.autor}"></h:inputText>
			<h:outputLabel value="Editora:"></h:outputLabel>
			
				<h:inputText value="#{livroMB.editora}"></h:inputText>
			<h:outputLabel value="Ano de publicação:"></h:outputLabel>
				<h:inputText value="#{livroMB.ano}"></h:inputText>

		</h:panelGrid>
			<h:commandButton value="Cadastrar Livro" action="#{livroMB.cadastrarLivro}"></h:commandButton>
		</h:form><br>
	</f:view>
</body>
</html>