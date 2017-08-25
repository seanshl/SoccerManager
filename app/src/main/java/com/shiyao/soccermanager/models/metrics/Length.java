package com.shiyao.soccermanager.models.metrics;

/**
 * Created by SLiu on 8/25/2017.
 */

public abstract class Length {
    protected double value;

    public double getValue() {
        return this.value;
    }

    public abstract String getLabel();

    public abstract String getShortLabel();

    public Double convertTo(Length other) {
        if (other == null || other.getValue() == 0.0) {
            return Double.POSITIVE_INFINITY;
        } else {
            return this.getStandardValue() / other.getStandardValue();
        }
    }

    public abstract Double getStandardValue();

    public String getValueString() {
        return String.format("%.2f", this.value);
    }
}
