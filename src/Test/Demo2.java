package Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author goffery
 * @date 2019/08/20
 */
public class Demo2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //学生数
        int n = scanner.nextInt();
        //身高
        ArrayList<Integer> heights = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            heights.add(scanner.nextInt());
        }

        int start = heights.get(0);
        List<Integer> group = new ArrayList<>();
        int sum=0;
        for (int i = 0; i < n; i++) {
            Integer height = heights.get(i);
            if(height>start){
                group.add(height);
            }
            else {
                group.add(height);
                Collections.sort(group, Comparator.reverseOrder());
                if(i+1<n && heights.get(i + 1) <=group.get(0)){
                    //如果下一个比组大致小，就加入组，然后判断下一个
                    group.add(heights.get(i + 1));
                }else if(i+1<n){
                    sum++;
                    group=new ArrayList<>();
                }
            }
        }
        System.out.println(sum+1);
    }
}
