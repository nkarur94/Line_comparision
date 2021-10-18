import java.util.Scanner;
class Cartesian{
		
		double x1, x2, y1, y2;
        	double xx1, xx2, yy1, yy2;
		double line1=0;
		double line2=0;
        	Scanner sc=new Scanner(System.in);
	
		public void findLength()
		{
        		System.out.println("enter the x1 coordinates");
        		x1=sc.nextDouble();
        		System.out.println("enter the x2 coordinates");
        		x2=sc.nextDouble();
        		System.out.println("enter the y1 coordinates");
        		y1=sc.nextDouble();
			System.out.println("enter the y2 coordinates");
	        	y2=sc.nextDouble();
	
       		 	line1=Math.sqrt(Math.pow(x1-x2,2)+Math.pow(y1-y2,2));
       		 	System.out.println(line1);	
	
			System.out.println("enter the xx1 coordinates");
        		xx1=sc.nextDouble();
        		System.out.println("enter the xx2 coordinates");
       			xx2=sc.nextDouble();
       	 		System.out.println("enter the yy1 coordinates");
       			yy1=sc.nextDouble();
   	     		System.out.println("enter the yy2 coordinates");
        		yy2=sc.nextDouble();

        		line2=Math.sqrt(Math.pow(xx1-xx2,2)+Math.pow(yy1-yy2,2));
        		System.out.println(line2);
		}

		Double l1=line1;
		Double l2=line2;
		public void equalTo()
		{
			if (l1.equals(l2))
			{
				System.out.println("two line are equal");
			}
			else
				System.out.println("two lines are not equal");
		}
	
	public void compareTo()
	{
		if (l1.compareTo(l2)==0)
		{
			System.out.println("two line are equal");
		}
		else if(l1.compareTo(l2)==1)
		{
			System.out.println("1st line is greater then second");
		}
		else
		{
			System.out.println("1st line is lesser then second ");
		}
	}
	
	public static void main(String[] args)
	{
		System.out.println("welcome to line comparition computational progarm");
                System.out.println("*************************************************");
		Cartesian c1=new Cartesian();
		c1.findLength();
		c1.equalTo();
		c1.compareTo();

	}	
}

