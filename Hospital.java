class Hospital{
String hospitalName;
String location;
int doctors;
int beds;
String speciality;
double rating;

public Hospital(String hospitalName,String location,int doctors,int beds,String speciality,double rating){
	System.out.println("Hospital details with parameter:"+hospitalName+","+location+","+doctors+","+beds+","+speciality+","+rating);
}
public Hospital(){
	System.out.println("default constructor");
}
public void display(){
	System.out.println("Hospital HospitalName:"+hospitalName);
	System.out.println("Hospital Location:"+location);
	System.out.println("Hospital Doctors:"+doctors);
	System.out.println("Hospital Beds:"+beds);
	System.out.println("Hospital Speciality:"+speciality);
	System.out.println("Hospital Rating:"+rating);
}
}
