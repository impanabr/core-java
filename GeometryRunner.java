class GeometryRunner{
public static void main(String[]args){
	Geometry ref=new Geometry("Plastic",4,20.0,25.0,"Black",4.0);
		Geometry refl=new Geometry();
		ref.geometryName="Plastic";
		ref.numberOfSides=4;
		ref.area=25.0;
		ref.perimeter=20.0;
		ref.color="Red";
		ref.length=5.0;
		ref.display();
	}
}