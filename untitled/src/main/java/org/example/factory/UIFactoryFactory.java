package org.example.factory;

public class UIFactoryFactory {
    public static UIFactory createFactory(String platform) {
        if("Android".equals(platform)){
            return new AndroidUIFactory();
        }
        return null;
    }
}
