package com.friends.friendsassignment;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Friends {
    

    
    private String name;
    private String profession;
    private int age;

    

    public Friends(String name,String profession, int age){


        this.name = name;
        this.profession = profession;
        this.age = age;
    }
    public String getName()
    {
        return this.name;
    }
}