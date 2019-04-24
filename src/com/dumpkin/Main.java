//Avivi lesson homework 5

//Створити клас Robot від якого слід наслідувати CoffeRobot, RobotDancer, RobotCoocker. В Robot є метод work() ,
//в якому слід описати роботу яку виконує кожен з роботів.
//Для Robot в методі work() слід написати код, щоб на консоль виводився наступний
//текст «Я Robot – я просто працюю».
//Для CoffeRobot в методі work() слід написати код, щоб на консоль виводився
//наступний текст «Я CoffeRobot – я варю каву».
//Для RobotDancer в методі work() слід написати код, щоб на консоль виводився
//наступний текст «Я RobotDancer – я просто танцюю».
//Для RobotCoocker в методі work() слід написати код, щоб на консоль виводився
//наступний текст «Я RobotCoocker – я просто готую».
//Створити в Main класі екземпляри даних класів і викликати до кожного з них метод work().


package com.dumpkin;

public class Main {

    public static void main(String[] args) {

        //create cofferobot object
        CoffeRobot coffeRobot = new CoffeRobot();
        coffeRobot.work();
        coffeRobot.robotSay();

        //create RobotDancer object
        RobotDancer robotDancer = new RobotDancer();
        robotDancer.work();
        robotDancer.robotSay();

        //create RobotCoocker object
        RobotCoocker robotCoocker = new RobotCoocker();
        robotCoocker.work();
        robotCoocker.robotSay();

    }
}
