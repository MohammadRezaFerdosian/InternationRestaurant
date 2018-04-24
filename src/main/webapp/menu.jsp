<%--
  Created by IntelliJ IDEA.
  User: MohammadReza
  Date: 4/12/2018
  Time: 8:53 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/foodRegister">
   <%-- <h2>Food Id</h2>
    <input type="text" name="foodId">--%>
    <h2>Food Name</h2>
    <input type="text" name="foodName">
    <h2>Price</h2>
    <input type="text" name="price">
    <h2>Description</h2>
    <input type="text" name="description">
    <h2>Calories</h2>
    <input type="text" name="calories">
    <h2>Meal Category</h2>
    <select name="mealCategory">
        <option value="dropdown">Pls select one
        <option value="appetizer">Appetizer
        <option value="mainCource">MainCource
        <option value="dessert">Dessert
    </select>
    <h2>Cuisine</h2>
    <select name="Cuisine" onchange="document.productForm.submit();">
        <option value="dropdown">Pls select one
        <option value="iranian">Iranian
        <option value="arabic">Arabic
        <option value="indian">Indian
    </select>
    <h2>Cook</h2>
    <select name="Cuisine" onchange="document.productForm.submit();">
        <option value="dropdown">Pls select one
        <option value="raw">Raw
        <option value="medium">Medium
        <option value="bake">Bake
    </select>
    </br>
    </br>
    <input type="submit" name="sabt">

</form>

</body>
</html>
