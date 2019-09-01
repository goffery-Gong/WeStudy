package Tencent.lcq.Q4gzw;

import java.util.Scanner;
import java.util.Stack;

/**
 * @author goffery
 * @date 2019/08/20
 */
public class Question4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Node[] v = new Node[n];
        Long[] inc = new Long[n];

        for (int i = 0; i < n; i++) {
            v[i].setVal(scanner.nextInt());
            inc[i] = i == 0 ? v[i].val : inc[i - 1] + v[i].val;
            v[i].setStart(i);
            v[i].setEnd(i);
        }
        /*******************处理得到每个元素的左边界(正向遍历)*****************/
        Stack<Integer> s = new Stack<>();
        int i = 0;
        while (i < (int)v.length) {
            if (s.empty() || v[i].val > v[s.peek()].val) {
                s.push(i);
                ++i;
            } else {
                //插入的值更小的时候，将其start置为将要弹出的元素的start
                v[i].start = v[s.peek()].start;
                s.pop();
            }
        }

        /*******************处理得到每个元素的右边界(反向遍历)*****************/
        while(!s.empty())//清空s,准备反向遍历
            s.pop();
        i=n-1;
        while(i>=0){
            if(s.empty() || v[i].val > v[s.peek()].val){
                s.push(i);
                --i;
            }
            else{
                //插入的值更小的时候，将其start置为将要弹出的元素的start
                v[i].end=v[s.peek()].end;
                s.pop();
            }
        }
        /******************得到每个元素的结果，返回最大值即可*****************/
        long result=0;
        int index_start=0,index_end=0;//得到最大值的区间(这里是从0开始计数的)
        for(int k=0;k<n;++k){
            long cur_result=v[k].val*(inc[v[k].end]-inc[v[k].start-1]);
            if(cur_result>result){
                result=cur_result;
                index_start=v[k].start;
                index_end=v[k].end;
            }
        }
        System.out.println(result);
        System.out.println(index_start+1 +" " +index_end+1);
    }

    class Node {
        int val;
        int start;
        int end;

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getEnd() {
            return end;
        }

        public void setEnd(int end) {
            this.end = end;
        }
    }
}
