package com.konkursing.greencode.atm.model;

import java.util.Objects;

public class Task {
    private int region;
    private RequestType requestType;
    private int atmId;

    public int getRegion() {
        return region;
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public int getAtmId() {
        return atmId;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    public void setAtmId(int atmId) {
        this.atmId = atmId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return region == task.region && atmId == task.atmId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(region, atmId);
    }
}
