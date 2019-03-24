<%@ page contentType="text/html;charset=UTF-8" %>
<html lang="ru">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport"
              content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Главная</title>
    </head>
    <body>
        <div class="container">
            <form action="user" method="post">
                <input type="email" name="username" placeholder="username">
                <input type="password" name="password" placeholder="password">
                <button type="submit">Войти</button>
            </form>
        </div>
    </body>
</html>
