/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.test.model;

/**
 *
 * @author wkassem
 * @param <T>
 */
public interface Observer<T> {
    void notifiy(Notification n);
}
