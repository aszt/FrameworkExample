<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>List</title>
</head>
<body>
	<s:if
		test="#request.employees == null || #request.employees.size() == 0 ">
		没有任何员工信息
	</s:if>
	<s:else>
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<td>ID</td>
				<td>LASTNAME</td>
				<td>EMAIL</td>
				<td>BIRTH</td>
				<td>CREATETIME</td>
				<td>DEPT</td>
				<td>DELETE</td>
				<td>EDIT</td>
			</tr>

			<s:iterator value="#request.employees">
				<tr>
					<td>${id}</td>
					<td>${lastName}</td>
					<td>${email}</td>
					<td><s:date name="birth" format="yyyy-MM-dd" /></td>
					<td><s:date name="createTime" format="yyyy-MM-dd hh:mm:ss" />
					</td>
					<td>${department.departmentName}</td>
					<td><a href="emp-delete?id=${id}">Delete</a></td>
					<td><a href="emp-input?id=${id}">Edit</a></td>
				</tr>
			</s:iterator>
		</table>
	</s:else>
</body>
</html>