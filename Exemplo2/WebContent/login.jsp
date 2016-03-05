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

		<f:loadBundle basename="aplicacao.exemplo.mensagens" var="msg" />
		<h:form>
			<h:panelGrid border="1" columns="2">
				<h:outputText value="#{msg.login}"></h:outputText>
				<h:inputText value="#{loginBean.login}"></h:inputText>
				<h:outputText value="#{msg.senha}"></h:outputText>
				<h:inputSecret value="#{loginBean.senha}">
					<f:validator validatorId="aplicacao.exemplo.validatePassword"/>
				</h:inputSecret>
				
				
			</h:panelGrid>
			<h:commandButton value="#{msg.botaoLogin}" action="#{loginBean.autenticar}"></h:commandButton>
		</h:form></f:view>
</body>
</html>