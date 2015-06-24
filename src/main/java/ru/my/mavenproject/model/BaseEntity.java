package ru.my.mavenproject.model;

/**
 * Created by Nikolay on 21.06.2015.
 */
// when we write something in data base we have a primary key.
// id is a primary key
public class BaseEntity {
    protected Integer id;

    public void setId(Integer id){
        this.id = id;
    }

    public Integer getId(){
        return id;
    }

    public boolean isNew(){
        return (this.id == null);
    }
}
