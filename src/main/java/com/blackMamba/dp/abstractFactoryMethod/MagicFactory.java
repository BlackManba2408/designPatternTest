package com.blackMamba.dp.abstractFactoryMethod;

/**
 * Created by Black Mamba on 2020/9/10 7:55
 *
 * @version 1.0
 * @description
 */
public class MagicFactory extends AbstractFactory {

    @Override
    Vehicle createVehicle() {
        return new Broom();
    }

    @Override
    Food createFood() {
        return new MushRoom();
    }

    @Override
    Weapon createWeapon() {
        return new MagicStick();
    }
}
