package com.blackMamba.dp.factoryMethod;


/**
 * Created by Black Mamba on 2020/9/9 22:07
 *
 * @version 1.0
 * @description
 */
public class SimpleVehicleFactory {

//    public Car createCar(){
//        // TODO: 2020/9/9
//        System.out.println("log.info(a car is created!)");
//        return new Car();
//    }
//
//    public Plane createPlane(){
//        // TODO: 2020/9/9
//        System.out.println("log.info(a plane is created!)");
//        return new Plane();
//    }

    public Moveable createCar(){
        // TODO: 2020/9/9
        System.out.println("log.info(a car is created!)");
        return new Car();
    }

    public Moveable createPlane(){
        // TODO: 2020/9/9
        System.out.println("log.info(a plane is created!)");
        return new Plane();
    }

}
