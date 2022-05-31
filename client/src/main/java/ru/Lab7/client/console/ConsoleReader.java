package ru.Lab7.client.console;

import java.util.Scanner;
import ru.Lab7.common.read.Read;

/**
 * Класс для чтения данных с консоли
 */
public class ConsoleReader implements Read {
    /**
     * Метод для чтения данных с консоли
     * @return
     */
    @Override
    public String read(){
        Scanner scanner= new Scanner(System.in);
        String input=scanner.nextLine().trim();
        return input;
    }

}
