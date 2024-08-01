// THIS IS AN AUTOGENERATED FILE. DO NOT EDIT THIS FILE DIRECTLY.
package org.omg.sysml.metamodel;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public interface Definition extends Classifier, SysMLType {
    List<? extends Usage> getDirectedUsage();

    Boolean getIsVariation();

    List<? extends ActionUsage> getOwnedAction();

    List<? extends AllocationUsage> getOwnedAllocation();

    List<? extends AnalysisCaseUsage> getOwnedAnalysisCase();

    List<? extends AttributeUsage> getOwnedAttribute();

    List<? extends CalculationUsage> getOwnedCalculation();

    List<? extends CaseUsage> getOwnedCase();

    Collection<? extends ConcernUsage> getOwnedConcern();

    List<? extends ConnectorAsUsage> getOwnedConnection();

    List<? extends ConstraintUsage> getOwnedConstraint();

    List<? extends EnumerationUsage> getOwnedEnumeration();

    Collection<? extends FlowConnectionUsage> getOwnedFlow();

    List<? extends InterfaceUsage> getOwnedInterface();

    List<? extends ItemUsage> getOwnedItem();

    List<? extends MetadataUsage> getOwnedMetadata();

    List<? extends OccurrenceUsage> getOwnedOccurrence();

    List<? extends PartUsage> getOwnedPart();

    List<? extends PortUsage> getOwnedPort();

    List<? extends ReferenceUsage> getOwnedReference();

    List<? extends RenderingUsage> getOwnedRendering();

    List<? extends RequirementUsage> getOwnedRequirement();

    List<? extends StateUsage> getOwnedState();

    Collection<? extends TransitionUsage> getOwnedTransition();

    List<? extends Usage> getOwnedUsage();

    List<? extends UseCaseUsage> getOwnedUseCase();

    List<? extends VerificationCaseUsage> getOwnedVerificationCase();

    List<? extends ViewUsage> getOwnedView();

    List<? extends ViewpointUsage> getOwnedViewpoint();

    List<? extends Usage> getUsage();

    Collection<? extends Usage> getVariant();

    Collection<? extends VariantMembership> getVariantMembership();
}