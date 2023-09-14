package Dto;

import java.util.Arrays;

public class Demo {

 	public static void main(String[] args) {
 		int[]a={9,7,3,12,7};
 		
       System.out.println(perfectsum(5,a,14));
 		
	}
 	
 	public static int perfectsum(int input1,int[] input2,int input3)
 	{
 		int count=0;
 		for(int i=0;i<input1;i++)
 		{
 			
 			for(int j=i;j<input1;j++)
 			{
 				if(i==j)continue;
 				if(input2[i]+input2[j]==input3)
 				{
 					count++;
 					continue;
 				}
 				int total=input2[i]+input2[j];
 				 if(total<input3)
 				{
 					for(int k=j;k<input1;k++)
 					{
 						if(k==i||k==j)continue;	
 						int retotal=total+input2[k];
 						if(retotal==input3)count++;
 					}
 				}
 			}
 			
 		}
 		return count;
 	}

}
