package com.company;

public class AcAdapter extends Dengen{  //Adapter

    private JapaneseConsent consent = new JapaneseConsent();    //フィールドでJapaneseConsentをnewしている  実体を作っている（メソッドが使えるようになる）

    @Override
    public int kyuuden() {  //Dengenの抽象(abstract)メソッドをオーバーライド
        return (int)(consent.power() * 0.16);   //powerメソッドの返却値100を0.16倍で16Vにして返却

    }
}
