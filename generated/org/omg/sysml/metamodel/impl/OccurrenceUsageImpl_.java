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
@StaticMetamodel(OccurrenceUsageImpl.class)
public abstract class OccurrenceUsageImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<OccurrenceUsageImpl, Usage> directedUsage;
	public static volatile ListAttribute<OccurrenceUsageImpl, PartUsage> nestedPart;
	public static volatile ListAttribute<OccurrenceUsageImpl, Feature> chainingFeature;
	public static volatile ListAttribute<OccurrenceUsageImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<OccurrenceUsageImpl, Boolean> isConjugated;
	public static volatile ListAttribute<OccurrenceUsageImpl, Usage> usage;
	public static volatile SingularAttribute<OccurrenceUsageImpl, Boolean> isUnique;
	public static volatile ListAttribute<OccurrenceUsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<OccurrenceUsageImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<OccurrenceUsageImpl, Type> type;
	public static volatile ListAttribute<OccurrenceUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile ListAttribute<OccurrenceUsageImpl, Feature> output;
	public static volatile ListAttribute<OccurrenceUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<OccurrenceUsageImpl, TransitionUsage> nestedTransition;
	public static volatile ListAttribute<OccurrenceUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<OccurrenceUsageImpl, Usage> variant;
	public static volatile SingularAttribute<OccurrenceUsageImpl, Boolean> isSufficient;
	public static volatile ListAttribute<OccurrenceUsageImpl, StateUsage> nestedState;
	public static volatile SingularAttribute<OccurrenceUsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<OccurrenceUsageImpl, Redefinition> ownedRedefinition;
	public static volatile ListAttribute<OccurrenceUsageImpl, TextualRepresentation> textualRepresentation;
	public static volatile SingularAttribute<OccurrenceUsageImpl, UUID> identifier;
	public static volatile SingularAttribute<OccurrenceUsageImpl, Boolean> isDerived;
	public static volatile ListAttribute<OccurrenceUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile ListAttribute<OccurrenceUsageImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<OccurrenceUsageImpl, EnumerationUsage> nestedEnumeration;
	public static volatile ListAttribute<OccurrenceUsageImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<OccurrenceUsageImpl, String> qualifiedName;
	public static volatile ListAttribute<OccurrenceUsageImpl, Documentation> documentation;
	public static volatile ListAttribute<OccurrenceUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile ListAttribute<OccurrenceUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile ListAttribute<OccurrenceUsageImpl, Feature> endFeature;
	public static volatile ListAttribute<OccurrenceUsageImpl, Feature> directedFeature;
	public static volatile SingularAttribute<OccurrenceUsageImpl, Boolean> isEnd;
	public static volatile ListAttribute<OccurrenceUsageImpl, ItemUsage> nestedItem;
	public static volatile ListAttribute<OccurrenceUsageImpl, Type> featuringType;
	public static volatile ListAttribute<OccurrenceUsageImpl, Feature> input;
	public static volatile ListAttribute<OccurrenceUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile SingularAttribute<OccurrenceUsageImpl, Boolean> isComposite;
	public static volatile ListAttribute<OccurrenceUsageImpl, ViewUsage> nestedView;
	public static volatile SingularAttribute<OccurrenceUsageImpl, String> name;
	public static volatile ListAttribute<OccurrenceUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<OccurrenceUsageImpl, OccurrenceUsage> nestedOccurrence;
	public static volatile ListAttribute<OccurrenceUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<OccurrenceUsageImpl, FlowConnectionUsage> nestedFlow;
	public static volatile ListAttribute<OccurrenceUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<OccurrenceUsageImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<OccurrenceUsageImpl, AllocationUsage> nestedAllocation;
	public static volatile SingularAttribute<OccurrenceUsageImpl, Boolean> isIndividual;
	public static volatile ListAttribute<OccurrenceUsageImpl, Membership> membership;
	public static volatile SingularAttribute<OccurrenceUsageImpl, Boolean> isPortion;
	public static volatile SingularAttribute<OccurrenceUsageImpl, Boolean> isNonunique;
	public static volatile ListAttribute<OccurrenceUsageImpl, ReferenceUsage> nestedReference;
	public static volatile ListAttribute<OccurrenceUsageImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile SingularAttribute<OccurrenceUsageImpl, Boolean> isReadOnly;
	public static volatile SingularAttribute<OccurrenceUsageImpl, Boolean> isVariation;
	public static volatile ListAttribute<OccurrenceUsageImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<OccurrenceUsageImpl, Feature> feature;
	public static volatile ListAttribute<OccurrenceUsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<OccurrenceUsageImpl, Element> member;
	public static volatile ListAttribute<OccurrenceUsageImpl, Class> occurrenceDefinition;
	public static volatile ListAttribute<OccurrenceUsageImpl, Feature> ownedEndFeature;
	public static volatile SingularAttribute<OccurrenceUsageImpl, Boolean> isReference;
	public static volatile ListAttribute<OccurrenceUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<OccurrenceUsageImpl, Classifier> definition;
	public static volatile ListAttribute<OccurrenceUsageImpl, UseCaseUsage> nestedUseCase;
	public static volatile ListAttribute<OccurrenceUsageImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<OccurrenceUsageImpl, String> effectiveName;
	public static volatile SingularAttribute<OccurrenceUsageImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<OccurrenceUsageImpl, Membership> importedMembership;
	public static volatile ListAttribute<OccurrenceUsageImpl, Element> ownedElement;
	public static volatile ListAttribute<OccurrenceUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<OccurrenceUsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<OccurrenceUsageImpl, FeatureMembership> featureMembership;
	public static volatile SingularAttribute<OccurrenceUsageImpl, PortionKind> portionKind;
	public static volatile CollectionAttribute<OccurrenceUsageImpl, ConcernUsage> nestedConcern;
	public static volatile ListAttribute<OccurrenceUsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<OccurrenceUsageImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<OccurrenceUsageImpl, VariantMembership> variantMembership;
	public static volatile ListAttribute<OccurrenceUsageImpl, RenderingUsage> nestedRendering;
	public static volatile SingularAttribute<OccurrenceUsageImpl, String> humanId;
	public static volatile ListAttribute<OccurrenceUsageImpl, ConnectorAsUsage> nestedConnection;
	public static volatile ListAttribute<OccurrenceUsageImpl, String> aliasId;
	public static volatile ListAttribute<OccurrenceUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile ListAttribute<OccurrenceUsageImpl, Specialization> ownedSpecialization;
	public static volatile ListAttribute<OccurrenceUsageImpl, ViewpointUsage> nestedViewpoint;

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
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String TEXTUAL_REPRESENTATION = "textualRepresentation";
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
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String HUMAN_ID = "humanId";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String ALIAS_ID = "aliasId";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";

}

