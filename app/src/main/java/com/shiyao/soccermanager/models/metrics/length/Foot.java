package com.shiyao.soccermanager.models.metrics.length;

import com.shiyao.soccermanager.R;
import com.shiyao.soccermanager.misc.Registry;

/**
 * Created by SLiu on 8/25/2017.
 */

public class Foot extends Length {
    public Foot(double value) {
        this.value = value;
    }
    @Override
    public String getLabel() {
        if (this.value < 1.0d) {
            return Registry.getContext().getString(R.string.metrics_feet_single_label);
        } else {
            return Registry.getContext().getString(R.string.metrics_feet_plural_label);
        }
    }

    @Override
    public String getShortLabel() {
        return null;
    }

    @Override
    public Double getStandardValue() {
        return null;
    }
}
