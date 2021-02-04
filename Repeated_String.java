import java.io.*;
import java.util.*;
import java.lang.*;

class Repeated_String{
    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        int t= Integer.parseInt(sc.nextLine());
        while(t>0){
            String A= sc.nextLine();
            String B= sc.nextLine();
            Solution obj=new Solution();
            System.out.println(obj.repeatedString(A,B));
            t--;
        }
    }
}

class Solution{
    static int repeatedString(String A, String B){

        String copy=A;
        int len=B.length()/A.length();
        int count=1;
        for(int i=0;i<len+2;i++)
        {
            if(A.contains(B))
            {
                return count;
            }
            else
            {
                A+=copy;
                count++;
            }
        }
        return -1;

    }
}