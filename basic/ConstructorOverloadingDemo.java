class ConstructorOverloadingDemo{
    int  value1;
    int  value2;
    ConstructorOverloadingDemo(){
     value1 = 10;
     value2 = 20;
     System.out.println("Inside 1st Constructor");
   }
   ConstructorOverloadingDemo(int a){
    value1 = a;
    System.out.println("Inside 2nd Constructor");
  }
  ConstructorOverloadingDemo(int a,int b){
  value1 = a;
  value2 = b;
  System.out.println("Inside 3rd Constructor");
 }
 public void display(){
    System.out.println("Value1 === "+value1);
    System.out.println("Value2 === "+value2);
}
public static void main(String args[]){
    ConstructorOverloadingDemo d1 = new ConstructorOverloadingDemo();
    ConstructorOverloadingDemo d2 = new ConstructorOverloadingDemo(30);
    ConstructorOverloadingDemo d3 = new ConstructorOverloadingDemo(30,40);
  d1.display();
  d2.display();
  d3.display();
}
}