package innerclassexample.anonymous;

public class TestClass {

    public static void main(String[] args) {
        Test m=new Test(){
            @Override
            void testing() {
                System.out.println("This is testing without class");
            }
        };
        m.testing();
    }

}
