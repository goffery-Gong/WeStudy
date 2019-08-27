package MicStr;

import java.util.*;

/**
 * @Author LingLong.gzw
 * @create 2019-08-03
 */
public class QuestionOne {
    public static void main(String[] args) {
        /*Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        int n = scanner.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }*/
        List<String> a = new ArrayList<>();
        List<String> m = new ArrayList<>();
        /*a.add(123);
        a.add(543);
        m.add(321);
        m.add(279);
        System.out.println(minimumMoves(a,m));*/
        a.add("aaabb");
        a.add("aaaaa");
        m.add("abbbb");
        m.add("bbbbb");
//        m.add(321);
//        m.add(279);
        System.out.println(areAlmostEquivalent(a, m));
    }


    public static int minimumMoves(List<Integer> a, List<Integer> m) {
        // Write your code here
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            int p = a.get(i);
            int q = m.get(i);
            while (p != 0 || q != 0) {
                int pTail = p % 10;
                int qTail = q % 10;
                sum += Math.abs(pTail - qTail);
                p = p / 10;
                q = q / 10;
            }
        }

        return sum;
    }

    public static List<String> areAlmostEquivalent(List<String> s, List<String> t) {
        // Write your code here
        List<String> result = new ArrayList<>();
        Map<Character, Integer> mapA;
        Map<Character, Integer> mapB;
        for (int i = 0; i < s.size(); i++) {
            boolean flag=true;
            String a = s.get(i);
            String b = t.get(i);
            mapA = countCars(a);
            mapB = countCars(b);
            Set<Character> hasCheckedList = new HashSet<>();
            for (char c : mapA.keySet()) {
                hasCheckedList.add(c);
                if (mapB.containsKey(c)) {
                    if (Math.abs(mapA.get(c) - mapB.get(c)) > 3) {
                        flag=false;
                        break;
                    }
                } else if (mapA.get(c) > 3) {
                    flag=false;
                    break;
                }
            }
            for (char c : mapB.keySet()) {
                if (!hasCheckedList.contains(c) && mapB.get(c) > 3) {
                    flag=false;
                    break;
                }
            }
            if(flag){
                result.add("YES");
            }else{
                result.add("NO");
            }
        }
        return result;
    }

    //将string中的每个字母及数量放到map中
    public static Map<Character, Integer> countCars(String string) {
        Map<Character, Integer> map = new HashMap<>();
        char c;
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            c = string.charAt(i);
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }
        return map;
    }

    public static int countCharNum(String string, char target) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            if (target == string.charAt(i)) {
                count++;
            }
        }
        return count;
    }
}
