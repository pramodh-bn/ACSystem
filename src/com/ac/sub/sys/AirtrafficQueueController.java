package com.ac.sub.sys;

import java.util.Date;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created on 5/2/2014.
 * This is the main controller class.
 * It maintains a priority blocking queue.
 * Also maintains a counter which will be added to the object before adding to queue.
 * This counter helps finding out the priority order when size and type of aircraft are equal
 */
public class AirtrafficQueueController {
    private PriorityBlockingQueue<Aircraft> aircraftQueue;
    private AtomicInteger atomicInteger;

    // Start of the system method
    public void startSystem(){
        this.aircraftQueue =    new PriorityBlockingQueue<Aircraft>();
        this.atomicInteger = new AtomicInteger();
        System.out.println("System started");
    }

    // Method for queueing
    public void enqueueAircraft(Aircraft ac){
        ac.setCount(this.atomicInteger.getAndIncrement());
        this.aircraftQueue.add(ac);
        System.out.println("Aircraft " + ac.toString() + " added to queue");

    }

    // Method for removing the aircraft from the queue
    public void dequeueAircraft(){
        Aircraft cd = this.aircraftQueue.poll();
        System.out.println("Aircraft "+ cd.toString() + " dequeued");
    }
}
