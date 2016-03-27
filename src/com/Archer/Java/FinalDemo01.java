package com.Archer.Java;

/**
 * final关键字的使用
 * Created by Archer on 2016/3/27.
 * 定义为final的类不能被继承
 * 通过final修饰的方法不能被重写
 * final修饰的属性被称为常量
 */
public class FinalDemo01 {

    public static void main(String[] args) {

         //使用final修饰的常量要全部大写
        final  String  Name="Archer";

    }
}

 class People{
     public void  tell(){}

}

class Student extends People{

    public void tell(){

    }

}
