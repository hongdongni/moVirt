package org.ovirt.mobile.movirt.model.condition;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import org.ovirt.mobile.movirt.model.Vm;

public class CpuThresholdCondition extends Condition<Vm> {
    public final int percentageLimit;

    @JsonCreator
    public CpuThresholdCondition(@JsonProperty("percentageLimit") int percentageLimit) {
        this.percentageLimit = percentageLimit;
    }

    @Override
    public boolean evaluate(Vm entity) {
        return entity.getCpuUsage() >= percentageLimit;
    }
}
