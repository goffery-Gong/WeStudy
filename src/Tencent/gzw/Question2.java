package Tencent.gzw;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author goffery
 * @date 2019/08/20
 */
public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        List<Person> list =new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Person(scanner.nextInt(),scanner.nextInt()));
        }

    }

    static class Person{
        private int a;
        private int b;

        public Person(int a, int b) {
            this.a = a;
            this.b = b;
        }
    }
}
