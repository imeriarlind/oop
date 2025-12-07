package session13.basic;

public class BasicClass extends OtherClass implements Inter1, Inter2 {
    public void test1()
    {
        System.out.println("test1 "+Inter1.COUNT);
    }

    @Override
    public void test2() {
        System.out.println("test2 ");
    }


    @Override
    public void otherMethod() {

    }

    public void basic()
    {
        System.out.println("basic method");
    }
}
