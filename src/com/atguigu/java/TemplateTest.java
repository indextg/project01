package com.atguigu.java;

import java.util.ArrayList;

/**
 * @author 田更
 * @create 2018-09-12 10:23
 */
public class TemplateTest {
    //模板一： psvm
    public static void main(String[] args) {

        //模板二：sout
        System.out.println("Hello!!");
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");

        int num = 10;
        int num1 = 20;
        System.out.println("num = " + num);
        System.out.println(num1);


        //模板三：fori
        String[] arr = new String[]{"tom", "jerry", "lilei"};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //变形：iter
        for (String s : arr) {
            System.out.println(s);
        }

        // 模板四：list.for
        ArrayList<Object> list = new ArrayList<>();
        list.add(1);
        list.add(12);
        list.add(13);
        for (Object o : list) {

        }

        //list.forr
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //模板五：ifn
        if (list == null) {

        }
        //变形：inn
        if (list != null) {

        }


    }

    public void method() {
        System.out.println("TemplateTest.method");
    }
}
