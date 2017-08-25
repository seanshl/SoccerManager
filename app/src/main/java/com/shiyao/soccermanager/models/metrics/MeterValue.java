package com.shiyao.soccermanager.models.metrics;

import android.content.res.Resources;

import com.shiyao.soccermanager.R;
import com.shiyao.soccermanager.models.misc.Registry;

/**
 * Created by SLiu on 8/25/2017.
 */

public class MeterValue implements Length {

    private Double value;
    @Override
    public Double getValue() {
        return this.value;
    }

    @Override
    public String getLabel() {
        return Registry.getContext().getString(R.string.metrics_meter_label);
    }

    @Override
    public Double convertTo(Length other) {
        return null;
    }

    @Override
    public Double getStandardValue() {
        return null;
    }
}
