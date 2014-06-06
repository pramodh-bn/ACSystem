package com.ac.sub.sys;

import java.util.Comparator;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created on 5/2/2014.
 * Main Aircraft Object which has information about the aircraft
 * Main important variables are type and size.
 * This also implements Comparable Interface.
 */
public class Aircraft implements Comparable{
    private String name;
    private int type;
    private int size;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Aircraft(String name, int type, int size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.getName() + " " + getTypeName(this.getType()) + " " + getSizeName(this.getSize());
    }

    private static String getSizeName(int size){
        return size == AircraftConstants.AIR_CRAFT_SIZE_LARGE ? "Large" : "Small";
    }

    private static String getTypeName(int type){
        return type == AircraftConstants.AIR_CRAFT_TYPE_CARGO? "CARGO" : "PASSENGER";
    }

    /**
     * The main method which implements the business rule.
     * a. Passenger AC’s have removal precedence over Cargo AC’s.
     * b. Large AC’s of a given type have removal precedence over Small AC’s of the same type.
     * c. Earlier enqueued AC’s of a given type and size have precedence over later enqueued
     * AC’s of the same type and size.
     * @param o other aircraft
     * @return whether this object is greater than object passed to it.
     */
   @Override
   public int compareTo(Object o) {
       Aircraft o1 = this;
       Aircraft o2 = (Aircraft)o;
       if(Math.abs(o1.getType() - o2.getType()) > 0)
           return o1.getType() - o2.getType();
       else if(o1.getType() == o2.getType()){
           if(Math.abs(o1.getSize() - o2.getSize()) > 0)
               return o1.getSize() - o2.getSize();
       }
       return o1.getCount() > o2.getCount()? 1 : -1;
   }

}
