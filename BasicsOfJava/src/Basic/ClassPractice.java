package Basic;
public class ClassPractice
{
    public static void main(String[] args) {
        Test obj = new Test();
        obj.add();
    }
}

class Test
{
    void add()
    {
        System.out.println("this will also work.");
    }
}