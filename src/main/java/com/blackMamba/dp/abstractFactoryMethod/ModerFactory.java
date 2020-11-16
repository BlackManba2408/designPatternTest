package com.blackMamba.dp.abstractFactoryMethod;

/**
 * Created by Black Mamba on 2020/9/10 7:54
 *
 * @version 1.0
 * @description
 */
public class ModerFactory extends AbstractFactory {

    @Override
    Vehicle createVehicle() {
        return new Car();
    }

    @Override
    Food createFood() {
        return new Bread();
    }

    @Override
    Weapon createWeapon() {
        return new M416();
    }
}
