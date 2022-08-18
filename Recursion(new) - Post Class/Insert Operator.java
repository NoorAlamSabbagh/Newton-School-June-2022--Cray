import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
    public static int result(long [] arr,long sum,int i)
  {  
	  if(i==arr.length){
		  if(sum==0) return 0;
	      else return 1;}
	  return result(arr,sum-arr[i],i+1)*result(arr,sum+arr[i],i+1);
	
  }

    public static void main (String[] args) {
                      // Your code here

                        Scanner sc=new Scanner(System.in);
                        int n=sc.nextInt();
                        long target=sc.nextLong();
                        long [] arr=new long[n];
                        for(int i=0;i<n;i++)
                        {
                            arr[i]=sc.nextLong();
                        }
                        int sum=result(arr,target,0);
                        if(sum==0)
                        System.out.println("YES");
                        else
                        System.out.println("NO");
    }
}
