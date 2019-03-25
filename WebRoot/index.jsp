<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script type="text/javascript" src="./sndFundList.js"></script>
<html>
<head>
    <title>My JSP 'index.jsp' starting page</title>
    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->
</head>

<body>
<form action="${pageContext.request.contextPath}/test" method="get">
    <input type="submit" value="搜索">
</form>


<table>
    <tr>

        <td>
            <a id="loanCancelBtn"
               data-options="iconCls:'icon-ok'" onclick="loanCancelBtn()">取消贷款</a>
        </td>

        <td>
            <a id="twoLoanoanlBtn"
               data-options="iconCls:'icon-ok'" onclick="twoLoanoanlBtn()">二次放款</a>
        </td>
    </tr>
</table>


</body>
</html>
