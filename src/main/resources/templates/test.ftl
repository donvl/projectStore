<!DOCTYPE html>
<html lang="ru">
<head>
<meta charset="utf-8" />
<title>вторая страница</title>
<style>
/* Внешний вид кнопки */
.seven {
color: #524E49; /* Цвет текста */
background: #fdeaa8; /* Фоновый цвет */
padding: 10px; /* Отступ текста от границ */
font-size: 20px; /*Размер текста */
border-radius: 5px; /* Закругление уголков */
box-shadow: 0px 1px 3px; /* Тень */
position: relative; /* Задаём относительное позиционирование */
transition: all 500ms ease-out; /* Задаём анимацию с временем выполнения 500ms */
transform-style: preserve-3d; /* Трансформация показывается как 3D */
}
/* Создаём псевдо элемент - верхняя грань кнопки */
.seven:after { /* Добавляем псевдо элемент :after */
content: 'Кнопка'; /* Текст в псевдо элементе */
position: absolute; /* Позиционируем абсолютно, относительно основного блока */
top: -50%;
left: 0px;
width: 100%; /* Ширина */
background: #fdeaa8; /* Фоновый цвет */
border-radius: 5px; /* Закругление уголков */
box-shadow: 0px 1px 3px; /* Тень */
transform-origin: bottom; /* Точка, относительно которой будет выполнятся вращение */
transform: rotateX(90deg); /* Размещаем в горизонтальной плоскости, в результате чего псевдо элемент не виден */
}
/* Эффект при наведении */
.seven:hover { /* Добавляем псевдо класс :hover */
transform-origin: bottom; /* Определяем точку, относительно которой происходит вращение */
transform: rotateX(-90deg); /* Поворачиваем на 90 градусов */
}
</style>
</head>
<body>
<div>Страница админа</div></br>
<button class="seven" onclick="location.href='home';">Кнопка</button></br>

</body>
</html>