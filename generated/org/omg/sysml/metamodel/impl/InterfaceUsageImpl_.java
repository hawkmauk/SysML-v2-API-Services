package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.AnalysisCaseUsage;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Association;
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Class;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.IndividualUsage;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PartDefinition;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(InterfaceUsageImpl.class)
public abstract class InterfaceUsageImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<InterfaceUsageImpl, Generalization> ownedGeneralization;
	public static volatile CollectionAttribute<InterfaceUsageImpl, PartUsage> nestedPart;
	public static volatile SingularAttribute<InterfaceUsageImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Usage> usage;
	public static volatile SingularAttribute<InterfaceUsageImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<InterfaceUsageImpl, Element> source;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Type> type;
	public static volatile CollectionAttribute<InterfaceUsageImpl, RequirementUsage> nestedRequirement;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Feature> output;
	public static volatile CollectionAttribute<InterfaceUsageImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<InterfaceUsageImpl, TransitionUsage> nestedTransition;
	public static volatile CollectionAttribute<InterfaceUsageImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Usage> variant;
	public static volatile SingularAttribute<InterfaceUsageImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<InterfaceUsageImpl, StateUsage> nestedState;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Comment> documentationComment;
	public static volatile SingularAttribute<InterfaceUsageImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<InterfaceUsageImpl, UUID> identifier;
	public static volatile CollectionAttribute<InterfaceUsageImpl, AttributeUsage> nestedAttribute;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Usage> flowFeature;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Documentation> documentation;
	public static volatile CollectionAttribute<InterfaceUsageImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile CollectionAttribute<InterfaceUsageImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Feature> endFeature;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Association> ownedAssociationType;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Type> referencedType;
	public static volatile SingularAttribute<InterfaceUsageImpl, Boolean> isEnd;
	public static volatile CollectionAttribute<InterfaceUsageImpl, ItemUsage> nestedItem;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Feature> input;
	public static volatile CollectionAttribute<InterfaceUsageImpl, CalculationUsage> nestedCalculation;
	public static volatile SingularAttribute<InterfaceUsageImpl, Boolean> isComposite;
	public static volatile ListAttribute<InterfaceUsageImpl, Element> relatedElement;
	public static volatile CollectionAttribute<InterfaceUsageImpl, ViewUsage> nestedView;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Type> ownedType;
	public static volatile SingularAttribute<InterfaceUsageImpl, String> name;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Feature> connectorEnd;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Association> connectionDefinition;
	public static volatile ListAttribute<InterfaceUsageImpl, Element> ownedMember;
	public static volatile ListAttribute<InterfaceUsageImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<InterfaceUsageImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Association> association;
	public static volatile CollectionAttribute<InterfaceUsageImpl, IndividualUsage> nestedIndividual;
	public static volatile ListAttribute<InterfaceUsageImpl, Membership> membership;
	public static volatile ListAttribute<InterfaceUsageImpl, Element> ownedRelatedElement;
	public static volatile SingularAttribute<InterfaceUsageImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<InterfaceUsageImpl, ReferenceUsage> nestedReference;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Feature> targetFeature;
	public static volatile SingularAttribute<InterfaceUsageImpl, Boolean> isVariation;
	public static volatile CollectionAttribute<InterfaceUsageImpl, FeatureTyping> ownedTyping;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Feature> feature;
	public static volatile ListAttribute<InterfaceUsageImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<InterfaceUsageImpl, Element> member;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<InterfaceUsageImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<InterfaceUsageImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Element> ownedElement;
	public static volatile CollectionAttribute<InterfaceUsageImpl, PartDefinition> partDefinition;
	public static volatile CollectionAttribute<InterfaceUsageImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<InterfaceUsageImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<InterfaceUsageImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<InterfaceUsageImpl, Import> ownedImport;
	public static volatile SingularAttribute<InterfaceUsageImpl, Boolean> isAbstract;
	public static volatile ListAttribute<InterfaceUsageImpl, Feature> relatedFeature;
	public static volatile CollectionAttribute<InterfaceUsageImpl, Class> itemDefinition;
	public static volatile ListAttribute<InterfaceUsageImpl, Element> target;
	public static volatile CollectionAttribute<InterfaceUsageImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<InterfaceUsageImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<InterfaceUsageImpl, Boolean> isDirected;
	public static volatile CollectionAttribute<InterfaceUsageImpl, RenderingUsage> nestedRendering;
	public static volatile SingularAttribute<InterfaceUsageImpl, String> humanId;
	public static volatile CollectionAttribute<InterfaceUsageImpl, ConnectionUsage> nestedConnection;
	public static volatile CollectionAttribute<InterfaceUsageImpl, String> aliasId;
	public static volatile CollectionAttribute<InterfaceUsageImpl, InterfaceUsage> nestedInterface;
	public static volatile CollectionAttribute<InterfaceUsageImpl, ViewpointUsage> nestedViewpoint;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String NESTED_PART = "nestedPart";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String USAGE = "usage";
	public static final String IS_UNIQUE = "isUnique";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String SOURCE = "source";
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
	public static final String NESTED_ATTRIBUTE = "nestedAttribute";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String FLOW_FEATURE = "flowFeature";
	public static final String DOCUMENTATION = "documentation";
	public static final String NESTED_ANALYSIS_CASE = "nestedAnalysisCase";
	public static final String NESTED_VERIFICATION_CASE = "nestedVerificationCase";
	public static final String END_FEATURE = "endFeature";
	public static final String OWNED_ASSOCIATION_TYPE = "ownedAssociationType";
	public static final String REFERENCED_TYPE = "referencedType";
	public static final String IS_END = "isEnd";
	public static final String NESTED_ITEM = "nestedItem";
	public static final String INPUT = "input";
	public static final String NESTED_CALCULATION = "nestedCalculation";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String NESTED_VIEW = "nestedView";
	public static final String OWNED_TYPE = "ownedType";
	public static final String NAME = "name";
	public static final String CONNECTOR_END = "connectorEnd";
	public static final String CONNECTION_DEFINITION = "connectionDefinition";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String NESTED_CASE = "nestedCase";
	public static final String ASSOCIATION = "association";
	public static final String NESTED_INDIVIDUAL = "nestedIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String TARGET_FEATURE = "targetFeature";
	public static final String IS_VARIATION = "isVariation";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String PART_DEFINITION = "partDefinition";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String RELATED_FEATURE = "relatedFeature";
	public static final String ITEM_DEFINITION = "itemDefinition";
	public static final String TARGET = "target";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String IS_DIRECTED = "isDirected";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String HUMAN_ID = "humanId";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String ALIAS_ID = "aliasId";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";

}

