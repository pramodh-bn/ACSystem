package com.ac.sub.sys;

/**
 * Created on 5/2/2014.
 * What kind of request is being passed to aqm_request_process
 */
public interface RequestType {
    public static final int SYSTEM_BOOT = 1;
    public static final int ENQUEUE = 2;
    public static final int DEQUEUE = 3;
}
