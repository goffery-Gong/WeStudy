package NetEase.gzw;

import java.util.*;

/**
 * @Author LingLong.gzw
 * @create 2019-08-03
 */
public class QuestionOne {
    public static void main(String[] args) {
        List<Integer> scores = new ArrayList<>();
        List<Integer> indexs = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        //班级人数
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            scores.add(scanner.nextInt());
        }
        //查询人数
        int q = scanner.nextInt();
        for (int i = 0; i < q; i++) {
            indexs.add(scanner.nextInt());
        }

        List<Integer> newScores = new ArrayList<>(scores);
        List<Integer> resultList = new ArrayList<>();
        String result ;
        Collections.sort(newScores);
        for (int index : indexs) {
            double scoreIndex = getScoreIndex(index - 1, scores, newScores);

            result = String.format("%.6f", scoreIndex * 100 / n);
            System.out.println(result);

        }
    }

    private static int getScoreIndex2(int index, List<Integer> scores, List<Integer> newScores) {
        //学生分数
        int target = scores.get(index);
        int size=0;
        for(int i=0; i<newScores.size();i++){
            if(newScores.get(i)<=target){
                size++;
            }
        }
        return size;
    }
    /**
     * @param index     输入的学生index
     * @param scores
     * @param newScores
     */
    private static int getScoreIndex(int index, List<Integer> scores, List<Integer> newScores) {
        //学生分数
        int target = scores.get(index);
        int low = 0;
        int high = newScores.size() - 1;
        int mid = 0;
        while (low <= high) {
            mid = low + ((high - low) >> 1);
            if (target == newScores.get(mid)) {
                return mid;
            } else if (target < newScores.get(mid)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        for (int i=mid+1; i<high;i++){
            if(newScores.get(i).equals(newScores.get(mid))){
                mid++;
            }
        }
        return -1;
    }
}
