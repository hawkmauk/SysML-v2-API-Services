package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface Element extends MofObject {
    Membership getOwningMembership();

    Relationship getOwningRelationship();

    java.util.UUID getIdentifier();

    Package getOwningNamespace();

    String getName();

    Collection<? extends Relationship> getOwnedRelationship();

    Element getOwner();

    Collection<? extends Element> getOwnedElement();
}