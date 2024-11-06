public class fibo {
    public static void main(String[] args)throws Exception {
        
        int a = 1;
        int b = 0;
        int c = 1;

            System.out.println(c+" ");
        for(int i=0; i<10; i++)
        {
             c = a + b;
             b = a;
             a = c;
            System.out.println(c+" ");
        }
    }
}
