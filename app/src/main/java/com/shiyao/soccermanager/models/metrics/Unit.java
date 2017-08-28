package com.shiyao.soccermanager.models.metrics;

/**
 * Created by SLiu on 8/28/2017.
 */

public abstract class Unit {
    protected double value;

    public double getValue() {
        return this.value;
    }

    public abstract String getLabel();

    public abstract String getShortLabel();

}
