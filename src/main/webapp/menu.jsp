<%@ page import="com.gam.restaurant.model.to.Food" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: MohammadReza
  Date: 5/18/2018
  Time: 11:26 AM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>



<form action="/foodRegister">
    <%--<c:forEach items="${requestScope.errors}" var="error">
        <p style="background-color:#ff0100"> ${error.errorCode}</p>
    </c:forEach>--%>


    <h2>Food Name</h2>
    <input type="text" name="foodName" >
    <h2>Price</h2>
    <input type="number" name="price">
    <h2>Description</h2>
    <input type="text" name="description">
    <h2>Calories</h2>
    <input type="number" name="calories">


    <h2>Meal Category</h2>
    <select name="mealCategory">
        <option value="dropdown">Pls select one
        <option value="MAIN_COURCE">MainCource
        <option value="DESSERT">Dessert
        <option value="APPETIZER">Appetizer
    </select>
    <h2>Cuisine</h2>
    <select name="Cuisine">
        <option value="dropdown">Pls select one
        <option value="IRANIN">Iranian
        <option value="ARABIC">Arabic
        <option value="INDIAN">Indian
    </select>

    <input type="submit" value="submit">
</form>


<table border="2" width="100%">

    <tr>
        <td>ID</td>
        <td>Food Name</td>
        <td>Price</td>
        <td>Description</td>
        <td>Calories</td>
        <td>Meal Category</td>
        <td>Cuisine</td>
        <td>UPDATE</td>
        <td>DELETE</td>
    </tr>


    <c:if test="${requestScope.foodList!=null}">
        <c:forEach items="${requestScope.foodList}" var="s">





    <%--<%

        List<Food> foodList= (List<Food>) request.getAttribute("foodList");
        for (Food food : foodList){

    %>--%>
    <tr>
        <form action="/update.do">
            <td>
                <input type="text" style="width:100%"  readonly name="id" value="<%--<%=food.getId()%>--%>" >
            </td>
            <td>
                <input type="text" style="width:100%" name="name" value=<%--<%=food.getName()%>--%>"${s.name}" >
            </td>
            <td>
                <input type="text"  style="width:100%" name="family" value="<%--<%=person.getFamily()%>--%><%--${p.family}--%>" >
            </td>
            <td>
                <input type="submit" style="width:100%" value="تغییر"/>
            </td>
        </form>
        <td><input type="button" style="width:100%" value="حذف" onclick="window.location='remove.do?id=<%--<%=person.getId()'%>--%><%--${p.id}'--%>"></td>
    </tr>


   </c:forEach>
   </c:if>


</table>

</body>

</html>


