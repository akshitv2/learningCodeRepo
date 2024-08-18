package org.example;

import java.util.ArrayList;
import java.util.List;
public class FunctionalProgramming {

    /**
     * InnerFunctionalProgramming
     */
    @FunctionalInterface
    public interface InnerFunctionalProgramming {
    
        public void greet(String s);
    }
    
    public static void main(String[] args) {

        InnerFunctionalProgramming gm = new InnerFunctionalProgramming(){
            @Override
            public void greet(String s){
                System.out.println("Hello " + s);
            }
        };
        gm.greet("Albert");

        InnerFunctionalProgramming gm2 = (String name) ->{System.out.println("Hello " + name);};
        gm2.greet("Edison");

    }
    
}
