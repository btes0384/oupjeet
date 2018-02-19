package practice;

import java.util.Scanner;

public class substringstring {
	
	//public class SubStringDemo {

	    public static void main(String[] args) {
	        int count=0,i,j=0;
	        String a="";
	        Scanner scn=new Scanner(System.in);
	        String s="City Chandigarh is Beautiful";    
	        System.out.println("Enter the word to search");
	        String s1=scn.nextLine();
	     
	        String s3;
	        

	        for( i=0;i<s.length();i++)
	        {
	           
	        if(s.charAt(i)==' '||i==s.length()-1)                                                             
	        {
	           
	            if(i==s.length()-1)
	                s3=s.substring(j,i+1);
	            else
	        s3=s.substring(j,i);


	        if(s3.equals(s1))
	         {
	        count++;
	         }
	        j=i+1;
	        }

	        }
	        if(count>0)
	        System.out.println("Word Found"+" "+count+" "+"times");
	        else
	            System.out.println("Word Not Found");
	    
	    }
	        
	            
	            }
	            
	            
	        

