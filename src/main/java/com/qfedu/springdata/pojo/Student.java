package com.qfedu.springdata.pojo;



import javax.persistence.*;

@Entity
@Table(name = "t_work")
public class Student {
    @Id//主键
    @GeneratedValue(strategy = GenerationType.IDENTITY)//自
    protected int id;
    @Column(length = 10)
    private String name;
    @Column(length = 20)
    private String city;

    private double money;

    public Student() {
    }

    public Student(String name, String city, double money) {
        this.name = name;
        this.city = city;
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }


}
