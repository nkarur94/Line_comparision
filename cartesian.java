import java.util.Scanner;
class cartesian{
	public static void main(String[] args){
	System.out.println("welcome to line comparition computational progarm");
	System.out.println("*************************************************");	
	double x1, x2, y1, y2;
        double xx1, xx2, yy1, yy2;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the x1 coordinates");
        x1=sc.nextDouble();
        System.out.println("enter the x2 coordinates");
        x2=sc.nextDouble();
        System.out.println("enter the y1 coordinates");
        y1=sc.nextDouble();
        System.out.println("enter the y2 coordinates");
        y2=sc.nextDouble();

        double line1=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
        System.out.println(line1);	
	
	System.out.println("enter the xx1 coordinates");
        xx1=sc.nextDouble();
        System.out.println("enter the xx2 coordinates");
        xx2=sc.nextDouble();
        System.out.println("enter the yy1 coordinates");
        yy1=sc.nextDouble();
        System.out.println("enter the yy2 coordinates");
        yy2=sc.nextDouble();

        double line2=Math.sqrt(Math.pow(xx1-xx2,2)+Math.pow(yy1-yy2,2));
        System.out.println(line2);
	Double l1=line1;
	Double l2=line2;	
	if (l1.equals(l2)){
		System.out.println("two line are equal");
	}
	else
		System.out.println("two lines are not equal");
	}
}

