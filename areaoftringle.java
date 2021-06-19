package codewithaman;
import java.util.Scanner;
public class areaoftringle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the side points x1,y1");
		double x1=sc.nextDouble();
		double y1=sc.nextDouble();
		
		System.out.println("enter the side points x2,y2");
		double x2=sc.nextDouble();
		double y2=sc.nextDouble();
		
		System.out.println("enter the side points x3,y3");
		double x3=sc.nextDouble();
		double y3=sc.nextDouble();
		
		double s1=Math.sqrt((Math.pow(x2-x1, 2))+ (Math.pow((y2-y1), 2)));
		double s2=Math.sqrt((Math.pow(x3-x1, 2))+ (Math.pow((y3-y1), 2)));
		double s3=Math.sqrt((Math.pow(x3-x2, 2))+ (Math.pow((y3-y2), 2)));
		
		double s=(s1+s2+s3)/2;
		
		double area=Math.sqrt((s*(s-s1)*(s-s2)*(s-s3)));
		
		System.out.println("hence the area of traingle is "+area);



	}

}
