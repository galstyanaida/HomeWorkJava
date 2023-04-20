public class MyStaticClass {
    private static int numInstance = 0;

    public MyStaticClass() {
        numInstance++;
    }

    public static int getNumInstances() {
        return numInstance;
    }
}
