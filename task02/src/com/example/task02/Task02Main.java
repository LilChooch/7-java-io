package com.example.task02;
import java.io.InputStream;
import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл output.test
        // - запустить программу
        // - и сравнить получившийся файл output.test с expected.test
        InputStream inputStream = System.in;
        int prev = inputStream.read();
        int curr = inputStream.read();

        while (prev != -1){
            if(prev != 13 || curr != 10){
                System.out.write(prev);
            }
            prev = curr;
            curr = inputStream.read();
        }
        System.out.flush();
    }
}
