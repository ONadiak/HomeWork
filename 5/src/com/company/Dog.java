package com.company;

public class Dog
{
    private int age;
    private String name;
    private String breed;
    public int getAge ( ) {
        return age;
    }
    public String  getName () {
        return name;
    }
    public String getBreed () {
        return breed;
    }
    public void  input ( String name, String breed,int age ){
        this.name = name;
        this.breed = breed;
        this.age=age;
    }
    public void setName ( String name ) {
        this.name=name;
    }
    public void setAge ( int age) {
        this.age = age;
    }
    public void setBreed ( String breed) {
        this.breed=breed;
    }
    public void output () {
        System.out.println( "Dog's breed is " + getBreed() + "," + getAge() +  " years old. Dog named " + getName() );

    }


    public Dog ( ) {};
    public Dog (String name) {
        this.name = name;
    };
    public Dog( String name, String breed ) {
        this.name = name;
        this.breed = breed;
    };
    public  Dog ( String name, String  breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    };
    public Dog ( String name, int age ) {
        this.name = name;
        this.age=age;
    }
    public Dog ( int age, String breed) {
        this.breed = breed;
        this.age = age;
    }
    public  Dog ( int age ) {
        this.age=age;
    }

    enum breeds {
        english_setter, //	английский сеттер
        afghan_hound,  //	афганская борзая
        beagle,	       //   игль
        boxer,         //	боксер
        border_terrier,//	бордер-терьер
        greyhound,     //	борзая
        bulldog,	   //   бульдог
        bull_terrier,  //	бультерьер
        welsh_terrier, //	вельш-терьер
        newfoundland,  //	водолаз
        canes,	       //   гончие
        dalmatian,     // 	далматин

    }
}
