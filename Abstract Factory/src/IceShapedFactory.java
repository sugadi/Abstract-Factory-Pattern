
public class IceShapedFactory extends IceAbstractFactory {

	@Override
	public Ice getIce(String ice) {
		
		switch (ice) {
		case "Shaved":
			return new ShavedIce();
		case "Snow":
			
			return new SnowConeIce();
		default:
			System.out.println("Not matched ");
			break;
		}
		 
		return null;
	}

	@Override
	public IceColor getIceColor(String iceColor) {
		 
		return null;
	}

}
