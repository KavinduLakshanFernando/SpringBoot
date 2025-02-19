package org.example.di;

import org.springframework.stereotype.Component;

@Component
public class Girl implements Aggrement{
    @Override
    public void chat() {
        System.out.println("chating NEW girl.....");
    }
}
