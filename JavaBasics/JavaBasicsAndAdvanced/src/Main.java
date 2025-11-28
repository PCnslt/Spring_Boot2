//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws CustomExceptionMessage {

        Student s1 = new Student(23, "Steve");

        System.out.println(s1.toString());

        Interview i = new Interview();

        i.division();

        }
    }

    class Student{

    private int  rollNum;
    private String name;

    public Student(int rollNum, String name){
        this.rollNum    = rollNum;
        this.name = name;
    }

    Runnable sayHello = ()->System.out.println("Hello world from Lambda.");

        @Override
        public String toString() {

        String s = "{rollNum:"+this.rollNum+", name:"+this.name+"}";
            return s;
        }
    }

    interface TA{
        int show();
    }

    class Interview{

        public int exampleLambda(int i) {

            TA s = () -> 5;

            return s.show();
        }

        public int division() throws CustomExceptionMessage {
        try {
            int num = 12;
            int divisor = 0;
            return num / divisor;
        }catch(Exception e){
            throw new CustomExceptionMessage("Production wrong.");
        }

        }


    }

    class CustomExceptionMessage extends Exception{

    public CustomExceptionMessage(String msg){
            super(msg);
    }
    }