<html>
<body>
	<h2>SendGrid Using Java</h2>
	<form method="post">
		<table>
			<tbody>
			<tr>
				<td><h4>Email Body</h4></td>
				<td><textarea name="EmailTxt" rows="12" cols="40"></textarea></td>
			</tr>
			<tr>
				<td><h4>Email To</h4></td>
				<td><input type="email" name="to" required></td>
			</tr>
			<tr>
				<td></td>
				<td>
					<input formaction="textEmail" type="submit" value="Send Text Email">
					<input formaction="htmlEmail" type="submit" value="Send HTML Email">
					<input formaction="templateEmail" type="submit" value="Send Template Email">
				</td>
			</tr>
			<tr>
				<td></td>
			</tr>
			</tbody>
		</table>
	</form>
	<h1 style="color:green;">${status}</h1>
	<h5 style="red;">${msg}</h5>
</body>
</html>
