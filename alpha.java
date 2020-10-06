import java.util.*;
public class alpha{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch[]={' ','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int quo=n/26;
        int rem=n%26;
        if(n>26){
            if(rem==0){
                rem=ch.length-1;
                System.out.print(ch[quo-1]+""+ch[rem]);
            }
            else{
                System.out.print(ch[quo]+""+ch[rem]);
            }
        }
    }
}
