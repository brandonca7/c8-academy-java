package com.bptn.course._11_linked_list;

import java.util.LinkedList;

public class GameInventoryManager {
    public static void main(String[] args) {
        // 1. Create and populate the inventory
        LinkedList<String> inventory = new LinkedList<String>();
        inventory.add("Sword");
        inventory.add("Potion (Common)");
        inventory.add("Shield");
        inventory.add("Coin Bag (Common)");
        inventory.add("Axe");
        
        // 2. Search for Insertion Point
        int index = -1;
        for(String item:inventory) {
        	if(item.contains("(Common)")) {
        		index = inventory.indexOf(item);
        		break;
        	}
        }
        
        System.out.println("First Common Item Index: "+index);
 
        // 3. Insert Rare Item after the common item
        inventory.add(index+1, "Dragon Scale Armor (Rare)");
        
        // 4. Discard Item (Note: Index 3 after insertion is "Shield")
        System.out.println("Item discarded from inventory: "+inventory.remove(3));  
        
        // 5. Final Inventory
        System.out.println("Final Inventory Size: "+inventory.size());
        System.out.println("Final Inventory: "+inventory);
        
    }
}

