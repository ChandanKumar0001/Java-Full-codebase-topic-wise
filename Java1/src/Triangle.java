class Triangle {
	public static void main(String[] arg)
	{
		Triangle t1 = new Triangle();
		double res1 = t1.areaOfTriangle(2.5,5.5);
		double res2 = t1.areaOfTriangle(2.6,5.4);
		double res3 = t1.areaOfTriangle(2.5,5.6);
		double res = (res1+res2+res3)/3;
		System.out.println("Area of triangle : " +res);
		
	}
	double areaOfTriangle(double base, double height)
	{
		double area = 0.5*base*height;
		return area;
	}
}
