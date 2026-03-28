class FacebookRunner{
	public static void main(String [] args){
		System.out.println("----First time method call----");
		String likitha = Facebook.validateAndRegister(80865432187L,"Ant@5670","20-10-2000","likitha","likitha1");
		System.out.println(likitha);
		
		System.out.println("----Second time method call----");
		String sumanth = Facebook.validateAndRegister(80865432187L,"Ant@5670","20-10-2010","sumanth","sumanth1");
		System.out.println(sumanth);
	}
}
	