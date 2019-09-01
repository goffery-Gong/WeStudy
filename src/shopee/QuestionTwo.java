package shopee;

import java.util.*;

/**
 * @Author LingLong.gzw
 * @create 2019-08-03
 */
public class QuestionTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cadidateNum = scanner.nextInt(); //候选人数
        Set<Integer> levelVals; //候选人指标值
        Map<Integer, Set<Integer>> map = new HashMap<>(); //候选人index 对应指标值

        int girlLevelNum; //女孩指标数
        List<Integer> girlLevelVals=new ArrayList<>(); //女孩指标值

        List<Integer> result=new ArrayList<>();
        for (int i = 0; i < cadidateNum; i++) {
            result.add(0);
        }

        for (int i = 0; i < cadidateNum; i++) {
            int levelNum=scanner.nextInt();
            levelVals = new HashSet<>();
            for (int j = 0; j < levelNum; j++) {
                levelVals.add(scanner.nextInt());
            }
            map.put(i, levelVals);
        }
        girlLevelNum = scanner.nextInt();
        for (int i = 0; i < girlLevelNum; i++) {
            girlLevelVals.add(scanner.nextInt());
        }

        for (int girlVal : girlLevelVals) {
            for (int i = 0; i < cadidateNum; i++) {
                Set<Integer> cadidateVals = map.get(i);
                if(cadidateVals.contains(girlVal)){
                    result.set(i,result.get(i)+1);
                }
            }
        }
        int resultIndex=0;
        int val=result.get(0);
        for (int i = 1; i < cadidateNum; i++) {
            if(val<result.get(i)){
                val=result.get(i);
                resultIndex=i;
            }
        }
        System.out.println(resultIndex+1);
    }
}
