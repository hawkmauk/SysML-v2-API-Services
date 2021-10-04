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
import org.omg.sysml.metamodel.Association;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Classifier;
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
import org.omg.sysml.metamodel.FeatureChaining;
import org.omg.sysml.metamodel.FeatureDirectionKind;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.FlowConnectionUsage;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.OccurrenceUsage;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Step;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.UseCaseUsage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SuccessionAsUsageImpl.class)
public abstract class SuccessionAsUsageImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<SuccessionAsUsageImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Usage> usage;
	public static volatile CollectionAttribute<SuccessionAsUsageImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Type> type;
	public static volatile ListAttribute<SuccessionAsUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Feature> output;
	public static volatile ListAttribute<SuccessionAsUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<SuccessionAsUsageImpl, TransitionUsage> nestedTransition;
	public static volatile ListAttribute<SuccessionAsUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<SuccessionAsUsageImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, UUID> identifier;
	public static volatile ListAttribute<SuccessionAsUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile ListAttribute<SuccessionAsUsageImpl, EnumerationUsage> nestedEnumeration;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Feature> ownedFeature;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Documentation> documentation;
	public static volatile ListAttribute<SuccessionAsUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Feature> directedFeature;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Feature> input;
	public static volatile ListAttribute<SuccessionAsUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Element> relatedElement;
	public static volatile ListAttribute<SuccessionAsUsageImpl, ViewUsage> nestedView;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<SuccessionAsUsageImpl, OccurrenceUsage> nestedOccurrence;
	public static volatile ListAttribute<SuccessionAsUsageImpl, AllocationUsage> nestedAllocation;
	public static volatile CollectionAttribute<SuccessionAsUsageImpl, Association> association;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, Boolean> isPortion;
	public static volatile ListAttribute<SuccessionAsUsageImpl, ReferenceUsage> nestedReference;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, Boolean> isReadOnly;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, Boolean> isVariation;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Feature> feature;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Element> member;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, Boolean> isReference;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, String> effectiveName;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Membership> importedMembership;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Element> ownedElement;
	public static volatile ListAttribute<SuccessionAsUsageImpl, FeatureMembership> featureMembership;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, Boolean> isAbstract;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Feature> relatedFeature;
	public static volatile ListAttribute<SuccessionAsUsageImpl, RenderingUsage> nestedRendering;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, String> humanId;
	public static volatile ListAttribute<SuccessionAsUsageImpl, ConnectorAsUsage> nestedConnection;
	public static volatile ListAttribute<SuccessionAsUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Specialization> ownedSpecialization;
	public static volatile ListAttribute<SuccessionAsUsageImpl, ViewpointUsage> nestedViewpoint;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Usage> directedUsage;
	public static volatile ListAttribute<SuccessionAsUsageImpl, PartUsage> nestedPart;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Feature> chainingFeature;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, Boolean> isUnique;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Usage> nestedUsage;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Element> source;
	public static volatile CollectionAttribute<SuccessionAsUsageImpl, Expression> guardExpression;
	public static volatile CollectionAttribute<SuccessionAsUsageImpl, Usage> variant;
	public static volatile ListAttribute<SuccessionAsUsageImpl, StateUsage> nestedState;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Comment> documentationComment;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, Boolean> isOrdered;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, Boolean> isDerived;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Annotation> ownedAnnotation;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, String> qualifiedName;
	public static volatile ListAttribute<SuccessionAsUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Feature> endFeature;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, Boolean> isEnd;
	public static volatile ListAttribute<SuccessionAsUsageImpl, ItemUsage> nestedItem;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Type> featuringType;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<SuccessionAsUsageImpl, Step> effectStep;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, String> name;
	public static volatile CollectionAttribute<SuccessionAsUsageImpl, Feature> connectorEnd;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<SuccessionAsUsageImpl, Type> disjointType;
	public static volatile CollectionAttribute<SuccessionAsUsageImpl, FlowConnectionUsage> nestedFlow;
	public static volatile ListAttribute<SuccessionAsUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<SuccessionAsUsageImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Membership> membership;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Element> ownedRelatedElement;
	public static volatile CollectionAttribute<SuccessionAsUsageImpl, Step> triggerStep;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<SuccessionAsUsageImpl, Feature> targetFeature;
	public static volatile ListAttribute<SuccessionAsUsageImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile ListAttribute<SuccessionAsUsageImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<SuccessionAsUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Classifier> definition;
	public static volatile ListAttribute<SuccessionAsUsageImpl, UseCaseUsage> nestedUseCase;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<SuccessionAsUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<SuccessionAsUsageImpl, ConcernUsage> nestedConcern;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Import> ownedImport;
	public static volatile ListAttribute<SuccessionAsUsageImpl, Element> target;
	public static volatile CollectionAttribute<SuccessionAsUsageImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<SuccessionAsUsageImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<SuccessionAsUsageImpl, Boolean> isDirected;
	public static volatile ListAttribute<SuccessionAsUsageImpl, String> aliasId;

	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String USAGE = "usage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String NESTED_REQUIREMENT = "nestedRequirement";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String NESTED_TRANSITION = "nestedTransition";
	public static final String NESTED_CONSTRAINT = "nestedConstraint";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
	public static final String NESTED_ATTRIBUTE = "nestedAttribute";
	public static final String NESTED_ENUMERATION = "nestedEnumeration";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String DOCUMENTATION = "documentation";
	public static final String NESTED_ANALYSIS_CASE = "nestedAnalysisCase";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String INPUT = "input";
	public static final String NESTED_CALCULATION = "nestedCalculation";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String NESTED_VIEW = "nestedView";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String NESTED_OCCURRENCE = "nestedOccurrence";
	public static final String NESTED_ALLOCATION = "nestedAllocation";
	public static final String ASSOCIATION = "association";
	public static final String IS_PORTION = "isPortion";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String IS_READ_ONLY = "isReadOnly";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String MEMBER = "member";
	public static final String IS_REFERENCE = "isReference";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String RELATED_FEATURE = "relatedFeature";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String HUMAN_ID = "humanId";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";
	public static final String DIRECTED_USAGE = "directedUsage";
	public static final String NESTED_PART = "nestedPart";
	public static final String CHAINING_FEATURE = "chainingFeature";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String SOURCE = "source";
	public static final String GUARD_EXPRESSION = "guardExpression";
	public static final String VARIANT = "variant";
	public static final String NESTED_STATE = "nestedState";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IS_ORDERED = "isOrdered";
	public static final String IS_DERIVED = "isDerived";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String NESTED_VERIFICATION_CASE = "nestedVerificationCase";
	public static final String END_FEATURE = "endFeature";
	public static final String IS_END = "isEnd";
	public static final String NESTED_ITEM = "nestedItem";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String EFFECT_STEP = "effectStep";
	public static final String NAME = "name";
	public static final String CONNECTOR_END = "connectorEnd";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String DISJOINT_TYPE = "disjointType";
	public static final String NESTED_FLOW = "nestedFlow";
	public static final String NESTED_CASE = "nestedCase";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String TRIGGER_STEP = "triggerStep";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String TARGET_FEATURE = "targetFeature";
	public static final String OWNED_FEATURE_CHAINING = "ownedFeatureChaining";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String DEFINITION = "definition";
	public static final String NESTED_USE_CASE = "nestedUseCase";
	public static final String DIRECTION = "direction";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String NESTED_CONCERN = "nestedConcern";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String TARGET = "target";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String IS_DIRECTED = "isDirected";
	public static final String ALIAS_ID = "aliasId";

}

