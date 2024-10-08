// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.util.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for NumericalDataDriftMetric.
 */
public final class NumericalDataDriftMetric extends ExpandableStringEnum<NumericalDataDriftMetric> {
    /**
     * Static value JensenShannonDistance for NumericalDataDriftMetric.
     */
    public static final NumericalDataDriftMetric JENSEN_SHANNON_DISTANCE = fromString("JensenShannonDistance");

    /**
     * Static value PopulationStabilityIndex for NumericalDataDriftMetric.
     */
    public static final NumericalDataDriftMetric POPULATION_STABILITY_INDEX = fromString("PopulationStabilityIndex");

    /**
     * Static value NormalizedWassersteinDistance for NumericalDataDriftMetric.
     */
    public static final NumericalDataDriftMetric NORMALIZED_WASSERSTEIN_DISTANCE
        = fromString("NormalizedWassersteinDistance");

    /**
     * Static value TwoSampleKolmogorovSmirnovTest for NumericalDataDriftMetric.
     */
    public static final NumericalDataDriftMetric TWO_SAMPLE_KOLMOGOROV_SMIRNOV_TEST
        = fromString("TwoSampleKolmogorovSmirnovTest");

    /**
     * Creates a new instance of NumericalDataDriftMetric value.
     * 
     * @deprecated Use the {@link #fromString(String)} factory method.
     */
    @Deprecated
    public NumericalDataDriftMetric() {
    }

    /**
     * Creates or finds a NumericalDataDriftMetric from its string representation.
     * 
     * @param name a name to look for.
     * @return the corresponding NumericalDataDriftMetric.
     */
    public static NumericalDataDriftMetric fromString(String name) {
        return fromString(name, NumericalDataDriftMetric.class);
    }

    /**
     * Gets known NumericalDataDriftMetric values.
     * 
     * @return known NumericalDataDriftMetric values.
     */
    public static Collection<NumericalDataDriftMetric> values() {
        return values(NumericalDataDriftMetric.class);
    }
}
