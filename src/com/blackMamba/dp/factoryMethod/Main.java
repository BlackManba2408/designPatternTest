package com.blackMamba.dp.factoryMethod;

/**
 * Created by Black Mamba on 2020/9/9 22:06
 *
 * @version 1.0
 * @description
 */
public class Main {

    public static void main(String[] args) {
//        Car car = new Car();
//        car.go();
//
//        Plane plane = new Plane();
//        plane.go();

//        Moveable moveable = new Car();
//        moveable.go();
//
//        Moveable moveable1 = new Plane();
//        moveable1.go();

//        Car car = new SimpleVehicleFactory().createCar();
//        car.go();
//
//        Plane plane = new SimpleVehicleFactory().createPlane();
//        plane.go();

        Moveable moveable = new SimpleVehicleFactory().createCar();
        moveable.go();

        Moveable moveable1 = new SimpleVehicleFactory().createPlane();
        moveable1.go();
    }
}
