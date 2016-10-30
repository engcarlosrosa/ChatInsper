<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Exemplo de JSP</title>
</head>
<body>
    <% String mensagem = "uma mensagem sendo inserida no html"; %>
    <% out.println(mensagem); %>
    <br />
    <% String mensagem2 = "outra forma de inserir texto"; %>
    <%= mensagem2 %>
    <br />
    <% System.out.println("Esse texto só aparece no console do Tomcat!"); %>
    <br />
    <% out.println("Você está conectando da porta:" + request.getRemotePort()); %>
</body>
</html>