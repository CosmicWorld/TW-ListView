package com.myapplicationdev.android.tw_listview;

/**
 * Created by 15017381 on 28/4/2017.
 */

public class Module {
    private String name;
    private boolean progModule;

    public Module(String moduleName, boolean progModule){
        this.name = moduleName;
        this.progModule = progModule;
    }
    public String getName(){
        return name;
    }
    public boolean progModule(){
        return progModule;
    }
}
