package com.wooui.learnJavaThread;

public class CalcPrimes extends Thread {
    public static final int MAX_PRIMES = 100;
    public static final int TEN_SECONDS = 10000;
    
    public  boolean finished = false;

    @Override
    public void run() {
        int[] primes = new int[MAX_PRIMES];
        int count = 0;
        
        for(int i=2; count<MAX_PRIMES;i++){
            if(finished){
                break;
            }
            
            boolean prime = true;
            
            for(int j=0; j<count;j++){
                if(i % primes[j] == 0){
                    prime = false;
                    break;
                }
            }
            if(prime){
                primes[count++] = i;
                System.out.println("Found prime: " + i);
            }
        }
    }
    
    public static void main(String[] args) {
        CalcPrimes calculator = new CalcPrimes();
        calculator.start();
        try{
            Thread.sleep(TEN_SECONDS);
        }catch(InterruptedException e){
            
        }
        System.out.println("wakeup");
        calculator.finished = true;
    }

}
