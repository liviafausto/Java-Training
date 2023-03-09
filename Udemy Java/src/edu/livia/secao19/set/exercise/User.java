package edu.livia.secao19.set.exercise;

import java.util.Objects;

public class User implements Comparable<User>{
    private Integer key;
    private String name;

    public User(Integer key, String name) {
        this.key = key;
        this.name = name;
    }

    public Integer getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User user = (User) o;
        return Objects.equals(key, user.getKey());
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public int compareTo(User other) {
        return key.compareTo(other.getKey());
    }

    @Override
    public String toString() {
        return "{" +
                key +
                ", '" + name + '\'' +
                '}';
    }

}
