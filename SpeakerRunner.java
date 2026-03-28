class SpeakerRunner{
public static void main(String[] voice){
	System.out.println("----First Time Method Call----");
	boolean speakerStatus = Speaker.onOrOff();
	System.out.println("Main Method SpeakerStatus:"+speakerStatus);
	
	System.out.println("----Second Time Method Call----");
	Speaker.onOrOff();
	
	System.out.println("----Third Time Method Call----");
	Speaker.onOrOff();
	
	System.out.println("----Fourth Time Method Call----");
	Speaker.onOrOff();
	
	System.out.println("----Fifth Time Method Call----");
    Speaker.onOrOff();
}
}
