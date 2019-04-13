package com.example.naturalflavors;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User
{

    public String userName;
    public String name;
    public String email;
    public int salary;

    public User()
    {

    }

    public User(String userName, String name, String email, int salary)
    {
        this.userName = userName;
        this.name = name;
        this.email = email;
        this.salary = salary;
    }

}
