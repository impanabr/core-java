class Fibonacci{
static void series(){
int a=0;
int b=1;
int c;
for(int i=1;i<=8;i++){
System.out.println(b);
c=a+b;
a=b;
b=c;
}
}
}
