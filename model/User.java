package model;

public class User {

    private int id;
    private String name;
    private String mob;
    private String role;

    public User(int id, String role, String mob, String name) {
        this.id = id;
        this.role = role;
        this.mob = mob;
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
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

    public String getMob() {
        return mob;
    }

    public void setMob(String mob) {
        this.mob = mob;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mob='" + mob + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
