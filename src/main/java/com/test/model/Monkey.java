/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.model;

import java.util.ArrayList;
import java.util.List;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author wkassem
 */
@Builder
public @Data class Monkey implements Observable {
    private final String name;
    private final List<ITrick> tricks;
    @Builder.Default
    private List<Observer> observers = new ArrayList<>();
    
    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }
    
    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    @Override
    public void notifyObservers(Object arg) {
        for(Observer observer : observers) {
            Notification notification = Notification.builder()
                                                .monkey(this)
                                                .trick((ITrick)arg)
                                                .build();
            observer.notifiy(notification);
        }
    }
    
    public void executeTricks() {
        tricks.stream().forEach(t -> notifyObservers(t));
    }
}
