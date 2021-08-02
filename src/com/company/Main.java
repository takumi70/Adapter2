package com.company;

public class Main { //委譲パターン　Adapteeがfinalが指定されてた場合、継承パターンが使えない

    public static void main(String[] args) {
	// write your code here

        Dengen dengen;

        dengen = new  AcAdapter();
        int denatsu = dengen.kyuuden();     //kyuudenメソッドの返却値がdenatsuに代入される
        System.out.println(denatsu + "Vで給電されています。");    //表示
    }
}
