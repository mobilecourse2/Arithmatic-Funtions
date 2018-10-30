import java.util.Scanner;


/*public class add1{

			public static void add(int a,int b){

					System.out.print(a+b);
					//return add;
}

public static void main(String[] args){

add(5,5);

}
}
public class add2{
	add1.add(5,15);
}*/



			public class add{
				public static int add1(int a,int b){
					
					System.out.println("Sum is ="+(a+b));
					return 0;
				}
				public int mul(int a,int b){
					
					System.out.println("Mul is ="+(a*b));
					return 0;
				}
				public int sub(int a,int b){
					
					System.out.println("Sub is ="+(a-b));
					return 0;
				}
				public void div(float a,float b){
					
					System.out.println("Div is ="+(a/b));
					//return 0;
				}
				public static void input(){
					Scanner obj=new Scanner(System.in);
					System.out.print("Enter First num = ");
					int x=obj.nextInt();
					System.out.print("Enter Second num = ");
					int y=obj.nextInt();
					add ad=new add();
					ad.add1(x,y);
					ad.mul(x,y);
					ad.sub(x,y);
					ad.div(x,y);
					
					
				}
				public static void main(String[] args){
					
					
					input();
				}
				
				
				
			}


			