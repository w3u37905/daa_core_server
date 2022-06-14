package eu.door.daa_core;

public class HelloWorld {
    public native void print();

    static {
        System.loadLibrary("hello");
    }

}