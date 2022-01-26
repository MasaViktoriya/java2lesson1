package com.geekbrains.person;

public abstract class Person {
    private long cash;

    public long getCash(){
        return cash;
    }
    public long setCash(long cash){
        this.cash = cash;
        return cash;
    }
}
