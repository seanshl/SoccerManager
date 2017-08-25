package com.shiyao.soccermanager.models.metrics;

/**
 * Created by SLiu on 8/25/2017.
 */

public interface Length {
    Double getValue();

    String getLabel();

    String getShortLabel();

    Double convertTo(Length other);

    Double getStandardValue();
}
