package com.shiyao.soccermanager.models.metrics.length;

import com.shiyao.soccermanager.R;
import com.shiyao.soccermanager.misc.Registry;

/**
 * Created by SLiu on 8/25/2017.
 */

public class Inch extends Length {

    public Inch(double value) {
        this.value = value;
    }

    @Override
    public String getLabel() {
        return Registry.getContext().getString(R.string.metrics_inch_label);
    }

    @Override
    public String getShortLabel() {
        return "in";
    }

    @Override
    public Double getStandardValue() {
        return 0.0254 * this.value;
    }
}
