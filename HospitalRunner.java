class HospitalRunner{
public static void main(String[]args){
	Hospital ref=new Hospital("Apollo","Mysore",60,100,"Cardiology",4.2);
		Hospital refl=new Hospital();
		ref.hospitalName="Apollo";
		ref.location="Bangalore";
		ref.doctors=50;
		ref.beds=200;
		ref.speciality="Cardiology";
		ref.rating=4.7;
		ref.display();
	}
}