package ru.oleg.network;

import java.io.Serializable;

public record User(String name, String password) implements Serializable {
    @Override
    public String toString() {
        return name() + " - " + password;
    }
}
