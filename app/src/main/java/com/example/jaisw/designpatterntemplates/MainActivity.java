package com.example.jaisw.designpatterntemplates;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.example.jaisw.designpatterntemplates.CommandPattern.CommandPatternDemo;
import com.example.jaisw.designpatterntemplates.DecoratorPattern.DecoratorPatternDemo;
import com.example.jaisw.designpatterntemplates.Mediator.MediatorPatternDemo;
import com.example.jaisw.designpatterntemplates.Template.TemplatePatternDemo;
import com.example.jaisw.designpatterntemplates.VisitorPattern.VisitorPatternDemo;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_main);

    }

    private void demoDecoratorPattern() {
        new DecoratorPatternDemo().demoDecoratorPattern();
    }

    private void demoVisitorPattern() {
        new VisitorPatternDemo().demoVisitorPattern();
    }

    private void demoCommandPattern(){
        new CommandPatternDemo().demoCommandPattern();
    }

    private void demoTemplatePattern(){
        new TemplatePatternDemo().demoTemplatePattern();
    }

    private void demoMediatorPattern(){
        new MediatorPatternDemo().demoMediatorPattern();
    }
}
