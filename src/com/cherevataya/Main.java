package com.cherevataya;

import com.cherevataya.sample.*;

import java.util.ArrayList;
import java.util.List;

/*
1) Есть игра в которой клетчастое поле (например размером 10x10 клеток) и юниты, в одной клетке один юнит.
   Есть 4 типа юнитов: башня, забор, содат и танк.
   Забор ничего не делает и может быть разрушен
   Башня ничего не делает и безсмертна
   Солдат стреляет и двигается - у него можно вызвать методы move() и fire()
   Танк умеет то же что и солдат, плюс еще у него есть метод reload()
   Создать классы которые соотвествует каждому юниту и использовать extends если это целесообразно.
   Может быть болльше классов чем перечилено в задаче если нужно.
   Создать список в котором есть юниты всех типов.
 */

public class Main {

    public static void main(String[] args) {
        Soldier soldier = new Soldier(5, 7);
        soldier.move();
        soldier.shoot();

        Tank tank = new Tank(3, 4);
        tank.move();
        tank.shoot();
        tank.reloading();

        List<Generic> units = new ArrayList<>();
        units.add(soldier);
        units.add(tank);
        units.add(new Fence(1, 10));
        units.add(new Tower(5, 8));
        System.out.println(units);

        displayAll(units);
    }

    private static void displayAll(List<Generic> units) {
        for (Generic unit : units) {
            unit.draw();
        }
    }
}
