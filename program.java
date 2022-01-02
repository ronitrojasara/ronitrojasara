
import java.util.Scanner;
public class program{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("order of determinant = ");
    int a=sc.nextInt();
    int A[][]=new int[a][a];
    for(byte i=0;i<a;i++){
        for(byte j=0;j<a;j++){
            A[i][j]=sc.nextByte();           
       }       
}System.out.println("Answer is "+c(A,a));
}
    public static int b(int B[],int a,int f){
    int g=0;
    int A[][]=new int[a][a];
    byte l =0;        
            for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
            A[i][j]=B[l];
               l++;       
    }}
    if(a==2){
    if(f%2==0){
            g+=d(A,a);
        }        
        else{
            g-=d(A,a);
        }}else{
        if(f%2==0){
            g+=c(A,a);
        }        
        else{
            g-=c(A,a);
        }        
    } 
    return g;
    }
    public static int c(int A[][],int a){
    int p = 0;
    byte e,l;
        e=0;        
        int B[]=new int[a*a];
        for(byte f=0;f<a;f++){
        l=0;
    for(int i=0;i<a;i++){
            if(i==e){continue;}
            for(int j=0;j<a;j++){
            if(j==f){continue;}
            B[l]=A[i][j];
               l++;
          }
       }p+=A[0][f]*b(B,a-1,f);
       }
    return p;}
    public static int d(int A[][],int a){
    byte l=0;
      ;  int B[]=new int[a*a];
        for(int i=0;i<a;i++){
            for(int j=0;j<a;j++){
            B[l]=A[i][j];
               l++;        
    }}
    return (B[0]*B[3]-B[2]*B[1]);
    }
 }
