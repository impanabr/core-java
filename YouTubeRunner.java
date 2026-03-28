class YouTubeRunner{
	public static void main(String [] args){
		System.out.println("----First time method call----");
		String rohith = YouTube.validateAndRegister(80865432187L,"Ant@5670","20-10-2007","rohith","rohith1");
		System.out.println(rohith);
		
		System.out.println("----Second time method call----");
		String spoorthi = YouTube.validateAndRegister(80865432187L,"Ant@5670","20-10-2009","spoorthi","spoorthi1");
		System.out.println(spoorthi);
	}
}
	