<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Deleting product</title>
</head>
<body>
<h1>Delete product</h1>
<p>
    <a href="/products">back to product list</a>
</p>
<form method="post">
    <h2>Are you sure?</h2>
    <fieldset>
        <legend>product information</legend>
        <table>
            <tr>
                <td>ID:</td>
                <td>${requestScope["product"].getId()}</td>
            </tr>
            <tr>
                <td>Name:</td>
                <td>${requestScope["product"].getName()}</td>
            </tr>
            <tr>
                <td>Description:</td>
                <td>${requestScope["product"].getDescription()}</td>
            </tr>
            <tr>
                <td>Price:</td>
                <td>${requestScope["product"].getPrice()}</td>
            </tr>
            <tr>
                <td>Image:</td>
                <td><img src="img/${product.getImage()}" width="100px" height="100px"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="delete product"></td>
                <td><a href="/products">Back to product list</a></td>
            </tr>
        </table>
    </fieldset>
</form>
</body>
</html>
