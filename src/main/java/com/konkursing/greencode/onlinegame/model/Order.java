package com.konkursing.greencode.onlinegame.model;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<Group> groups;

    public Order(List<Group> gList) {
        groups = gList;
    }

    public Order() {
        groups = new ArrayList<>();
    }

    public List<Group> getGroups() {
        return groups;
    }

    public void setGroups(List<Group> groups) {
        this.groups = groups;
    }
}