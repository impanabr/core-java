class TwitterRunner{
	public static void main(String [] args){
		System.out.println("----First time method call----");
		String likith = Twitter.validateAndRegister(80865432187L,"Ant@5670","20-10-2000","likith","likith1");
		System.out.println(likith);
		
		System.out.println("----Second time method call----");
		String suma = Twitter.validateAndRegister(80865432187L,"Ant@5670","20-10-2010","suma","suma1");
		System.out.println(suma);
	}
}
	