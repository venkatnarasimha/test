import java.util.*;
class  Frequency
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();

		int a[]=new int[n];
	//	int b[]=new int[n];
	//Secong version of reposirtory
		LinkedHashMap<Integer,Integer>map=new LinkedHashMap<Integer,Integer>();
		
		for(int i=0;i<n;i++)
		{
			int x=s.nextInt();
			a[i]=x;

			if(map.containsKey(x))
			{
				int count=map.get(x);
				map.put(x,++count);
			}
			else
			{
				map.put(x,1);
			}
		}
		System.out.println(map);
			
	}
}
// take a values from user and find out freq
// constraints :0-10
/*arr[]={1,1,2,3,4,4,4,5};
o/p:
1->2
2->1
3->1
4->3
5
*/