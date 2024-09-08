public class dynamicmethoddispatch {
    public static void main(String[] args) {
        one obj = new one();

        // obj.name();

        // two obj2 = new two();


        one obj3=new two();
        obj3.greet();
        obj3.name();
        // obj3.welcome();

    }

}

class one {
    public void name() {
        System.out.println("my name is java");
    }

    public void greet() {
        System.out.println("happy greetinga");
    }
}

class two extends one {
    @Override
    public void name() {
        System.out.println("my nameis c");
    }



    public void welcome() {
        System.out.println("my welcome");
    }
}