package com.blackMamba.dp.abstractFactoryMethod;

import com.blackMamba.dp.factoryMethod.Moveable;
import com.blackMamba.dp.factoryMethod.SimpleVehicleFactory;

/**
 * Created by Black Mamba on 2020/9/9 22:06
 *
 * @version 1.0
 * @description
 */
public class Main {

    public static void main(String[] args) {
//        // 现代人
//        Car car = new Car();
//        car.go();
//
//        M416 m416 = new M416();
//        m416.shoot();
//
//        Bread bread = new Bread();
//        bread.food();
//
//
//        // 外星人
//        Broom broom = new Broom();
//        broom.go();
//
//        MagicStick magicStick = new MagicStick();
//        magicStick.shoot();
//
//        MushRoom mushRoom = new MushRoom();
//        mushRoom.food();

        // 现代人
        // AbstractFactory abstractFactory = new ModerFactory();
        // 魔法人
        AbstractFactory abstractFactory = new MagicFactory();

        Vehicle vehicle = abstractFactory.createVehicle();
        vehicle.go();

        Food food = abstractFactory.createFood();
        food.food();

        Weapon weapon = abstractFactory.createWeapon();
        weapon.shoot();




    }
}
