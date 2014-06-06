package com.ac.sub.sys;

/**
 * Created on 5/2/2014.
 */
public class Main {

    public static void main(String[] args) {
        Main mainSystem = new Main();
        System.out.println("starting the system");
        mainSystem.aqm_request_process(RequestType.SYSTEM_BOOT, null);
        System.out.println("Adding Aircrafs to the system now");
        Aircraft aircraft1 = new Aircraft("CL1", AircraftConstants.AIR_CRAFT_TYPE_CARGO, AircraftConstants.AIR_CRAFT_SIZE_LARGE);
        Aircraft aircraft2 = new Aircraft("PL1", AircraftConstants.AIR_CRAFT_TYPE_PASSENGER, AircraftConstants.AIR_CRAFT_SIZE_LARGE);
        Aircraft aircraft3 = new Aircraft("CS1", AircraftConstants.AIR_CRAFT_TYPE_CARGO, AircraftConstants.AIR_CRAFT_SIZE_SMALL);
        Aircraft aircraft4 = new Aircraft("PS1", AircraftConstants.AIR_CRAFT_TYPE_PASSENGER, AircraftConstants.AIR_CRAFT_SIZE_SMALL);
        Aircraft aircraft5 = new Aircraft("CL2", AircraftConstants.AIR_CRAFT_TYPE_CARGO, AircraftConstants.AIR_CRAFT_SIZE_LARGE);
        Aircraft aircraft6 = new Aircraft("PL2", AircraftConstants.AIR_CRAFT_TYPE_PASSENGER, AircraftConstants.AIR_CRAFT_SIZE_LARGE);
        Aircraft aircraft7 = new Aircraft("CS2", AircraftConstants.AIR_CRAFT_TYPE_CARGO, AircraftConstants.AIR_CRAFT_SIZE_SMALL);
        Aircraft aircraft8 = new Aircraft("PS2", AircraftConstants.AIR_CRAFT_TYPE_PASSENGER, AircraftConstants.AIR_CRAFT_SIZE_SMALL);
        Aircraft aircraft9 = new Aircraft("CL3", AircraftConstants.AIR_CRAFT_TYPE_CARGO, AircraftConstants.AIR_CRAFT_SIZE_LARGE);
        mainSystem.aqm_request_process(RequestType.ENQUEUE, aircraft1);
        mainSystem.aqm_request_process(RequestType.ENQUEUE, aircraft2);
        mainSystem.aqm_request_process(RequestType.ENQUEUE, aircraft3);
        mainSystem.aqm_request_process(RequestType.ENQUEUE, aircraft4);
        mainSystem.aqm_request_process(RequestType.ENQUEUE, aircraft5);
        mainSystem.aqm_request_process(RequestType.ENQUEUE, aircraft6);
        mainSystem.aqm_request_process(RequestType.ENQUEUE, aircraft7);
        mainSystem.aqm_request_process(RequestType.ENQUEUE, aircraft8);
        mainSystem.aqm_request_process(RequestType.ENQUEUE, aircraft9);
        //mainSystem.aqm_request_process(4, aircraft5);
        System.out.println("********************************************");
        mainSystem.aqm_request_process(RequestType.DEQUEUE, null);
        mainSystem.aqm_request_process(RequestType.DEQUEUE, null);
        mainSystem.aqm_request_process(RequestType.DEQUEUE, null);
        mainSystem.aqm_request_process(RequestType.DEQUEUE, null);
        mainSystem.aqm_request_process(RequestType.DEQUEUE, null);
        mainSystem.aqm_request_process(RequestType.DEQUEUE, null);
        mainSystem.aqm_request_process(RequestType.DEQUEUE, null);
        mainSystem.aqm_request_process(RequestType.DEQUEUE, null);
        mainSystem.aqm_request_process(RequestType.DEQUEUE, null);
    }

    private AirtrafficQueueController controller=new AirtrafficQueueController();

    public void aqm_request_process(int type, Aircraft ac){
        switch (type){
            case RequestType.SYSTEM_BOOT:
                controller.startSystem();
                break;
            case RequestType.ENQUEUE:
                controller.enqueueAircraft(ac);
                break;
            case RequestType.DEQUEUE:
                controller.dequeueAircraft();
                break;
        }
    }

}
