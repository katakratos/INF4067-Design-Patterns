package construction.pont;

public class BridgeDesignPatternMain {

	public static void main(String[] args) {
		Shape s1 = new Rectangle(new RedColor());
		s1.colorlt();
		
		Shape s2 = new Rectangle(new PurpleColor());
		s2.colorlt();
		
		Shape s3 = new Cercle(new BlueColor());
		s3.colorlt();
		
		Shape s4 = new Cercle(new PurpleColor());
		s4.colorlt();
		
		Shape s5 = new Triangle(new PurpleColor());
		s5.colorlt();
		
		Shape s6 = new Triangle(new RedColor());
		s6.colorlt();
		
		
		

	}

}
