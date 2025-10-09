package com.bptn.course._11_linked_list;

import java.util.LinkedList;
import java.util.Deque;

public class TicketQueueManager {
    public static void main(String[] args) {
        // 1. Create a LinkedList to act as a Queue
    	Deque<String> myQueue = new LinkedList<String>();
    	
        // 2. New Tickets Arrive (Add to tail using Queue method)
    	myQueue.offer("101");
    	myQueue.offer("102");
    	myQueue.offer("103");
    	
        // 3. Agent Checks Queue (Peek)
    	System.out.println("Next ticket to be handled (peek): "+myQueue.peek());

        // 4. Process Ticket (Poll) - removes from head
        System.out.println("Processing ticket: "+myQueue.poll());
        
        // 5. Urgent New Ticket (Offer First)
        myQueue.offerFirst("99");

        // 6. Process Next
        System.out.println("Processing ticket: "+myQueue.poll());
        
        // Final Check
        System.out.println("Tickets remaining in queue: "+myQueue);
    }
}

