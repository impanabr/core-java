class WebsiteRunner{
public static void main(String[]args){
        Website ref=new Website("SmartShop.in","Bharath","GoDaddy",20,16000,true);
		Website refl=new Website();
		ref.domainName="SmartShop.in";
        ref.owner="Arjun Singh";
		ref.hostingProvider="GoDaddy";
		ref.pages=10;
		ref.traffic=15000;
		ref.sslEnabled=false;
		ref.display();
	}
}