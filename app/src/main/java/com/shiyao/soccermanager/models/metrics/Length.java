package com.shiyao.soccermanager.models.metrics;

/**
 * Created by SLiu on 8/25/2017.
 */

public interface Length {
    Double getValue();

    String getLabel();

    Double convertTo(Length other);

    Double getStandardValue();
}
