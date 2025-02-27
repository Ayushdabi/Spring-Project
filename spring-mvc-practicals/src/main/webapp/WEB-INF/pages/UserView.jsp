
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="sf"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="s"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
.error {
	color: red;
	font-weight: bold;
	font-size: 16px;
}
</style>
</head>
<body>
	<sf:form method="post" modelAttribute="form">
		<div align="center">
			<c:if test="${form.id>0}">
				<h1 style="color: navy">Update User</h1>
			</c:if>
			<c:if test="${form.id==0}">
				<h1 style="color: navy">Add User</h1>
			</c:if>
			<table>
				<tr>
					<th align="left">First Name :</th>
					<td><sf:input path="firstName" /></td>
					<td><sf:errors path="firstName" cssClass="error"></sf:errors></td>
				</tr>
				<tr>
					<th align="left">Last Name :</th>
					<td><sf:input path="lastName" /></td>
					<td><sf:errors path="lastName" cssClass="error"></sf:errors></td>
				</tr>
				<tr>
					<th align="left">Login ID :</th>
					<td><sf:input path="login" /></td>
					<td><sf:errors path="login" cssClass="error"></sf:errors></td>
				</tr>
				<tr>
					<th align="left">Password :</th>
					<td><sf:input path="password" /></td>
					<td><sf:errors path="password" cssClass="error"></sf:errors></td>
				</tr>
				<tr>
					<th align="left">Date Of Birth :</th>
					<td><sf:input path="dob" /></td>
					<td><sf:errors path="dob" cssClass="error"></sf:errors></td>
				</tr>
				<tr>
					<th align="left">Address :</th>
					<td><sf:input path="address" /></td>
					<td><sf:errors path="address" cssClass="error"></sf:errors></td>
				</tr>
				<tr>
					<th></th>
					<td><input type="submit" name="operation" value="save"></td>
				</tr>
			</table>
		</div>
	</sf:form>
</body>
</html>
