class ProductRunner{

public static void main(String[] light){
Product.productId=501;
Product.price=18000.99;
Product.warrantyYears=2;
Product.inStock=true;
Product.productName="Washing Machine";

System.out.println("productId:"+Product.productId);
System.out.println("price:"+Product.price);
System.out.println("warrantyYears:"+Product.warrantyYears);
System.out.println("inStock:"+Product.inStock);
System.out.println("productName:"+Product.productName);
}
}