package com.konkursing.greencode.onlinegame.model;

import java.util.List;

public class Players {
    private int groupCount;
    public int getGroupCount() {
        return groupCount;
    }

    public void setGroupCount(int groupCount) {
        this.groupCount = groupCount;
    }

    private List<Clan> clans;

    public void setClans(List<Clan> clans) {
        this.clans = clans;
    }

    public List<Clan> getClans() {
        return clans;
    }
}