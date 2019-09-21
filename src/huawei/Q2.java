package huawei;
import java.util.*;
/**
 * @Auther: Goffery Gong
 * @Date: 2019/9/21 20:43
 * @Description:
 */
public class Q2 {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<String> right=new ArrayList<>();
		ArrayList<String> error=new ArrayList<>();
		while(sc.hasNextLine())
		{
			String read_temp=sc.nextLine();
			if(read_temp.equals(""))
				break;
			boolean flag=true;
			for(int i=0;i<read_temp.length();i++)
			{
				char ch=read_temp.charAt(i);
				if(Character.isDigit(ch) || Character.isLetter(ch))
				{
					continue;
				}
				else
				{
					flag=false;
					break;
				}
			}
			if(flag)
				right.add(read_temp);
			else
				error.add(read_temp);
		}
		sc.close();

		HashMap<String,Integer> map=new HashMap<>();
		ArrayList<String> out1=new ArrayList<>();
		for(String t:right)
		{
			if(map.containsKey(t))
				continue;
			else
			{
				map.put(t, 1);
				out1.add(t);
			}
		}
		//out part1
		for(int i=0;i<out1.size();i++)
		{
			System.out.print(out1.get(i));
			if(i!=out1.size()-1)
				System.out.print(" ");
			else
				System.out.println("");
		}
		//out part2
		for(int i=0;i<error.size();i++)
		{
			System.out.print(error.get(i));
			if(i!=error.size()-1)
				System.out.print(" ");
			else
				System.out.println("");
		}

		TreeSet<String> out3=new TreeSet<String>(out1);
		Iterator<String> iterator = out3.iterator();

		for(int i=0;i<out3.size();i++)
		{
			String temp=iterator.next();
			System.out.print(deal(temp));
			if(i!=out3.size()-1)
				System.out.print(" ");
			else
				System.out.println("");
		}


	}

	private static String deal(String str) {
		int len=str.length();
		StringBuffer out=new StringBuffer();
		for(int i =0; i<len;i++)
		{
			out.append(str.charAt((i+10)%len));
		}
		return out.toString();
	}
}
