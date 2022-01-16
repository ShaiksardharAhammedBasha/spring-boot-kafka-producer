package com.techprimers.springbootkafkaproducer;


public class Student {

    private String id;
    private String message;
    private String city;

    public Student() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Student(String id, String message, String city) {
        this.id = id;
        this.message = message;
        this.city = city;
    }
}
