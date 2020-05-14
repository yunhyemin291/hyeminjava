package day14;

public class TestEx15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1=new Point(0,0);		
		Point p2=new Point(3,4);
		System.out.println(p1+"과"+p2+"의 거리는"+p1.distance(p2)+"입니다.");
		System.out.println(p1+"과"+p2+"는 같은 점 입니까?: "+p1.equals(p2));
		p2.setX(0);
		p2.setY(0);
		System.out.println(p1+"과"+p2+"는 같은 점 입니까?: "+p1.equals(p2));
	}

}
class Point {
	private int x;
	private int y;
	
	public Point() {}
	
	
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return " (" + x + ", " + y + ")";
	}

	@Override
	public boolean equals(Object obj) {
		//obj와 this가 같은 객체를 공유하고 있는 경우
		if (this == obj)			return true;
		//비교할 점 obj가 없는경우,NullPointerException이 발생하는걸 막아주는 역할
		if (obj == null)			return false;
		//비교할 obj가 Point 클래스가 아닌 경우
		if (getClass() != obj.getClass())			return false;
		//obj가 Point클래스의 객체인 경우
		Point other = (Point) obj;
		if (x != other.x)			return false;
		if (y != other.y)			return false;
		return true;
	}
	public double distance(Point other) {
		int disX= x -other.x;
		int disY= y -other.y;
		double res=Math.sqrt(Math.pow(disX,2.0)+Math.pow(disY,2.0));
		return res;
	}

}