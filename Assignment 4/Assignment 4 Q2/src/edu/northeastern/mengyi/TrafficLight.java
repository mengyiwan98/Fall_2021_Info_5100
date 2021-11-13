package edu.northeastern.mengyi;

import sun.misc.Signal;

class TrafficLight {

    boolean isAGreen;

    public TrafficLight() {
        isAGreen = true;
    }

    synchronized public void carArrived(
            int carId,           // ID of the car
            int roadId,          // ID of the road the car travels on. Can be 1 (road A) or 2 (road B)
            int direction,       // Direction of the car
            Runnable turnGreen,  // Use turnGreen.run() to turn light to green on current road
            Runnable crossCar    // Use crossCar.run() to make car cross the intersection
    ) {
        if(roadId == 2 && isAGreen==true ||roadId == 1 && isAGreen == false) {
            turnGreen.run();
            isAGreen = !isAGreen;
        }
        crossCar.run();
    }
}

