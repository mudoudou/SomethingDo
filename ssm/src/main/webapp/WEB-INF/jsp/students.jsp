<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" import="com.pan.po.*"%>
<%@ page language="java" import="java.util.*"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>查询学生列表</title>
<script type="text/javascript">


</script>
</head>

<body>
   
  
  <br/>
        学生列表：
        <table width="60%" border=1>
            <tr>
                <td>姓名</td>
                <td>年龄</td>
                <td>地址</td>
            </tr>
            <c:forEach items="${students}" var="item">
                <tr>
                    <td>${item.name}</td>
                    <td>${item.age}</td>
                    <td>${item.address }</td>

                </tr>
            </c:forEach>

        </table>
   
</body>

</html>