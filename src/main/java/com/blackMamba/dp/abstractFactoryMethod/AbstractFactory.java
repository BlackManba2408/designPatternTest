package com.blackMamba.dp.abstractFactoryMethod;

/**
 * Created by Black Mamba on 2020/9/10 7:43
 *
 * @version 1.0
 * @description
 */
public abstract class AbstractFactory {

    abstract Vehicle createVehicle();

    abstract Food createFood();

    abstract Weapon createWeapon();
}
