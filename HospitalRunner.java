class HospitalRunner{

public static void main(String[] nurse){
Hospital.totalBeds=250;
Hospital.rating=4.5f;
Hospital.contactNumber=9076543210L;
Hospital.emergencyAvailable=true;
Hospital.hospitalName="CityCare";

System.out.println("totalBeds:"+Hospital.totalBeds);
System.out.println("rating:"+Hospital.rating);
System.out.println("contactNumber:"+Hospital.contactNumber);
System.out.println("emergencyAvailable:"+Hospital.emergencyAvailable);
System.out.println("hospitalName:"+Hospital.hospitalName);
}
}

