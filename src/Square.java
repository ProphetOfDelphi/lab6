
public class Square extends Rectangle {

	public Square(String id, double side) {
		super(id, side, side);
	}
	
	@Override
	public String getShapeType() {
		return "Square";
	}
}
