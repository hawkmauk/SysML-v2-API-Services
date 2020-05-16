package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface FeatureMembership extends Membership {
    Type getOwningType();

    Boolean getIsDerived();

    Boolean getIsReadOnly();

    Feature getMemberFeature();

    Feature getOwnedMemberFeature();

    Boolean getIsComposite();

    Boolean getIsPortion();

    Boolean getIsPort();

    FeatureDirectionKind getDirection();
}