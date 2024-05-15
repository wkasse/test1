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
public @Data class Trainer {
    private final Monkey monkey;
    
    public void executeTricks() {
        getMonkey().executeTricks();
    }
}
