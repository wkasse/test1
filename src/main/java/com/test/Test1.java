/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.test;

import com.test.model.AcrobaticTrick;
import com.test.model.Monkey;
import com.test.model.Spectator;
import com.test.model.Trainer;
import com.test.model.MusicalTrick;
import java.util.Arrays;

/**
 *
 * @author wkassem
 */
public class Test1 {

    public static void main(String[] args) {
        Spectator spectator = Spectator.builder().build();
        
        Monkey monkey1 = Monkey.builder()
                            .name("Singe 1")
                            .tricks(Arrays.asList(
                                    AcrobaticTrick.builder().name("Dancer sur les mains").build(),
                                    MusicalTrick.builder().name("Jouer au guitare").build()))
                            .build();
        
        spectator.observe(monkey1);
        
        Monkey monkey2 = Monkey.builder()
                            .name("Singe 2")
                            .tricks(Arrays.asList(
                                    AcrobaticTrick.builder().name("Marcher sur les pédales").build(),
                                    MusicalTrick.builder().name("Jouer au piano").build()))
                            .build();
        spectator.observe(monkey2);
        
        Trainer trainer1 = Trainer.builder()
                            .monkey(monkey1)
                            .build();
        
        Trainer trainer2 = Trainer.builder()
                            .monkey(monkey2)
                            .build();
        
        trainer1.executeTricks();
        trainer2.executeTricks();
        
    }
}
