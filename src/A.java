import javafx.scene.shape.Circle;

class Test {
    int count;
    public static void main(String[] args) {  } public int getCount() { return count;  }
    public int factorial(int n)
    { int result = 1;
    for (int i = 1; i <= n; i++)
        result *= i; return result;  } }


    class C {
    public static void main(String[] args) {method1();}
    public static void method1() {method2();}            //Den viser kun method2 en gang, så man kan ikke ha' en method inde i en method.
    public static void method2() {System.out.println("What is radius " + c.getRadius());}
      static Circle c = new Circle();
}
