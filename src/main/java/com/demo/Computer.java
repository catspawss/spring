package com.demo;

import com.util.SpringTool;

/**
 * 电脑类
 */
public class Computer {
    //控制反转,类失去new对象的权利，控制权交给了Spring容器
    private Printable printable;

    public void setPrintable(Printable printable) {
        this.printable = printable;
    }

    public void print(){
        if (printable != null){
            printable.print();
        }else{
            System.out.println("===没有连接打印机===");
        }
    }

    public static void main(String[] args) {
        Computer computer = (Computer)SpringTool.getBean("computer");
        computer.print();
    }
}
