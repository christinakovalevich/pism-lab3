<%--
  Created by IntelliJ IDEA.
  User: chris
  Date: 28.03.2019
  Time: 22:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <form action="questionary" method="post">
        <p>Укажите Ваш пол:</p>

        <p><input type="radio" name="gender" value="male" checked>Мужской</p>
        <p><input type="radio" name="gender" value="female">Женский</p>

        <p>Воспользоваться услугами нашего турагентства Вы решили, основываясь на:</p>

        <p><input type="checkbox" value="yourself" name="reason1" checked>Собственный опыт</p>
        <p><input type="checkbox" value="recommendation" name="reason2">Рекомендации знакомых</p>
        <p><input type="checkbox" value="price" name="reason3">Цены</p>
        <p><input type="checkbox" value="ads" name="reason4">Реклама</p>
        <p><input type="checkbox" value="popularity" name="reason5">Известность турагентства</p>
        <p><input type="checkbox" value="another" name="reason6">Другое: </p>
        <p><input type="text" name="reason6" value="another" placeholder="Другая причина" maxlength="100"></p>

        <p>Что Вы, покупая путешествие, считаете приоритетным?</p>

        <p><input type="checkbox" value="price" name="priority1" checked></p>
        <p><input type="checkbox" value="attractiveness" name="priority2"></p>
        <p><input type="checkbox" value="recommendations" name="priority3"></p>
        <p><input type="checkbox" value="quality" name="priority4"></p>
        <p><input type="checkbox" value="ads" name="priority5"></p>

        <p>Оцените Ваш отдых по шкале от 1 до 5 (1 - "совсем не понравилось", 5 - "всё было идеально"):</p>

        <p><input type="radio" name="like" value="verybad">1</p>
        <p><input type="radio" name="like" value="bad">2</p>
        <p><input type="radio" name="like" value="normal">3</p>
        <p><input type="radio" name="like" value="good">4</p>
        <p><input type="radio" name="like" value="verygood" checked>5</p>

    </form>

</body>
</html>
