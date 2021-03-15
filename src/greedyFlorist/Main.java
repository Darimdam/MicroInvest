package greedyFlorist;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int k= Integer.parseInt(sc.nextLine());
        int[] prices = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int minimumCost=getMinimumCost(k,prices);
        System.out.println("The minimum price is: " + minimumCost);


    }

    private static int getMinimumCost(int k, int[] c) {
        Arrays.sort(c);
        int previousPurchases=0;
        int minCost=0;
        int cnt=0;
        for (int i =c.length-1 ; i >=0; i--) {
            if(cnt==k) {
                previousPurchases++;
                cnt=0;
            }
            minCost+=(1+previousPurchases)*c[i];
            cnt++;

        }
        return minCost;
    }
}