/*
 * created by: aek426rahmani
 * date: 27-12-2022
 */
package com.aek426rahmani.examples;

public class HumanEmp implements Sleeper, Eater, Worker{
    @Override
    public void eat() {
        System.out.println("Human is eating");
    }
    @Override
    public void sleep() {
        System.out.println("Human is sleeping");
    }
    @Override
    public void work() {
        System.out.println("Human is working");
    }
}

public class RobotEmp implements  Worker{
    @Override
    public void work() {
        System.out.println("Robot is working");
    }
}

public interface Eater {
    void eat();
}

public interface Sleeper {
    void sleep();
}

public interface Worker {
    void work();
}

public class App {
    public static void main(String[] args) {
        HumanEmp humanEmp = new HumanEmp();
        RobotEmp robotEmp = new RobotEmp();
        humanEmp.eat();
        humanEmp.sleep();
        humanEmp.work();
        robotEmp.work();
    }
}
