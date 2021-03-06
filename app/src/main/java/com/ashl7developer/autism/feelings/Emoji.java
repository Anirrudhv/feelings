package com.ashl7developer.autism.feelings;

import java.util.ArrayList;


public final class Emoji {

    private int drawableResourceId;
    private String name;
    private String caption;

    public Emoji(int pathToDrawableRes, String name, String caption) {
        this.drawableResourceId = pathToDrawableRes;
        this.name = name;
        this.caption = caption;
    }

    public int getDrawableRes() {
        return drawableResourceId;
    }

    public String getName() {
        return name;
    }

    public String getCaption() {
        return caption;
    }

    // List of the emojies that will be displayed in
    public static ArrayList<Emoji> getEmojiList() {
        ArrayList<Emoji> emojies = new ArrayList<>();
        emojies.add(new Emoji(com.ashl7developer.autism.feelings.R.drawable.emoji_happy, "Happy", "I feel happy."));
        emojies.add(new Emoji(com.ashl7developer.autism.feelings.R.drawable.emoji_confused, "Confused", "I am confused!"));
        emojies.add(new Emoji(com.ashl7developer.autism.feelings.R.drawable.alert_food, "Food", "I want some food."));
        emojies.add(new Emoji(com.ashl7developer.autism.feelings.R.drawable.emoji_love, "Love", "I am feeling lonely"));
        emojies.add(new Emoji(com.ashl7developer.autism.feelings.R.drawable.emoji_crying, "Sad", "I feel sad."));
        emojies.add(new Emoji(com.ashl7developer.autism.feelings.R.drawable.alert_drink, "Drink", "I need some water."));
        emojies.add(new Emoji(com.ashl7developer.autism.feelings.R.drawable.emoji_sick, "Sick", "I feel sick."));
        emojies.add(new Emoji(com.ashl7developer.autism.feelings.R.drawable.emoji_angry, "Angry", "I am angry."));
        emojies.add(new Emoji(com.ashl7developer.autism.feelings.R.drawable.alert_bell, "Help", "Help me!"));
        return emojies;
    }
}
