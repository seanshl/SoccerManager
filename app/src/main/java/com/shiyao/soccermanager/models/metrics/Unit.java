package com.shiyao.soccermanager.models.metrics;

import com.shiyao.soccermanager.models.metrics.length.Length;

/**
 * Created by SLiu on 8/28/2017.
 */

public abstract class Unit implements Comparable {
    protected double value;

    public double getValue() {
        return this.value;
    }

    public abstract String getLabel();

    public abstract String getShortLabel();

    public abstract Double getStandardValue();

    public abstract double convertTo(Unit that) ;

    public abstract String getValueString();

}
