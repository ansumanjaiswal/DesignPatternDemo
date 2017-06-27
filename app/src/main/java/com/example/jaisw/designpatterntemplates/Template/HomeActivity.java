package com.example.jaisw.designpatterntemplates.Template;

/**
 * Created by jaisw on 3/22/2017.
 */

public class HomeActivity extends ActivityTemplate {

    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("Template Pattern : HomeActivity onCreate");
    }

    @Override
    public void onResume() {
        System.out.println("Template Pattern : HomeActivity onResume");
    }

    @Override
    public void onPause() {
        System.out.println("Template Pattern : HomeActivity onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        System.out.println("Template Pattern : HomeActivity onStop");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("Template Pattern : HomeActivity onDestroy");
    }
}
