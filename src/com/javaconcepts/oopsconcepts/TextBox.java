package com.javaconcepts.oopsconcepts;

import com.javaconcepts.oopsconcepts.inheritance.UIControl;

public class TextBox extends UIControl {

    private String text = "";

//    public TextBox() {
////        super(true);
//        System.out.println("TextBox");
//    }

    @Override
    public void render() {
        System.out.println("Render Text Box");
    }

    @Override
    public String toString(){
        return text;
    }

    public void setText(String text){
        this.text = text;
    }

    public void clear(){
        text = "";
    }

}
