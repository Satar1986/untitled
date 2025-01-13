package client;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name = "client")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = true, updatable = true)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;
    public Client() {
    }
    public Client(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Client{" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", age = " + age +
                '}';
    }
}
