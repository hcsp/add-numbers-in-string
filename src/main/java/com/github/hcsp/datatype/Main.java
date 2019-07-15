package com.github.hcsp.datatype;

public class Main {
    public static void main(String[] args) {
        System.out.println(add("123", "456"));
        System.out.println(add("123", null));
        System.out.println(add(null, null));
    }
    // 给出两个数字字符串a和b，返回其中的数字相加后的字符串结果。
    // 例如，给定a="123",b="456"，返回"579"，因为123+456=579
    // 注意，若参数为null，则当作0处理，即add("123", null)=="123", add(null, null)=="0"
    public static String add(String a, String b) {
        int x1,y1,z1,x2,y2,z2,x,y,z;
        String i;
        if (a != null) {
            int c = Integer.valueOf(a);
            x1 = c / 100;
            y1 = c / 10 % 10;
            z1 = c % 10;
        }else {
            x1 = 0;
            y1 = 0;
            z1 = 0;
        }
        if (b != null){
            int d = Integer.valueOf(b);
            x2 = d/100;
            y2 = d/10%10;
            z2 = d%10;
        }else {
            x2 = 0;
            y2 = 0;
            z2 = 0;
        }
        if (a == null && b == null){
            return i = "0";
        }else {
            x = x1 + x2;
            y = y1 + y2;
            z = z1 + z2;
            i = String.valueOf(x) + String.valueOf(y) + String.valueOf(z);
        }
        return i;
    }
}
