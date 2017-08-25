package com.shiyao.soccermanager.models.metrics;

import com.shiyao.soccermanager.R;
import com.shiyao.soccermanager.models.misc.Registry;

/**
 * Created by SLiu on 8/25/2017.
 */

public class CentimeterValue implements Length {
    private Double value;

    @Override
    public Double getValue() {
        return this.value;
    }

    @Override
    public String getLabel() {
        return Registry.getContext().getString(R.string.metrics_centimeter_label);
    }

    @Override
    public String getShortLabel() {
        return "cm";
    }

    @Override
    public Double convertTo(Length other) {
        return null;
    }

    @Override
    public Double getStandardValue() {
        return new Double(0.01);
    }
}
