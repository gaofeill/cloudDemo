package com.goofy.client.algorithm;

/**
 * 古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第四个月后每个月又生一对兔子，假如兔子都不
 * 死，问每个月的兔子总数为多少？升级版(输入一个兔子的数量,问最少多少个月可以达到?)
 * 程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
 * 也就是说当月兔子的数量=上月个兔子的数量+当月出生量(即三个月前的数量)
 * Created by jinFei on 2020-7-30.
 */
public class ArithmeticRabbit {
    public static void main(String[] args) {
        int index = 10;
        //外部输入参数判断
        if (args != null && args.length > 0) {
            index = Integer.parseInt(args[0]);
        }
        /*int num=getMonth(index);
        System.out.println(index + "只兔子,至少需要" + num + "个月");*/
        System.out.println(getNum(2));
    }

    //递归,根据上个月的兔子和这个月即将生的兔子获得这个月兔子的总和
    public static int getNum(int month) {
        if (month == 1 || month == 2) {
            return 1;
        } else {
            return getNum(month - 1) + getNum(month - 2);
        }
    }

    //判断第几个月能省10个
    private static int getMonth(int index){
        //从第一个月开始
        int i = 1;
        while (getNum(i) < index) {
            i++;
        }
        //查看每个月兔子的数量
        for(int j=1;j<=index;i++){
            System.out.println("第"+j+"个月,有"+getNum(i));
        }
        return i;
    }
}
