package ru.Lab7.common.arguments;

/**
 * Класс для передачи аргумента Id методу
 */
public class ArgumentIdImpl implements Argument {
    public String login;
    public String password;
    public long id;
    public ArgumentIdImpl(String login, String password,Long id){
        this.login=login;
        this.password=password;
        this.id=id;
    }
}
