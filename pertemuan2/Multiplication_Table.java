public class Multiplication_Table {
    public static void main(String[] args) {
        System.out.println("  | 1\t2\t3\t4\t5\t6\t7\t8\t9\t10");
        System.out.println("-----------------------------------------------------------------------------");
        for(int i=1;i<10;i++){
            System.out.print(i+" | ");
            for(int j=1;j<10;j++){
                System.out.print(i*j+"\t");
            }
            System.out.println("");
    }    
}
}