class NetflixRunner{
	public static void main(String [] args){
		System.out.println("----First time method call----");
		String rohan = Netflix.validateAndRegister(80865432187L,"Ant@5670","20-10-2000","rohan","rohan1");
		System.out.println(rohan);
		
		System.out.println("----Second time method call----");
		String keerthana = Netflix.validateAndRegister(80865432187L,"Ant@5670","20-10-2010","keerthana","keerthana1");
		System.out.println(keerthana);
	}
}
	