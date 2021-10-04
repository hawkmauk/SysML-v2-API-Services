package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AllocationUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConcernUsage;
import org.omg.sysml.metamodel.ConnectorAsUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FlowConnectionUsage;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.OccurrenceUsage;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Subclassification;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.UseCaseUsage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(RenderingDefinitionImpl.class)
public abstract class RenderingDefinitionImpl_ extends org.omg.sysml.metamodel.impl.SysMLTypeImpl_ {

	public static volatile ListAttribute<RenderingDefinitionImpl, Usage> directedUsage;
	public static volatile ListAttribute<RenderingDefinitionImpl, PortUsage> ownedPort;
	public static volatile SingularAttribute<RenderingDefinitionImpl, Boolean> isConjugated;
	public static volatile ListAttribute<RenderingDefinitionImpl, EnumerationUsage> ownedEnumeration;
	public static volatile ListAttribute<RenderingDefinitionImpl, VerificationCaseUsage> ownedVerificationCase;
	public static volatile ListAttribute<RenderingDefinitionImpl, Usage> usage;
	public static volatile ListAttribute<RenderingDefinitionImpl, ViewpointUsage> ownedViewpoint;
	public static volatile ListAttribute<RenderingDefinitionImpl, AnalysisCaseUsage> ownedAnalysisCase;
	public static volatile ListAttribute<RenderingDefinitionImpl, RenderingUsage> ownedRendering;
	public static volatile ListAttribute<RenderingDefinitionImpl, ConstraintUsage> ownedConstraint;
	public static volatile ListAttribute<RenderingDefinitionImpl, Feature> output;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Usage> variant;
	public static volatile ListAttribute<RenderingDefinitionImpl, ItemUsage> ownedItem;
	public static volatile SingularAttribute<RenderingDefinitionImpl, Boolean> isSufficient;
	public static volatile ListAttribute<RenderingDefinitionImpl, Comment> documentationComment;
	public static volatile SingularAttribute<RenderingDefinitionImpl, UUID> identifier;
	public static volatile ListAttribute<RenderingDefinitionImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<RenderingDefinitionImpl, ViewUsage> ownedView;
	public static volatile ListAttribute<RenderingDefinitionImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<RenderingDefinitionImpl, String> qualifiedName;
	public static volatile ListAttribute<RenderingDefinitionImpl, Documentation> documentation;
	public static volatile ListAttribute<RenderingDefinitionImpl, Feature> endFeature;
	public static volatile ListAttribute<RenderingDefinitionImpl, RenderingUsage> rendering;
	public static volatile ListAttribute<RenderingDefinitionImpl, Feature> directedFeature;
	public static volatile ListAttribute<RenderingDefinitionImpl, AllocationUsage> ownedAllocation;
	public static volatile ListAttribute<RenderingDefinitionImpl, InterfaceUsage> ownedInterface;
	public static volatile ListAttribute<RenderingDefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, FlowConnectionUsage> ownedFlow;
	public static volatile ListAttribute<RenderingDefinitionImpl, ActionUsage> ownedAction;
	public static volatile ListAttribute<RenderingDefinitionImpl, CaseUsage> ownedCase;
	public static volatile ListAttribute<RenderingDefinitionImpl, CalculationUsage> ownedCalculation;
	public static volatile ListAttribute<RenderingDefinitionImpl, OccurrenceUsage> ownedOccurrence;
	public static volatile SingularAttribute<RenderingDefinitionImpl, String> name;
	public static volatile ListAttribute<RenderingDefinitionImpl, ReferenceUsage> ownedReference;
	public static volatile ListAttribute<RenderingDefinitionImpl, Usage> ownedUsage;
	public static volatile ListAttribute<RenderingDefinitionImpl, Element> ownedMember;
	public static volatile ListAttribute<RenderingDefinitionImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Type> disjointType;
	public static volatile ListAttribute<RenderingDefinitionImpl, UseCaseUsage> ownedUseCase;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<RenderingDefinitionImpl, StateUsage> ownedState;
	public static volatile SingularAttribute<RenderingDefinitionImpl, Boolean> isIndividual;
	public static volatile ListAttribute<RenderingDefinitionImpl, Membership> membership;
	public static volatile SingularAttribute<RenderingDefinitionImpl, Boolean> isVariation;
	public static volatile ListAttribute<RenderingDefinitionImpl, Feature> feature;
	public static volatile ListAttribute<RenderingDefinitionImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<RenderingDefinitionImpl, Element> member;
	public static volatile ListAttribute<RenderingDefinitionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<RenderingDefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, Subclassification> ownedSubclassification;
	public static volatile ListAttribute<RenderingDefinitionImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, TransitionUsage> ownedTransition;
	public static volatile SingularAttribute<RenderingDefinitionImpl, String> effectiveName;
	public static volatile ListAttribute<RenderingDefinitionImpl, Membership> importedMembership;
	public static volatile ListAttribute<RenderingDefinitionImpl, Element> ownedElement;
	public static volatile ListAttribute<RenderingDefinitionImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<RenderingDefinitionImpl, ConnectorAsUsage> ownedConnection;
	public static volatile ListAttribute<RenderingDefinitionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<RenderingDefinitionImpl, Import> ownedImport;
	public static volatile ListAttribute<RenderingDefinitionImpl, RequirementUsage> ownedRequirement;
	public static volatile SingularAttribute<RenderingDefinitionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<RenderingDefinitionImpl, String> humanId;
	public static volatile ListAttribute<RenderingDefinitionImpl, String> aliasId;
	public static volatile ListAttribute<RenderingDefinitionImpl, Specialization> ownedSpecialization;
	public static volatile CollectionAttribute<RenderingDefinitionImpl, ConcernUsage> ownedConcern;
	public static volatile ListAttribute<RenderingDefinitionImpl, AttributeUsage> ownedAttribute;
	public static volatile ListAttribute<RenderingDefinitionImpl, PartUsage> ownedPart;

	public static final String DIRECTED_USAGE = "directedUsage";
	public static final String OWNED_PORT = "ownedPort";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String OWNED_ENUMERATION = "ownedEnumeration";
	public static final String OWNED_VERIFICATION_CASE = "ownedVerificationCase";
	public static final String USAGE = "usage";
	public static final String OWNED_VIEWPOINT = "ownedViewpoint";
	public static final String OWNED_ANALYSIS_CASE = "ownedAnalysisCase";
	public static final String OWNED_RENDERING = "ownedRendering";
	public static final String OWNED_CONSTRAINT = "ownedConstraint";
	public static final String OUTPUT = "output";
	public static final String VARIANT = "variant";
	public static final String OWNED_ITEM = "ownedItem";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_VIEW = "ownedView";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String END_FEATURE = "endFeature";
	public static final String RENDERING = "rendering";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String OWNED_ALLOCATION = "ownedAllocation";
	public static final String OWNED_INTERFACE = "ownedInterface";
	public static final String INPUT = "input";
	public static final String OWNED_FLOW = "ownedFlow";
	public static final String OWNED_ACTION = "ownedAction";
	public static final String OWNED_CASE = "ownedCase";
	public static final String OWNED_CALCULATION = "ownedCalculation";
	public static final String OWNED_OCCURRENCE = "ownedOccurrence";
	public static final String NAME = "name";
	public static final String OWNED_REFERENCE = "ownedReference";
	public static final String OWNED_USAGE = "ownedUsage";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String DISJOINT_TYPE = "disjointType";
	public static final String OWNED_USE_CASE = "ownedUseCase";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String OWNED_STATE = "ownedState";
	public static final String IS_INDIVIDUAL = "isIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String OWNED_SUBCLASSIFICATION = "ownedSubclassification";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String OWNED_TRANSITION = "ownedTransition";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String OWNED_CONNECTION = "ownedConnection";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String OWNED_REQUIREMENT = "ownedRequirement";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String HUMAN_ID = "humanId";
	public static final String ALIAS_ID = "aliasId";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String OWNED_CONCERN = "ownedConcern";
	public static final String OWNED_ATTRIBUTE = "ownedAttribute";
	public static final String OWNED_PART = "ownedPart";

}

