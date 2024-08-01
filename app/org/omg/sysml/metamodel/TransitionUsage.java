// THIS IS AN AUTOGENERATED FILE. DO NOT EDIT THIS FILE DIRECTLY.
package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface TransitionUsage extends ActionUsage, SysMLType {
    Collection<? extends ActionUsage> getEffectAction();

    Collection<? extends Expression> getGuardExpression();

    ActionUsage getSource();

    Succession getSuccession();

    ActionUsage getTarget();

    Collection<? extends AcceptActionUsage> getTriggerAction();
}