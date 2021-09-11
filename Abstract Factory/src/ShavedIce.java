
public class ShavedIce implements Ice {
	
	ShavedIce(){
		getIceShape();
	}

	@Override
	public void getIceShape() {
		System.out.println("Shaved ice ");
	}

}
