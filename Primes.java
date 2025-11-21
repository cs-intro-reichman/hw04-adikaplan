public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if(n<2){
            System.out.println("No Prime Numbers");
            return;
        }
        int sqrtN = (int)Math.sqrt(n);
        boolean[] arr = new boolean[n+1];
        for(int i = 2; i< n+1 ; i++){
             arr[i] = true;  
        }
        int p =2;
        while( p <= sqrtN){
            for(int i = p+1; i < n+1;i++){
        if(i % p == 0 && arr[i] == true){
                arr[i] = false;
            }
        }
        p++;
        while(arr[p] == false){
            p++;
        }
    }
    System.out.println("Prime numbers up to " + n + ":");
    int counter = 0;
    for(int i = 2; i< n+1; i++){
        if(arr[i] == true){
            System.out.println(i);
            counter++;
        }
    }
    int precent = (counter* 100)/(n);
    System.out.println("There are " + counter + " primes between 2 and " + n +" (" + precent +  "% are primes"+ ")");
    }
}