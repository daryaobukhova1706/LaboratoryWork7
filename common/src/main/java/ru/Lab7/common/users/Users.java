package ru.Lab7.common.users;

public class Users {
    String password;
    String login;
    String salt;

    public Users( String login, String password, String salt) {
        this.login = login;
        this.password = password;
        this.salt=salt;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Override
    public String toString() {
        return "Users{" +
                "password='" + password + '\'' +
                ", login='" + login + '\'' +
                ", salt='" + salt + '\'' +
                '}';
    }
}

