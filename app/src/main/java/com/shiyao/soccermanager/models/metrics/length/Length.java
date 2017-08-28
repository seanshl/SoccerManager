package com.shiyao.soccermanager.models.metrics.length;

import com.shiyao.soccermanager.models.metrics.Unit;

/**
 * Created by SLiu on 8/25/2017.
 */

public abstract class Length extends Unit {
    @Override
    public String getValueString() {
        return String.format("%.2f", this.value);
    }

    @Override
    public double convertTo(Unit that) {
        if (that instanceof Length) {
            if (that == null || that.getValue() == 0.0) {
                return 0.0d;
            } else {
                return this.getStandardValue() / that.getStandardValue();
            }
        } else {
            return 0.0d;
        }
    }
}
