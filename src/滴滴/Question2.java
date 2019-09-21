package 滴滴;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * @author goffery
 * @date 2019/08/20
 */
public class Question2 {
     ArrayList<Integer> list=new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if(listNode==null){
          return list;
      }
      printListFromTailToHead(listNode.next);
      list.add(listNode.value);
        return list;
    }
}
