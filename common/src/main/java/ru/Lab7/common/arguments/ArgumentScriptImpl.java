package ru.Lab7.common.arguments;

/**
 * Класс для передачи аргумента fileName методу
 */

public class ArgumentScriptImpl implements Argument{
    public String login;
    public String password;
    public String fileName;
    public ArgumentScriptImpl(String login, String password,String fileName){
        this.login=login;
        this.password=password;
        this.fileName=fileName;
    }
}
