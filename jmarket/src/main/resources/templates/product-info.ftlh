<!DOCTYPE html>
<html>
<head>
    <title>JMarket</title>
</head>
<body>
<h1>JMarket</h1><hr>
<h4>Товары пользователя</h4>
<#list images as img>
    <img src="/images/${img.id}" height="60px"/><br><br>
</#list>

<b>Название товара: </b>${product.title}<br>
<b>Описание: </b>${product.description}<br>
<b>Город: </b>${product.city}<br>
<b>Автор: </b><a href="/user/${product.user.id}">${product.user.name}</a><br>

</body>
</html>