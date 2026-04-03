class Website{
String domainName;
String owner;
String hostingProvider;
int pages;
long traffic;
boolean sslEnabled;

public Website(String domainName,String owner,String hostingProvider,int pages,long traffic,boolean sslEnabled){
	System.out.println("Websitedetails with parameter:"+domainName+","+owner+","+hostingProvider+","+pages+","+traffic+","+sslEnabled);
}
public Website(){
	System.out.println("default constructor");
}
public void display(){
	System.out.println("Website DomainName:"+domainName);
	System.out.println("Website Owner:"+owner);
    System.out.println("Website HostingProvider:"+hostingProvider);
    System.out.println("Website Pages:"+pages);
    System.out.println("Website Traffic:"+traffic);
    System.out.println("Website SslEnabled:"+sslEnabled);

}
}
