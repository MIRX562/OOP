public class Mtable {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("\nMultiplication_Table\n");
        System.out.println("X\t|\t1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
        System.out.println("________|___________________________________________________________________________________");
        System.out.println(" \t|");
        for(int i=1;i<=10;i++){
            System.out.printf("%5d   |\t",i);
            for(int j=1;j<=10;j++){
                System.out.print(i%j+"\t");
                Thread.sleep(30);
            }
            System.out.println("");
            System.out.println("________|___________________________________________________________________________________");
            System.out.println(" \t|");
        }
    }
}
