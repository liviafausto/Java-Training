package edu.livia.secao19.hashcode;

// Como implementar os métodos hashCode() e equals() em uma classe personalizada

import java.util.Objects;

public class Client {
    private String name;
    private String email;

    public Client(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;

        if (obj == null || getClass() != obj.getClass())
            return false;

        Client client = (Client) obj;
        return Objects.equals(getName(), client.getName()) &&
                Objects.equals(getEmail(), client.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getEmail());
    }

    @Override
    public String toString() {
        return "Client{" +
                "'" + name + '\'' +
                ", '" + email + '\'' +
                '}';
    }
}
