package com.company;

import java.util.ArrayList;
import java.util.List;

public class Zoo {

    private List<Pen> myPens = new ArrayList<>();


    public void addAPenToZoo(Pen penName){
        myPens.add(penName);
    }

    public List<Pen> getMyPens() {
        return myPens;
    }

    public void setMyPens(List<Pen> myPens) {
        this.myPens = myPens;
    }
}
