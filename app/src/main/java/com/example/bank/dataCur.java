package com.example.bank;

public class dataCur{
//        list.add(new dataCur(R.drawable.ru,R.string.RU,R.string.RU_buy,R.string.RU_sell,R.string.RU_name);

    private int flagID;
    private int ruID;
    private int ru_buyID;
    private int ru_sellID;
    private int ru_nameID;



    public dataCur (int _flagID, int _ruID, int _ru_buyID, int _ru_sellID, int _ru_nameID){
        flagID = _flagID;
        ruID = _ruID;
        ru_buyID = _ru_buyID;
        ru_sellID = _ru_sellID;
        ru_nameID = _ru_nameID;
    }
    public int getFlagID(){
        return flagID;
    }
    public int getRuID(){
        return ruID;
    }
    public int getRu_buyID(){
        return ru_buyID;
    }
    public int getRu_sellID(){
        return ru_sellID;
    }
    public int getRu_nameID(){
        return ru_nameID;
    }
}
