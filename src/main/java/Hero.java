package model;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;

public class Hero {
    private String name;
    private int age;
    private static ArrayList<Hero> instances = new ArrayList<>();
    private boolean published;
    private LocalDateTime createdAt;
    private int id;

    public Hero(String name, int age) {
        this.name = name;
        this.published = false;
        this.age = age;
        this.createdAt = LocalDateTime.now();
        instances.add(this);
        this.id = instances.size();

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


    public static ArrayList<Hero> getAllHeroes(){
        return instances;
    }

    public static void clearAllHeroes(){
        instances.clear();
    }

    public boolean getPublished(){
        return this.published;
    }
    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public int getId(){
        return this.id;
    }

    public static Hero findById(int id){
        return instances.get(id - 1); //because instances is an arraylist which is zero indexed..
        // and we need to display the right number. so if we have two posts 0 and 1 in the array, their ids are 1 and 2.
        // Hence we minus 1 for the array to function
    }

    public void update(String name){
        this.name = name;
    }

    public void deleteHero(){
        instances.remove(id-1);
    }
}