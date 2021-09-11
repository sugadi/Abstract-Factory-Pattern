
public class IceAbstacrtFactoryDemo {
	
	public static void main(String[] args) {
		
		System.out.println("Shaved ice factory by abstarct factory design pattern");
		
		IceAbstractFactory ice =new IceShapedFactory();
		
		 ice.getIce("Shaved");
		 
		 IceAbstractFactory iceColor =new IceColorFactory();
		 
		 iceColor.getIceColor("Yellow");
		 
		
		
		
	}

}
