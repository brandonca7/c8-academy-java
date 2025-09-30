package com.bptn.course._06_oop_basics;

public class CafeCalculator {
	
	public double calculateItemRevenue(double pricePerItem, double numberOfItemsSold) {
		return pricePerItem * numberOfItemsSold;
	}
	
	public double calculateDailyTotalRevenue(double coffeeRevenue, double pastryRevenue) {
		return coffeeRevenue + pastryRevenue;
	}

    public static void main(String[] args) {
    	
    	CafeCalculator myObj = new CafeCalculator();

        // --- Step 1: Calculate revenue for each item type using
    	//our custom method ---
    	double dailyCoffeeRevenue = myObj.calculateItemRevenue(10, 5);
    	double dailyPastryRevenue = myObj.calculateItemRevenue(5, 12);
    	
        // --- Step 2: Calculate the total daily revenue using
    	// another custom method ---
    	double dailyTotalRevenue = myObj.calculateDailyTotalRevenue(dailyCoffeeRevenue, dailyPastryRevenue);

        // --- Step 3: Print out the results ---
    	System.out.println("Daily Coffee Revenue: "+dailyCoffeeRevenue);
    	System.out.println("Daily Pastry Revenue: "+dailyPastryRevenue);
    	System.out.println("Total Daily Revenue: "+dailyTotalRevenue);

    }
}
