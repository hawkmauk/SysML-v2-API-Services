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
import org.omg.sysml.metamodel.Expression;
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
import org.omg.sysml.metamodel.Step;
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
@StaticMetamodel(VerificationCaseDefinitionImpl.class)
public abstract class VerificationCaseDefinitionImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<VerificationCaseDefinitionImpl, CalculationUsage> calculation;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Usage> directedUsage;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, PortUsage> ownedPort;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, Boolean> isConjugated;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, EnumerationUsage> ownedEnumeration;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, VerificationCaseUsage> ownedVerificationCase;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Usage> usage;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, ViewpointUsage> ownedViewpoint;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, AnalysisCaseUsage> ownedAnalysisCase;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, RenderingUsage> ownedRendering;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, ConstraintUsage> ownedConstraint;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> output;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, Usage> variant;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, ActionUsage> action;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, ItemUsage> ownedItem;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, Boolean> isSufficient;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Comment> documentationComment;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, UUID> identifier;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, ViewUsage> ownedView;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, String> qualifiedName;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Documentation> documentation;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> endFeature;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> directedFeature;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, AllocationUsage> ownedAllocation;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, InterfaceUsage> ownedInterface;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, FlowConnectionUsage> ownedFlow;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, ActionUsage> ownedAction;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, CaseUsage> ownedCase;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, PartUsage> actorParameter;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, CalculationUsage> ownedCalculation;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, OccurrenceUsage> ownedOccurrence;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, String> name;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, ReferenceUsage> ownedReference;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Usage> ownedUsage;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Element> ownedMember;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, Type> disjointType;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, UseCaseUsage> ownedUseCase;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, StateUsage> ownedState;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, RequirementUsage> verifiedRequirement;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, Boolean> isIndividual;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Membership> membership;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, Boolean> isVariation;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> feature;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> parameter;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Element> member;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, Subclassification> ownedSubclassification;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, TransitionUsage> ownedTransition;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, String> effectiveName;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Membership> importedMembership;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Element> ownedElement;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, Expression> expression;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, Boolean> isModelLevelEvaluable;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, ConnectorAsUsage> ownedConnection;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Import> ownedImport;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, RequirementUsage> ownedRequirement;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<VerificationCaseDefinitionImpl, String> humanId;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, String> aliasId;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, Specialization> ownedSpecialization;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, ConcernUsage> ownedConcern;
	public static volatile CollectionAttribute<VerificationCaseDefinitionImpl, Step> step;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, AttributeUsage> ownedAttribute;
	public static volatile ListAttribute<VerificationCaseDefinitionImpl, PartUsage> ownedPart;

	public static final String CALCULATION = "calculation";
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
	public static final String ACTION = "action";
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
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String OWNED_ALLOCATION = "ownedAllocation";
	public static final String OWNED_INTERFACE = "ownedInterface";
	public static final String INPUT = "input";
	public static final String OWNED_FLOW = "ownedFlow";
	public static final String OWNED_ACTION = "ownedAction";
	public static final String OWNED_CASE = "ownedCase";
	public static final String ACTOR_PARAMETER = "actorParameter";
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
	public static final String VERIFIED_REQUIREMENT = "verifiedRequirement";
	public static final String IS_INDIVIDUAL = "isIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String OWNED_SUBCLASSIFICATION = "ownedSubclassification";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String OWNED_TRANSITION = "ownedTransition";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String EXPRESSION = "expression";
	public static final String IS_MODEL_LEVEL_EVALUABLE = "isModelLevelEvaluable";
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
	public static final String STEP = "step";
	public static final String OWNED_ATTRIBUTE = "ownedAttribute";
	public static final String OWNED_PART = "ownedPart";

}

