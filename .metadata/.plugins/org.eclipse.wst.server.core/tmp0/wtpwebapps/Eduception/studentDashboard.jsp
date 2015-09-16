<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f"  uri="http://java.sun.com/jsf/core"%>
<%@ taglib prefix="h"  uri="http://java.sun.com/jsf/html"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="utf-8" />
	<title>Profile Details</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
</head>
<body class="blurBg-true" style="background-color:#EBEBEB">

<link rel="stylesheet" href="files/formoid1/formoid-solid-blue.css" type="text/css" />
<script type="text/javascript" src="editstudentprofile_files/formoid1/jquery.min.js"></script>


<f:view>
<h:form enctype="multipart/form-data" styleClass="formoid-solid-blue" style="background-color:#FFFFFF;font-size:14px;font-family:'Roboto',Arial,Helvetica,sans-serif;color:#34495E;max-width:1000px;min-width:600px">
<div class="title"><h2>Profile Details</h2></div>
Welcome : <h:outputLabel value="#{controller.userBean.name}"></h:outputLabel>
<%
String htmlFlush = session.getAttribute("htmlFlush").toString();
%>
<%= htmlFlush %>
<!--  response.getWriter().write(controller.userBean.name);
response.getWriter().flush();
-->
</h:form>

</f:view>
</body>
</html>