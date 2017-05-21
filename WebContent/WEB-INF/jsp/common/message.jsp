<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%
	List<String> msgList = (List<String>)request.getAttribute("msgList");
	if(msgList != null) {
		for(String msg : msgList) {
%>
<span style="color:red;"><%=msg %></span><br>
<%
		}
	}
%>