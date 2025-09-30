package com.bptn.course._06_oop_basics;

public class StaticMethod {

	public static int chorus(String start, String end) {
	    System.out.println(start + " I'm looking over a four-leaf clover");
	    System.out.println("That I overlooked before "+ end);
	    return 10;
	}

	public static void main(String args[]) {
	    int result = chorus("Start","End");
	    System.out.print(result);
	    System.out.println("One leaf is sunshine, the second is rain");
	    System.out.println("Third is the roses that grow in the lane");
	    System.out.println();
	    System.out.println("No need explaining, the one remaining");
	    System.out.println("Is somebody I adore");
	    chorus("Start","End");
	}

}
