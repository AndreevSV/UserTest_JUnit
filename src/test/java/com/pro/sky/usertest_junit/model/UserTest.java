/*
Задание
        Создайте проект и добавьте в него библиотеку JUnit.
        Создайте класс UserTest и класс User с полями логин и email. Класс «User» нужно будет тестировать.
        В классе UserTest пропишите следующие тесты:
        Создайте тест, который выполнит тестирование создания объекта User с передачей в него двух параметров. Такая функция лишь должна проверять устанавливаются ли данные при создании объекта;
        Создайте аналогичный тест, который выполнит тестирование по созданию объекта без передачи в него параметров;
        Создайте тест, который протестирует установлен ли корректный Email адрес в поле email в классе User. Некорректным будет считаться тот email, в котором нет знака @ или же знака точки.
        Создайте тест, который определяет, равны ли login и email (Они не должны быть равны).
        Подсказка
        Для проверки на наличие символа можно использовать метод contains;

        Критерии оценки
        Созданы все необходимые тесты
        Все тесты отрабатывают корректно
        Подобраны правильные методы для тестирования
        В классе User есть 2 типа конструкторов
        В классе User сгенерированны геттеры
        В названии методов тестового класса соблюдены правила нейминга
*/



package com.pro.sky.usertest_junit.model;

import com.pro.sky.usertest_junit.Constaints.UserTestConstants;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {

    @Test
    public void shouldCreatUserWithParameters() {

        User user = new User();
        user.setLogin(UserTestConstants.LOGIN_CORRECT);
        user.setEmail(UserTestConstants.EMAIL_CORRECT);

        Assertions.assertEquals(UserTestConstants.LOGIN_CORRECT, user.getLogin());
        Assertions.assertEquals(UserTestConstants.EMAIL_CORRECT, user.getEmail());
    }

    @Test
    public void shouldCreateUserWithoutParameters() {
        User user = new User();

        Assertions.assertEquals(UserTestConstants.LOGIN_BLANK, user.getLogin());
        Assertions.assertEquals(UserTestConstants.EMAIL_BLANK, user.getEmail());
    }

    @Test
    public void shouldTestEmailToRight() {
        Assertions.assertThrows(Exception.class, () -> new  User(UserTestConstants.LOGIN_CORRECT, UserTestConstants.EMAIL_WRONG));
    }

}
