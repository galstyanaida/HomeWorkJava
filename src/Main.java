public class Main {
    public static void main(String[] args) {
        MyStaticClass instance1 = new MyStaticClass();
        MyStaticClass instance2 = new MyStaticClass();
        MyStaticClass instance3 = new MyStaticClass();

        int numInstances =MyStaticClass.getNumInstances();
        System.out.println("Number of instances created: " + numInstances);

        MyStaticBlock myStaticBlock= new MyStaticBlock();
    }
}