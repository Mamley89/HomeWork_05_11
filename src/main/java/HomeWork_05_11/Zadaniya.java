package HomeWork_05_11;

public class Zadaniya {

    //I. data-класс

    //1. Опишите класс Player (игрок)
    //2. У игрока есть поля:
        //○ id (int)
        //○ nickname (String)
        //○ isOnline (boolean)
    //3. Все поля должны быть приватными
    //4. Переопределите для класса методы equals(), hashCode() и toString()
    //5 В отдельном классе создайте двух игроков с одинаковыми значениям полей.
    //6. Убедитесь, что player1 == player2 ==> false
    //7. Убедитесь, что player1.equals(player2) ==> true

///////////////////////////////////////////////////////////////////////////////////////////////////////////111
    //II. Список дел

    //1.Создайте список строк (List)
    //2. Положите в список 5 дел на день
    //3. в цикле выведите список в формате:
        //○ Задача 1: {текст задачи}
        //○ Задача 2: {текст задачи}
        //○ ...
        //○ Задача 5: {текст задачи}

///////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //III. Список объектов

    //1. создайте класс Movie (можно использовать тот, что создавали ранее)
    //2. в классе создайте поля:
        //○ название
        //○ рейтинг (от 0 до 10)
        //○ жанр
        //○ страна
        //○ есть ли оскар (да/нет)
    //3. создайте в другом классе метод psvm.
    //4. в этом методе объявите список films
    //5. положите в список 3 любимых фильма
    //6. выведите на экран информацию о фильме по индексу 1

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //IV.Вложенный список

    //1. создайте класс Company (кинокомпания)
    //2. в классе создайте поля:
        //○ название
        //○ год основания
        //○ список фильмов, которые компания выпустила (по 3 штуки)
    //3. создайте в другом классе метод psvm.
    //4. в этом методе объявите список companies
    //5. положите в список 3 кинокомпании
    //6. каждой кинокомпании запишите в портфолио по 3 фильма
    //7. напечатайте информацию о всех компаниях в формате {название компании}: {названия всех фильмов}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //V.Турнир игроков

    //1.В задании 1 вы создали класс Player
    //2.Создайте хранилище игроков. Его будет использовать программа, которая описывает турнир. Требования:
        //○ Количество игроков неизвестно заранее. Может быть 2, а может 100
        //○ В турнир каждый игрок может записаться только 1 раз (не может быть дублей)
    //3. создайте 10 игроков и поместите их в хранилище.
    //4. убедитесь, что если один игрок помещен в хранилище дважды, дубликат не запишется

////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    //VI.Турнирная таблица

    //1.В задании 1 вы создали класс Player
    //2. Создайте Map<Player, Integer> points для хранения очков игроков
    //3. Положите в мэпу 10 игроков. У каждого 0 очков.
    //4. Игроку с id=4 запишите 10 очков
    //5. Игроку с id=7 – 12 очков
    //6. Игроку с id=8 – 11 очков
    //7. Игроку с id=9 – 13 очков
    //8. Игроку с id=10 – 5 очков
    //9. Выведите на экран 3х лучших игроков турнира*
    //10. На первом месте должен быть игрок с максимальным результатом
}
