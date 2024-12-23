package com.ashu.springTest.App01Gaming;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.ashu.springTest.GameRunner;

public class gamingSpring {
    public static void main(String[] args) {
        
        var context = new AnnotationConfigApplicationContext(gamingConfiguration.class);
        // context.getBean(gamingConfiguration.class).game().up();
        context.getBean(GameRunner.class).run();
}
}
