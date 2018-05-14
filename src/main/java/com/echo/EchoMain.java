package com.echo;

import java.util.Arrays;

/**
 * Created by sg0501095 on 5/14/18.
 */
public class EchoMain {
    public static void main(String[] args) throws InterruptedException {
        while (true) {

            System.out.println("echo: " +
                    (args.length > 1 ? String.join(" ", Arrays.asList(args)) : "no message"));
            Thread.sleep(5000);
        }
    }
}
