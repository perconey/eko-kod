package com.konkursing.greencode.onlinegame.model;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Clan> clans;

    public Group(List<Clan> groupClans) {
        clans = groupClans;
    }

    public Group() {
        clans = new ArrayList<>();
    }

    public List<Clan> getClans() {
        return clans;
    }

    public void setClans(List<Clan> clans) {
        this.clans = clans;
    }
}