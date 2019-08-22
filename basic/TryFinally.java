class TryFinally {
    public static void main(String args[]){
        try{
            int d = 1;
            int n =20;
            int fraction = n/d;
        } catch (ArithmeticException e) {
            System.out.println("In the catch clock due to Exception = "+e);
        } finally {
            System.out.println("Inside the finally block");
        }
    }
}
