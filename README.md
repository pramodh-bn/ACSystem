# ACSystem

Problem Statement

A software subsystem of an air-traffic control system is defined to manage a queue of aircraft (AC) in an airport.  The aircraft queue is managed by a process that 
responds to three types of requests: 
  1. System boot used to start the system.
  2. Enqueue aircraft used to insert a new AC into the system. 
  3. Dequeue aircraft used to remove an AC from the system.

AC’s have at least (but are not limited to having) the following properties: 
  1. AC type:  Passenger or Cargo
  2. AC size:  Small or Large

The process that manages the queue of AC’s satisfies the following: 
  1. There is no limit to the number of AC’s it can manage.
  2. Dequeue aircraft requests result in selection of one AC for removal such that:
    a. Passenger AC’s have removal precedence over Cargo AC’s.
    b. Large AC’s of a given type have removal precedence over Small AC’s of the same type.
    c. Earlier enqueued AC’s of a given type and size have precedence over later enqueued AC’s of the same type and size.
