<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <h2>Página inicial do Portal de Conversas</h2>
    <p>Bem vindo, ${usuarioLogado}</p>
    <img src="getImage?login=${usuarioLogado}" /><br>
    <a href="telaChat">Clique aqui</a> para acessar a tela de Chat<br>
    <a href="logout">Sair do sistema</a>
    
</body>
</html>