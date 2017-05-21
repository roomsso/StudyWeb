<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*" %>
<%@ page import="profile.action.ProfileConfirmForm"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-type" content="text/html;charset=UTF-8"/>
<link rel="stylesheet" href="/StudyWeb/css/studyweb.css">
<title>ユーザー登録機能</title>
</head>
<body>

<div class="container">
	<jsp:include page="common/header.jsp" />
	<div class="mainbox">
		<h2>確認</h2>
		<hr>
		<%
			ProfileConfirmForm form = (ProfileConfirmForm)request.getAttribute("form");
		%>
		<div class="profilebox">
			<table id="profileTable" class="confirmTable">
				<tr>
					<th>名前</th>
					<td><%=form.getName() %></td>
				</tr>
				<tr>
					<th>性別</th>
					<td><%=form.getGender() %></td>
				</tr>
				<tr>
					<th>年齢</th>
					<td><%=form.getAge() %>歳</td>
				</tr>
				<tr>
					<th>住所</th>
					<td><%=form.getFullAddress() %></td>
				</tr>
			</table>
		</div>
		<div>
			<p>上記内容で登録します。</p>
		</div>
		<hr>
		<div class="operationBox">
			<button id="btnBack" class="operationBtn">戻る</button>
			<button id="btnRegist" class="operationBtn">登録</button>
		</div>
	</div>
	<jsp:include page="common/footer.jsp" />
</div>

</body>
</html>