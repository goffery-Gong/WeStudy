package 滴滴;

import java.util.*;

/**
 * @author goffery
 * @date 2019/08/20
 */
public class Question11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //男女学生数
        int n = scanner.nextInt();
        //朋友关系数
        int m =scanner.nextInt();
        //关系
        List<Integer> relation;
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = scanner.nextInt();
            int value=scanner.nextInt();
            if(map.containsKey(key)){
                map.get(key).add(value);
            }else{
                relation=new ArrayList<>();
                relation.add(value);
                map.put(key,relation);
            }
        }

        int sum=0;
        int resultNum=1;
        List<Integer> resunlArray=new ArrayList<>();
        for (Integer key : map.keySet()){
            if (map.get(key).size()>sum){
                resultNum=key;
                sum =map.get(key).size();
            }
        }

        System.out.println(resultNum);
        System.out.println(resultNum);
    }
}
