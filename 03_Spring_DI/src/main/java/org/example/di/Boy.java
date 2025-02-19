package org.example.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Boy implements DI{

    @Autowired //property injection
    Aggrement Girl;

//    @Autowired //Constructor injection
//    public Boy(Aggrement girl) {
//        this.Girl = girl;
//    }

//    @Autowired //Setter injection
//    public void setGirl(Aggrement girl) {
//        this.Girl = girl;
//    }

    public void chatWithHer() {
        System.out.println("chatting with new her.....");
    }

    @Autowired
    @Override
    public void injection(Aggrement aggrement) {
        this.Girl = aggrement;
    }
}
