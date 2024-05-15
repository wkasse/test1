/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.model;

import lombok.Builder;
import lombok.Data;

/**
 *
 * @author wkassem
 */
@Builder
public @Data class Spectator implements Observer {

    public void observe(Monkey m) {
        m.addObserver(this);
    }
    
    @Override
    public void notifiy(Notification n) {
        if(n.getTrick() instanceof AcrobaticTrick) {
            System.out.println("Spectateur applaudit pendant le tour d'acrobatie '"+((AcrobaticTrick)n.getTrick()).getName()+"' du '"+n.getMonkey().getName()+"'");
        } else if(n.getTrick() instanceof MusicalTrick) {
            System.out.println("Spectateur siffle pendant le tour de musique '"+((MusicalTrick)n.getTrick()).getName()+"' du '"+n.getMonkey().getName()+"'");
        }
    }
    
}
