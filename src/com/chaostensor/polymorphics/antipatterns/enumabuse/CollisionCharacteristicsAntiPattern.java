package com.chaostensor.polymorphics.antipatterns.enumabuse;

/**
 * I've seen this a lot, and when I was a novice, I was guilty of this as well.
 */
public enum CollisionCharacteristicsAntiPattern {
    SolidReceivesImpulsesGivesImpulsesLockAngularMomentum(true, true, true, false),
    SolidReceivesImpulsesGivesImpulses(true, true, false, false),
    SolidNotReceivesImpulsesGivesImpulses(false, true, false, false),
    SolidNotReceivesImpulsesGivesImpulsesLockAngularMomentum(false, true, true, false),
    Ethereal(false, false, false,/* conditional relevance red flag */true);

    boolean receivesImpulses;
    boolean givesImpulses;
    boolean disableAngularMomentum;
    boolean allowOverlappingOccupation;

    CollisionCharacteristicsAntiPattern(final boolean receivesImpulses, final boolean givesImpulses, final boolean disableAngularMomentum, final boolean allowOverlappingOccupation) {
        this.receivesImpulses = receivesImpulses;
        this.givesImpulses = givesImpulses;
        this.disableAngularMomentum = disableAngularMomentum;
        this.allowOverlappingOccupation = allowOverlappingOccupation;
    }
}
