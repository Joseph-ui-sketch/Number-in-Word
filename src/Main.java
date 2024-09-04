public class Main {

    public static void main(String[] args) {
        printNumberInWord(0);
        printNumberInWord(1);
        printNumberInWord(2);
        printNumberInWord(3);
        printNumberInWord(4);
        printNumberInWord(5);
        printNumberInWord(6);
        printNumberInWord(7);
        printNumberInWord(8);
        printNumberInWord(9);
        printNumberInWord(10);
        printNumberInWord(-1);
    }

    public static void printNumberInWord(int number) {

        //Traditional Version;
        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case (1 & 9):
            default:
                System.out.println("OTHER");
                break;
        }

        //Enhanced Version;
        switch (number) {
            case 0: System.out.println("ZERO");
            case (1 & 9):
            default:
                System.out.println("OTHER");
        }

    }

}