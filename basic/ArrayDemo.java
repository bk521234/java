class ArrayDemo {
    public static void passByReference(String a[]) {
        a[0] = "Changed";
    }

    public static void main(String args[]) {
        String []b = {"Apple", "Mange", "Orange"};
        System.out.println("Before Function Call    "+b[0]);
        ArrayDemo.passByReference(b);
        System.out.println("After Function Call    "+b[0]);
    }
}