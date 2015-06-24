package ru.my.mavenproject.model;

/**
 * Created by Nikolay on 21.06.2015.
 */
//NamedEntity. Entity with name and id(pk).
public class NamedEntity extends BaseEntity {
    protected String name;

    public NamedEntity(){}

    protected NamedEntity(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        return name;
    }
}
