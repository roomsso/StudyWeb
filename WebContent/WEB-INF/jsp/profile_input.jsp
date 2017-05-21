<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="java.util.*" %>
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
		<h2>プロフィール入力</h2>
		<hr>
		<jsp:include page="common/message.jsp" />
		
		<form id="mainForm" action="/StudyWeb/profile/input/confirm" method="post">
		
		<div class="profilebox">
			<table id="profileTable">
				<tr>
					<td colspan="2">名前</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td colspan="2">性別</td>
					<td>
						<input type="radio" name="gender" value="1" id="gender_r1"><label for="gender_r1">男</label>&nbsp;
						<input type="radio" name="gender" value="2" id="gender_r2"><label for="gender_r2">女</label>
					</td>
				</tr>
				<tr>
					<td colspan="2">年齢</td>
					<td><input type="text" name="age" size="3"></td>
				</tr>
				<tr>
					<td>住所</td>
					<td>郵便番号</td>
					<td><input type="text" name="postalcode" size="10"></td>
				</tr>
				<tr>
					<td></td>
					<td>都道府県</td>
					<td>
						<select name="prefecture">
							<% 
								List<String> kenList = (List<String>) request.getAttribute("kenList");
								for(String ken : kenList) {
							%>
								<option value="<%=ken%>"><%=ken%></option>
							<% } %>
						</select>
					</td>
				</tr>
				<tr>
					<td></td>
					<td>市区町村</td>
					<td><input type="text" name="city"></td>
				</tr>
				<tr>
					<td></td>
					<td>番地</td>
					<td><input type="text" name="address"></td>
				</tr>
			</table>
		</div>
		<hr>
		<div class="operationBox">
			<button id="btnConfirm" class="operationBtn">確認</button>
		</div>
		</form>
	</div>
	<jsp:include page="common/footer.jsp" />
</div>

</body>
</html>