package day9;

public class Shape {
	private int left;//시작점의 x좌표
	private int up;//시작점의 y좌표
	private double width;//가로의길이
	private double height;//세로의 길이
	private static int count;
	public static void printCount() {
		System.out.println("현재까지 만들어진 도형의 갯수:"+count);
	}
	public void print() {
		System.out.println("--------도형의 정보----------");
		System.out.printf("시작점: (%d,%d)\n",left,up);
		System.out.printf("가로:%.2f\n",width);
		System.out.printf("세로:%.2f\n",height);
		System.out.println("--------------------------");
	}
	public Shape() {	count++;}
	public Shape(int left, int up, double width, double height) {
		this.left = left;
		this.up = up;
		this.width = width;
		this.height = height;
		count++;
	}
	
	public void move(int left,int up) {
		this.left=left;
		this.up=up;
	}
	public void resize(double width,double height) {
		this.width=width;
		this.height=height;
	}
	
	protected int getLeft() {
		return left;
	}
	protected void setLeft(int left) {
		this.left = left;
	}
	protected int getUp() {
		return up;
	}
	protected void setUp(int up) {
		this.up = up;
	}
	protected double getWidth() {
		return width;
	}
	protected void setWidth(double width) {
		this.width = width;
	}
	protected double getHeight() {
		return height;
	}
	protected void setHight(double height) {
		this.height = height;
	}
	
}
