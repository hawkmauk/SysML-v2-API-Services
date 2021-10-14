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
import org.omg.sysml.metamodel.AssociationStructure;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.Behavior;
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
import org.omg.sysml.metamodel.ItemFeature;
import org.omg.sysml.metamodel.ItemFlowEnd;
import org.omg.sysml.metamodel.ItemFlowFeature;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.OccurrenceUsage;
import org.omg.sysml.metamodel.PartDefinition;
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
import org.omg.sysml.metamodel.Structure;
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
@StaticMetamodel(FlowConnectionUsageImpl.class)
public abstract class FlowConnectionUsageImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<FlowConnectionUsageImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Usage> usage;
	public static volatile CollectionAttribute<FlowConnectionUsageImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Type> type;
	public static volatile ListAttribute<FlowConnectionUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Feature> output;
	public static volatile ListAttribute<FlowConnectionUsageImpl, PortUsage> nestedPort;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Feature> sourceOutputFeature;
	public static volatile CollectionAttribute<FlowConnectionUsageImpl, TransitionUsage> nestedTransition;
	public static volatile ListAttribute<FlowConnectionUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<FlowConnectionUsageImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, UUID> identifier;
	public static volatile ListAttribute<FlowConnectionUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile ListAttribute<FlowConnectionUsageImpl, EnumerationUsage> nestedEnumeration;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Feature> ownedFeature;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Documentation> documentation;
	public static volatile ListAttribute<FlowConnectionUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Feature> directedFeature;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Feature> input;
	public static volatile ListAttribute<FlowConnectionUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Feature> targetInputFeature;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Element> relatedElement;
	public static volatile ListAttribute<FlowConnectionUsageImpl, ViewUsage> nestedView;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<FlowConnectionUsageImpl, OccurrenceUsage> nestedOccurrence;
	public static volatile ListAttribute<FlowConnectionUsageImpl, AllocationUsage> nestedAllocation;
	public static volatile CollectionAttribute<FlowConnectionUsageImpl, Association> association;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, Boolean> isPortion;
	public static volatile ListAttribute<FlowConnectionUsageImpl, ReferenceUsage> nestedReference;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, Boolean> isReadOnly;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, Boolean> isVariation;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Feature> feature;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Element> member;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, Boolean> isReference;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Behavior> behavior;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, String> effectiveName;
	public static volatile CollectionAttribute<FlowConnectionUsageImpl, ItemFlowFeature> itemFlowFeature;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Membership> importedMembership;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Element> ownedElement;
	public static volatile ListAttribute<FlowConnectionUsageImpl, PartDefinition> partDefinition;
	public static volatile ListAttribute<FlowConnectionUsageImpl, FeatureMembership> featureMembership;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, PortionKind> portionKind;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, Boolean> isAbstract;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Feature> relatedFeature;
	public static volatile ListAttribute<FlowConnectionUsageImpl, RenderingUsage> nestedRendering;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, String> humanId;
	public static volatile ListAttribute<FlowConnectionUsageImpl, ConnectorAsUsage> nestedConnection;
	public static volatile ListAttribute<FlowConnectionUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Specialization> ownedSpecialization;
	public static volatile ListAttribute<FlowConnectionUsageImpl, ViewpointUsage> nestedViewpoint;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Usage> directedUsage;
	public static volatile ListAttribute<FlowConnectionUsageImpl, PartUsage> nestedPart;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Feature> chainingFeature;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, Boolean> isUnique;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Usage> nestedUsage;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Element> source;
	public static volatile CollectionAttribute<FlowConnectionUsageImpl, Usage> variant;
	public static volatile ListAttribute<FlowConnectionUsageImpl, StateUsage> nestedState;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Comment> documentationComment;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, Boolean> isOrdered;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, Boolean> isDerived;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Annotation> ownedAnnotation;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, String> qualifiedName;
	public static volatile ListAttribute<FlowConnectionUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Feature> endFeature;
	public static volatile CollectionAttribute<FlowConnectionUsageImpl, ItemFeature> itemFeature;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, Boolean> isEnd;
	public static volatile ListAttribute<FlowConnectionUsageImpl, ItemUsage> nestedItem;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Type> featuringType;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, Boolean> isComposite;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, String> name;
	public static volatile CollectionAttribute<FlowConnectionUsageImpl, Feature> connectorEnd;
	public static volatile ListAttribute<FlowConnectionUsageImpl, AssociationStructure> connectionDefinition;
	public static volatile CollectionAttribute<FlowConnectionUsageImpl, ItemFlowEnd> itemFlowEnd;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<FlowConnectionUsageImpl, Type> disjointType;
	public static volatile CollectionAttribute<FlowConnectionUsageImpl, FlowConnectionUsage> nestedFlow;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Classifier> itemType;
	public static volatile ListAttribute<FlowConnectionUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<FlowConnectionUsageImpl, Disjoining> ownedDisjoining;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, Boolean> isIndividual;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Membership> membership;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Element> ownedRelatedElement;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<FlowConnectionUsageImpl, Feature> targetFeature;
	public static volatile ListAttribute<FlowConnectionUsageImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile ListAttribute<FlowConnectionUsageImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Feature> parameter;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Class> occurrenceDefinition;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<FlowConnectionUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Classifier> definition;
	public static volatile ListAttribute<FlowConnectionUsageImpl, UseCaseUsage> nestedUseCase;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<FlowConnectionUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<FlowConnectionUsageImpl, ConcernUsage> nestedConcern;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Import> ownedImport;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Structure> itemDefinition;
	public static volatile ListAttribute<FlowConnectionUsageImpl, Element> target;
	public static volatile CollectionAttribute<FlowConnectionUsageImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<FlowConnectionUsageImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<FlowConnectionUsageImpl, Boolean> isDirected;
	public static volatile ListAttribute<FlowConnectionUsageImpl, String> aliasId;

	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String USAGE = "usage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String NESTED_REQUIREMENT = "nestedRequirement";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String SOURCE_OUTPUT_FEATURE = "sourceOutputFeature";
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
	public static final String TARGET_INPUT_FEATURE = "targetInputFeature";
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
	public static final String BEHAVIOR = "behavior";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String ITEM_FLOW_FEATURE = "itemFlowFeature";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String PART_DEFINITION = "partDefinition";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String PORTION_KIND = "portionKind";
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
	public static final String VARIANT = "variant";
	public static final String NESTED_STATE = "nestedState";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IS_ORDERED = "isOrdered";
	public static final String IS_DERIVED = "isDerived";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String NESTED_VERIFICATION_CASE = "nestedVerificationCase";
	public static final String END_FEATURE = "endFeature";
	public static final String ITEM_FEATURE = "itemFeature";
	public static final String IS_END = "isEnd";
	public static final String NESTED_ITEM = "nestedItem";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String NAME = "name";
	public static final String CONNECTOR_END = "connectorEnd";
	public static final String CONNECTION_DEFINITION = "connectionDefinition";
	public static final String ITEM_FLOW_END = "itemFlowEnd";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String DISJOINT_TYPE = "disjointType";
	public static final String NESTED_FLOW = "nestedFlow";
	public static final String ITEM_TYPE = "itemType";
	public static final String NESTED_CASE = "nestedCase";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String IS_INDIVIDUAL = "isIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String TARGET_FEATURE = "targetFeature";
	public static final String OWNED_FEATURE_CHAINING = "ownedFeatureChaining";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String OCCURRENCE_DEFINITION = "occurrenceDefinition";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String DEFINITION = "definition";
	public static final String NESTED_USE_CASE = "nestedUseCase";
	public static final String DIRECTION = "direction";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String NESTED_CONCERN = "nestedConcern";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String ITEM_DEFINITION = "itemDefinition";
	public static final String TARGET = "target";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String IS_DIRECTED = "isDirected";
	public static final String ALIAS_ID = "aliasId";

}
