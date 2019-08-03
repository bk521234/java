class ConstructorChainingDemo{
    int  value1;
    int  value2;
    ConstructorChainingDemo(){
       value1 = 1;
       value2 = 2;
       System.out.println("Inside 1st Parent Constructor");
    }
    ConstructorChainingDemo(int a){
       value1 = a;
       System.out.println("Inside 2nd Parent Constructor");
    }
   public void display(){
      System.out.println("Value1 === "+value1);
      System.out.println("Value2 === "+value2);
   }
   public static void main(String args[]){
    ConstructorChainingDemoChild d1 = new ConstructorChainingDemoChild();
      d1.display();
   }
 }
 class ConstructorChainingDemoChild extends ConstructorChainingDemo{
     int value3;
     int value4;
     ConstructorChainingDemoChild(){
     super(5); // super(<parameters for Parent Constructor>) can be called to override default parent() constructor
      value3 = 3;
      value4 = 4;
     System.out.println("Inside the Constructor of Child");
     }
     public void display(){
       System.out.println("Value1 === "+value1);
       System.out.println("Value2 === "+value2);
       System.out.println("Value1 === "+value3);
       System.out.println("Value2 === "+value4);
    }
 }