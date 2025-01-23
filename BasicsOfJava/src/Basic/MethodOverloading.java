package Basic;
public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading1 obj = new MethodOverloading1();
        System.out.println(obj.add());
        System.out.println(obj.add(2,5.5f));
    }
}

class MethodOverloading1{
    
    int a=10, b = 20;
    //A Method Without parameters
    int add(){
        return a+b;
    }
    //method with two int parameters
    int add(int a , int b)
    {
        return a+b;
    }
    //method with three int parameters
    int add(int a , int b, int c)
    {
        return a+b+c;
    }
    //method with two float values
    float add (float a, float b)
    {
        return a+b;
    }
    //method with one int and one float input parameters
    float add( int a, float b ){
        return a+b;
    }
}
