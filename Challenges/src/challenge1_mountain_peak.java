public class challenge1_mountain_peak {
    public static Integer count_ways_to_summit(int n){
        if (n == 1) return 1;
        if (n == 2) return 2;
        int a = 1, b = 2;

        for(int i = 3; i<=n; i++){
            int c = a + b;
            a = b;
            b = c;
        } return b;
    }

    public static void main(String[] args){
        System.out.println("The number of combinations is : ");
        System.out.println(count_ways_to_summit(7));
    }
}
