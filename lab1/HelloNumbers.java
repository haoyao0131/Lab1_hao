public class HelloNumbers {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            int sum = 0;
            for (int j=0; j<i+1; j++){
                sum += j;
            }
            System.out.print(sum + " ");
        }
    }
}