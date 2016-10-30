<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>  
<%  
String path = request.getContextPath();  
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";  
%>  
<%@ taglib uri="/struts-tags" prefix="s" %>  
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">  
<html>  
  <head>  
    <base href="<%=basePath%>">  
    <title>保存商品</title>  
    <meta http-equiv="pragma" content="no-cache">  
    <meta http-equiv="cache-control" content="no-cache">  
    <meta http-equiv="expires" content="0">      
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">  
    <meta http-equiv="description" content="This is my page">  
  </head>  
  <body>  
    <s:form action="#" method="post" theme="simple" namespace="/">  
        <table border="1" width="400">  
            <tr>  
                <td>商品的名称</td>  
                <td><s:textfield name="pname"/></td>  
            </tr>  
            <tr>  
                <td>商品的价格</td>  
                <td><s:textfield name="price"/></td>  
            </tr>  
            <tr>  
                <td colspan="2"><input type="submit" value="添加"/></td>  
            </tr>  
        </table>  
    </s:form>  
  </body>  
</html>  