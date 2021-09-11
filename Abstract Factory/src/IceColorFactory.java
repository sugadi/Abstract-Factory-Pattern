
public class IceColorFactory  extends IceAbstractFactory{

	@Override
	public Ice getIce(String ice) {
		 
		return null;
	}

	@Override
	public IceColor getIceColor(String iceColor) {
		
		switch (iceColor) {
		case "Lightblue":
			
			return new LightBlueColorIce();
       case "Yellow":
			
			return new YellowColorIce();

		default:
			System.out.println("color not found");
		}
		 
		return null;
	}

}
