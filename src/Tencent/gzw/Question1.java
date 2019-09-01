package Tencent.gzw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * @author goffery
 * @date 2019/08/20
 */
public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m= scanner.nextInt();
        List<Integer> boxNums=new ArrayList<>();
        List<Integer> keyNums=new ArrayList<>();

        for (int i = 0; i < n; i++) {
            boxNums.add(scanner.nextInt());
        }
        for (int i = 0; i < m; i++) {
            keyNums.add(scanner.nextInt());
        }

        int ouOfBox=0;
        int jiOfBox=0;
        int ouOfKey=0;
        int jiOfKey=0;
        for(int num : boxNums){
            //奇数
            if((num & 1) == 1){
                jiOfBox++;
            }else{
                ouOfBox++;
            }
        }
        for(int num : keyNums){
            //奇数
            if((num & 1) == 1){
                jiOfKey++;
            }else{
                ouOfKey++;
            }
        }
        System.out.println( Math.min(jiOfBox,ouOfKey)+Math.min(ouOfBox,jiOfKey));
    }
}
