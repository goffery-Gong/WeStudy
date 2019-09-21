package huawei;
import java.util.ArrayList;
import java.util.Scanner;
/**
 * @Auther: Goffery Gong
 * @Date: 2019/9/21 20:42
 * @Description:
 */
public class Q1 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//每一行数组
		ArrayList<String> save=new ArrayList<>();
		String tt=sc.nextLine();
		while(sc.hasNextLine())
		{
			save.add(sc.nextLine());
		}
		sc.close();
		//所有数组集合
		ArrayList<ArrayList<String>> temp=new ArrayList<>();
		int len=save.size();
		for(int i=0;i<len;i++)
		{
			ArrayList<String> add_t=new ArrayList<>();
			String[] temp1=save.get(i).split(",");
			for(String t:temp1)
			{
				add_t.add(t);
			}
			temp.add(add_t);
		}
		int[] index=new int[len];//维护一个index数组记录第i个数组的当前长度
		int count=len; //数组数量
		ArrayList<String> out=new ArrayList<>();//结果数组
		while(count>0)
		{
			for(int i=0;i<len;i++)
			{
				int now_len=temp.get(i).size();//当前数组的长度
				if(index[i]==now_len)//当前数组长度等于n，跳过
					continue;
				else if(index[i]+n>=(now_len)) //当前数组长度小于n，全部加入out
				{
					for(int j=index[i];j<now_len;j++)
					{
						out.add(temp.get(i).get(j));
						out.add(",");
					}
					index[i]=now_len;//
					count--;
				}
				else//当前数组长度大于n，将前n个加入out
				{
					for(int j=index[i];j<(index[i]+n);j++)
					{
						out.add(temp.get(i).get(j));
						out.add(",");
					}
					index[i]+=n;
				}
			}
		}
		StringBuffer outStr=new StringBuffer();
		for(String str:out)
		{
			outStr.append(str);
		}
		outStr.deleteCharAt(outStr.length()-1);
		System.out.println(outStr.toString());
	}
}
