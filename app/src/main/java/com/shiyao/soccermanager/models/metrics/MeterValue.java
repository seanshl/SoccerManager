package com.shiyao.soccermanager.models.metrics;

import android.content.res.Resources;

import com.shiyao.soccermanager.R;
import com.shiyao.soccermanager.models.misc.Registry;

/**
 * Created by SLiu on 8/25/2017.
 */

public class MeterValue extends Length {

    public MeterValue(double value) {
        this.value = value;
    }

    @Override
    public String getLabel() {
        return Registry.getContext().getString(R.string.metrics_meter_label);
    }

    @Override
    public String getShortLabel() {
        return "m";
    }

    @Override
    public Double getStandardValue() {
        return 1.0 * this.getValue();
    }
}
