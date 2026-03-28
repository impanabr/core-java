class SnapchatRunner{
	public static void main(String [] args){
		System.out.println("----First time method call----");
		String bhavith = Snapchat.validateAndRegister(80865432187L,"Ant@5670","20-10-2000","bhavith","bhavith1");
		System.out.println(bhavith);
		
		System.out.println("----Second time method call----");
		String vidya = Snapchat.validateAndRegister(80865432187L,"Ant@5670","20-10-2010","vidya","vidya1");
		System.out.println(vidya);
	}
}
	