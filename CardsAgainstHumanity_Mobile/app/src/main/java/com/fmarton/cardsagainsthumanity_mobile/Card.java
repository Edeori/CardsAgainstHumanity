package com.fmarton.cardsagainsthumanity_mobile;

/**
 * Created by fmarton on 1/25/2018.
 */

public class Card {

    int id;
    String text;

    public Card() {

    }

    public Card (int id, String text) {
        this.id = id;
        this.text = text;
    }

    public Card (String text) {
        this.text = text;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
