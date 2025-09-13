package Advance_Level_Programs;

public class Perfect_Square_6 {
	

	    public static boolean isPerfectSquare(int n) {
	        if (n < 0)
	        	return false;

	        for (int i = 0; i * i <= n; i++) {
	            if (i * i == n) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        int n = 49;

	        if (isPerfectSquare(n)) {
	            System.out.println(n + " is a Perfect Square");
	        } else {
	            System.out.println(n + " is NOT a Perfect Square");
	        }
	    }
	}


