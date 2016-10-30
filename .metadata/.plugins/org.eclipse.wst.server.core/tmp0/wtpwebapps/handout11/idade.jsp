<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>idade.jsp</title>
</head>
<body>

<jsp:useBean id="dao" class="handout11.DAO"/>

<table border="1">
<tr>
<td><b>#</b></td>
<td><b>nome</b></td>
<td><b>data nascimento</b></td>
<td><b>altura</b></td>
<td><b>tipo de altura</b></td>
</tr>
<c:forEach var="pessoa" items="${dao.lista}" varStatus="id">
<tr bgcolor="#%{id.count%2 == 0 ? 'bbffcc' : 'ffffbb' }" >
<td>${id.count}</td>
<td>${pessoa.nome}</td>
<td><fmt:formatDate value="${pessoa.nascimento.time}" pattern="yyyy/MM/dd"/></td>
<td>${pessoa.altura}</td>
<td>${pessoa.altura < 1.0 ? "baixo" : "alto"}</td>

</tr>
</c:forEach>
</table>

</body>
</html>