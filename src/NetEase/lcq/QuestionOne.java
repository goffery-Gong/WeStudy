package NetEase.lcq;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext()){
            int a = scanner.nextInt();
            list.add(a);
            int b = scanner.nextInt();
            list.add(b);
        }
        for(Integer in:list){
            System.out.println("hhh"+in);
        }
    }
}
