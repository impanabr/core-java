class WhatsAppRunner{
	public static void main(String [] args){
		System.out.println("----First time method call----");
		String arjun = WhatsApp.validateAndRegister(80865432187L,"Ant@5670","20-10-2000","arjun","arjun1");
		System.out.println(arjun);
		
		System.out.println("----Second time method call----");
		String leena = WhatsApp.validateAndRegister(80865432187L,"Ant@5670","20-10-2010","WhatsApp","WhatsApp1");
		System.out.println(leena);
	}
}
	