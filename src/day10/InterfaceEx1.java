package day10;

public class InterfaceEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
interface RemoteController{
	int num=10;
	public int chUp(int ch);
	public int chDown(int ch);
	public volup(int vol);
	public volDown(int vol);
	public default void test() {}
}
class TvremoteController implements RemoteController{
	@Override
	public int chUp(int ch) {		return ++ch;	}
	@Override
	public int chDown(int ch) {		return --ch;	}
	
}