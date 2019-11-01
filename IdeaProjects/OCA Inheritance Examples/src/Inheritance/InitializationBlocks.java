package Inheritance;

public class InitializationBlocks {
    InitializationBlocks(int unalo){
        System.out.println("one-arg const");
    }
    InitializationBlocks() {
        System.out.println("n-arg " +
                "");
    }
    static {
        System.out.println("1st instance init");
    }
    {
        System.out.println("2nd instance init");
    }
    static {
        System.out.println("2nd static init");
    }

    public static void main(String[] args) {
        new InitializationBlocks();
        new InitializationBlocks(5);
    }
}
