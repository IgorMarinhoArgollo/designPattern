package org.designPattern.singleton;

public class LazyHolderSingleton {
    private static class InstaceHolder {
        public static LazyHolderSingleton instance = new LazyHolderSingleton();
    }

    private LazyHolderSingleton() {
        super();
    }

    public static LazyHolderSingleton getInstance() {
        return InstaceHolder.instance;
    }

}
