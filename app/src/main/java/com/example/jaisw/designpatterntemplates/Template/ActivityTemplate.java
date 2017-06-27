package com.example.jaisw.designpatterntemplates.Template;

/**
 * Created by jaisw on 3/22/2017.
 */

public abstract class ActivityTemplate {

    public final void startActivityLifeCycle(){
        initialSetup();
        onCreate();
        onResume();
        onPause();
        onStop();
        onDestroy();
    }

    private void initialSetup(){
        System.out.println("Template Pattern : ActivityTemplate initialSetup");
    }

    public void onCreate(){
        System.out.println("Template Pattern : ActivityTemplate onCreate");
    }

    public abstract void onResume();

    public abstract void onPause();

    public void onStop(){

    }

    public void onDestroy(){
        System.out.println("Template Pattern : ActivityTemplate onDestroy");
    }
}
