package com.shiyao.soccermanager.models.metrics.length;

import com.shiyao.soccermanager.R;
import com.shiyao.soccermanager.misc.Registry;

/**
 * Created by SLiu on 8/25/2017.
 */

public class CentimeterValue extends Length {

    public CentimeterValue(double value) {
        this.value = value;
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
    public Double getStandardValue() {
        return 0.01 * this.getValue();
    }
}
