package ru.Lab7.common.arguments;

/**
 * Класс для передачи аргумента distance методу
 */
public class ArgumentDistanceImpl implements Argument {
    public String login;
    public String password;
    public Long distance;
    public ArgumentDistanceImpl(String login, String password, Long distance){
        this.distance=distance;
    }
}
