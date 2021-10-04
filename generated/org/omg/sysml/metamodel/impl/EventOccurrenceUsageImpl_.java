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
import org.omg.sysml.metamodel.Class;
import org.omg.sysml.metamodel.Classifier;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConcernUsage;
import org.omg.sysml.metamodel.ConnectorAsUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
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
import org.omg.sysml.metamodel.PortionKind;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.StateUsage;
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
@StaticMetamodel(EventOccurrenceUsageImpl.class)
public abstract class EventOccurrenceUsageImpl_ extends org.omg.sysml.metamodel.impl.SysMLTypeImpl_ {

	public static volatile ListAttribute<EventOccurrenceUsageImpl, Usage> directedUsage;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, PartUsage> nestedPart;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Feature> chainingFeature;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, Boolean> isConjugated;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Usage> usage;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, Boolean> isUnique;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<EventOccurrenceUsageImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Type> type;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Feature> output;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<EventOccurrenceUsageImpl, TransitionUsage> nestedTransition;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<EventOccurrenceUsageImpl, Usage> variant;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, Boolean> isSufficient;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, StateUsage> nestedState;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Comment> documentationComment;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<EventOccurrenceUsageImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, UUID> identifier;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, Boolean> isDerived;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, EnumerationUsage> nestedEnumeration;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, String> qualifiedName;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Documentation> documentation;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Feature> endFeature;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Feature> directedFeature;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, Boolean> isEnd;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, ItemUsage> nestedItem;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Type> featuringType;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Feature> input;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, Boolean> isComposite;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, ViewUsage> nestedView;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, String> name;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, OccurrenceUsage> nestedOccurrence;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<EventOccurrenceUsageImpl, Type> disjointType;
	public static volatile CollectionAttribute<EventOccurrenceUsageImpl, FlowConnectionUsage> nestedFlow;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<EventOccurrenceUsageImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, AllocationUsage> nestedAllocation;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, Boolean> isIndividual;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Membership> membership;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, Boolean> isPortion;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, Boolean> isNonunique;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, ReferenceUsage> nestedReference;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, Boolean> isReadOnly;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, Boolean> isVariation;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Feature> feature;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Element> member;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Class> occurrenceDefinition;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Feature> ownedEndFeature;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, Boolean> isReference;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Classifier> definition;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, UseCaseUsage> nestedUseCase;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, String> effectiveName;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Membership> importedMembership;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Element> ownedElement;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, FeatureMembership> featureMembership;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, PortionKind> portionKind;
	public static volatile CollectionAttribute<EventOccurrenceUsageImpl, ConcernUsage> nestedConcern;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<EventOccurrenceUsageImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<EventOccurrenceUsageImpl, VariantMembership> variantMembership;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, RenderingUsage> nestedRendering;
	public static volatile SingularAttribute<EventOccurrenceUsageImpl, String> humanId;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, ConnectorAsUsage> nestedConnection;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, String> aliasId;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, Specialization> ownedSpecialization;
	public static volatile ListAttribute<EventOccurrenceUsageImpl, ViewpointUsage> nestedViewpoint;

	public static final String DIRECTED_USAGE = "directedUsage";
	public static final String NESTED_PART = "nestedPart";
	public static final String CHAINING_FEATURE = "chainingFeature";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String USAGE = "usage";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String NESTED_REQUIREMENT = "nestedRequirement";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String NESTED_TRANSITION = "nestedTransition";
	public static final String NESTED_CONSTRAINT = "nestedConstraint";
	public static final String VARIANT = "variant";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String NESTED_STATE = "nestedState";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
	public static final String IS_DERIVED = "isDerived";
	public static final String NESTED_ATTRIBUTE = "nestedAttribute";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String NESTED_ENUMERATION = "nestedEnumeration";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String NESTED_ANALYSIS_CASE = "nestedAnalysisCase";
	public static final String NESTED_VERIFICATION_CASE = "nestedVerificationCase";
	public static final String END_FEATURE = "endFeature";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String IS_END = "isEnd";
	public static final String NESTED_ITEM = "nestedItem";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String INPUT = "input";
	public static final String NESTED_CALCULATION = "nestedCalculation";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String NESTED_VIEW = "nestedView";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String NESTED_OCCURRENCE = "nestedOccurrence";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String DISJOINT_TYPE = "disjointType";
	public static final String NESTED_FLOW = "nestedFlow";
	public static final String NESTED_CASE = "nestedCase";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String NESTED_ALLOCATION = "nestedAllocation";
	public static final String IS_INDIVIDUAL = "isIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_PORTION = "isPortion";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String OWNED_FEATURE_CHAINING = "ownedFeatureChaining";
	public static final String IS_READ_ONLY = "isReadOnly";
	public static final String IS_VARIATION = "isVariation";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OCCURRENCE_DEFINITION = "occurrenceDefinition";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String IS_REFERENCE = "isReference";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String DEFINITION = "definition";
	public static final String NESTED_USE_CASE = "nestedUseCase";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String DIRECTION = "direction";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String PORTION_KIND = "portionKind";
	public static final String NESTED_CONCERN = "nestedConcern";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String HUMAN_ID = "humanId";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String ALIAS_ID = "aliasId";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";

}

