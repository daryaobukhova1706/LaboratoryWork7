package ru.Lab7.common.arguments;
/**
 * Класс для передачи аргумента name методу
 */
public class ArgumentNameImpl implements Argument {
    public String login;
    public String password;
    public String name;
    public ArgumentNameImpl(String login, String password,String name){
        this.login=login;
        this.password=password;
        this.name=name;
    }
}
