package org.example.factory;

public class Flutter {

    public void setTheme(){}
    public  void setInterface(){}

    public UIFactory createUIFactory(String platform){
        //give your responsisbility to create factory to another class UIFactoryFactory to avoid srp violation
        return UIFactoryFactory.createFactory(platform);
    }
}
