class InstagramRunner{
	public static void main(String [] args){
		System.out.println("----First time method call----");
		String vedanth = Instagram.validateAndRegister(70865432187L,"Ant@5670","24-12-2018","vedanth Raj","vedanth1");
		System.out.println(vedanth);
		
		System.out.println("----Second time method call----");
		String preethi = Instagram.validateAndRegister(63865432187L,"Ant@5670","20-10-2017","preethi Raj","preethi1");
		System.out.println(preethi);
	}
}
	

		