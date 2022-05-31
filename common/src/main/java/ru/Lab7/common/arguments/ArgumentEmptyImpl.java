package ru.Lab7.common.arguments;

/**
 * Класс для передачи пустых аргументов методу
 */

public class ArgumentEmptyImpl implements Argument {
    public String login;
    public String password;
    public ArgumentEmptyImpl(String login, String password){
        this.login=login;
        this.password=password;
    }
}
