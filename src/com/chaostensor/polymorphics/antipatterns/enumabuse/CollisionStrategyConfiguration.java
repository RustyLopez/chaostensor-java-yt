package com.chaostensor.polymorphics.antipatterns.enumabuse;

import lombok.Builder;
import lombok.Value;
import lombok.extern.jackson.Jacksonized;

public interface CollisionStrategyConfiguration {

    @Value
    @Jacksonized
    @Builder(toBuilder = true)
    public static class Ethereal implements CollisionStrategyConfiguration {


    }

    @Value
    @Jacksonized
    @Builder(toBuilder = true)
    public static class Solid implements CollisionStrategyConfiguration {

        final boolean receivesImpulses;
        final boolean givesImpulses;
        final boolean disableAngularMomentum;

    }
}
