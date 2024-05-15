/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.test.model;

import lombok.Data;
import lombok.experimental.SuperBuilder;

/**
 *
 * @author wkassem
 */
@SuperBuilder
public @Data abstract class ATrick implements ITrick{
    private final String name;
}
