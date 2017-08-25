package com.shiyao.soccermanager.models.attributes;

/**
 * Created by SLiu on 8/25/2017.
 */

public abstract class Attribute {
    protected String name;

    protected Double value;

    protected String unit;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
