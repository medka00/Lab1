package meedku;

import java.util.*;

public class Main {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		MyArrayLinearList list = new MyArrayLinearList();
		
		System.out.println("Elementiin too :");
		int n = sc.nextInt();
		
		System.out.println(n + " elementuudee oruul:");
        for (int i = 0; i < n; i++) {
            System.out.print((i+1) + ": ");
            int num = sc.nextInt();
            list.Push(num);
        }
		
        System.out.println("Elementuud: " + list);

        System.out.println("Minimium: " + list.min());
        System.out.println("Maximium: " + list.max());
        System.out.println("Sum: " + list.sum());
        System.out.println("Avarage: " + list.avarage());

        list.sort();
        System.out.println("Sort: " + list);
        
        list.removeOdd();
        System.out.println("Remove Odd: " + list);

        

        sc.close();
    }
}

