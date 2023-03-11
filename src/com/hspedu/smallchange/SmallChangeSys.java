package com.hspedu.smallchange;

import java.util.Scanner;

public class SmallChangeSys {

    public static void main(String[] args) {
        boolean loop = true;
        Scanner scanner = new Scanner(System.in);
        String key = "";
        do {
            System.out.println("==============零钱通菜单===============");
            System.out.println("\t\t\t 1.零钱通明细");
            System.out.println("\t\t\t 2.收益入账");
            System.out.println("\t\t\t 3.消费明细");
            System.out.println("\t\t\t 4.退   出");

            System.out.print("请选择（1-4）：");
            key = scanner.next();
            switch (key) {
                case "1":
                    System.out.println("1.零钱通明细");
                    break;
                case "2":
                    System.out.println("2.收益入账");
                    break;
                case "3":
                    System.out.println("3.消费明细");
                    break;
                case "4":
                    System.out.println("4.退   出");
                    loop = false;
                    break;
                default:
                    System.out.println("您的输入有误，请重新输入！");
            }

        } while (loop);
        System.out.println("-----------零钱通项目已退出---------------");
    }
}
