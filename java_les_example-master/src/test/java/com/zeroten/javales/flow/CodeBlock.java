package com.zeroten.javales.flow;

import org.testng.annotations.Test;

public class CodeBlock {

    @Test
    public void testBlockScope() {
        int n1 = 100;
        System.out.println(n1);

        {
            // int n1 = 101;
            int n2 = 200;
            System.out.println(n1);

            {
                System.out.println(n2);
            }
        }

        // System.out.println(n2);
        int n2 = 201;
        System.out.println(n2);
    }

}
