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
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.Generalization;
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
import org.omg.sysml.metamodel.StakeholderUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Superclassing;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(AttributeDefinitionImpl.class)
public abstract class AttributeDefinitionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile CollectionAttribute<AttributeDefinitionImpl, PortUsage> ownedPort;
	public static volatile ListAttribute<AttributeDefinitionImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<AttributeDefinitionImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, EnumerationUsage> ownedEnumeration;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, VerificationCaseUsage> ownedVerificationCase;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, Usage> usage;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, ViewpointUsage> ownedViewpoint;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, AnalysisCaseUsage> ownedAnalysisCase;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, RenderingUsage> ownedRendering;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, ConstraintUsage> ownedConstraint;
	public static volatile ListAttribute<AttributeDefinitionImpl, Feature> output;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, Usage> variant;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, ItemUsage> ownedItem;
	public static volatile SingularAttribute<AttributeDefinitionImpl, Boolean> isSufficient;
	public static volatile ListAttribute<AttributeDefinitionImpl, Comment> documentationComment;
	public static volatile SingularAttribute<AttributeDefinitionImpl, UUID> identifier;
	public static volatile ListAttribute<AttributeDefinitionImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, ViewUsage> ownedView;
	public static volatile ListAttribute<AttributeDefinitionImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, Usage> flowFeature;
	public static volatile SingularAttribute<AttributeDefinitionImpl, String> qualifiedName;
	public static volatile ListAttribute<AttributeDefinitionImpl, Documentation> documentation;
	public static volatile ListAttribute<AttributeDefinitionImpl, Feature> endFeature;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, AllocationUsage> ownedAllocation;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, InterfaceUsage> ownedInterface;
	public static volatile ListAttribute<AttributeDefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, ActionUsage> ownedAction;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, CaseUsage> ownedCase;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, CalculationUsage> ownedCalculation;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, OccurrenceUsage> ownedOccurrence;
	public static volatile SingularAttribute<AttributeDefinitionImpl, String> name;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, ReferenceUsage> ownedReference;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, Usage> ownedUsage;
	public static volatile ListAttribute<AttributeDefinitionImpl, Element> ownedMember;
	public static volatile ListAttribute<AttributeDefinitionImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, StateUsage> ownedState;
	public static volatile ListAttribute<AttributeDefinitionImpl, Membership> membership;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, Superclassing> ownedSuperclassing;
	public static volatile SingularAttribute<AttributeDefinitionImpl, Boolean> isVariation;
	public static volatile ListAttribute<AttributeDefinitionImpl, Feature> feature;
	public static volatile ListAttribute<AttributeDefinitionImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<AttributeDefinitionImpl, Element> member;
	public static volatile ListAttribute<AttributeDefinitionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<AttributeDefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<AttributeDefinitionImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, TransitionUsage> ownedTransition;
	public static volatile SingularAttribute<AttributeDefinitionImpl, String> effectiveName;
	public static volatile ListAttribute<AttributeDefinitionImpl, Membership> importedMembership;
	public static volatile ListAttribute<AttributeDefinitionImpl, Element> ownedElement;
	public static volatile ListAttribute<AttributeDefinitionImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, ConnectionUsage> ownedConnection;
	public static volatile ListAttribute<AttributeDefinitionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<AttributeDefinitionImpl, Import> ownedImport;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, RequirementUsage> ownedRequirement;
	public static volatile SingularAttribute<AttributeDefinitionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<AttributeDefinitionImpl, String> humanId;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, StakeholderUsage> ownedStakeholder;
	public static volatile ListAttribute<AttributeDefinitionImpl, String> aliasId;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, ConcernUsage> ownedConcern;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, AttributeUsage> ownedAttribute;
	public static volatile CollectionAttribute<AttributeDefinitionImpl, PartUsage> ownedPart;

	public static final String OWNED_PORT = "ownedPort";
	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
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
	public static final String FLOW_FEATURE = "flowFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String END_FEATURE = "endFeature";
	public static final String OWNED_ALLOCATION = "ownedAllocation";
	public static final String OWNED_INTERFACE = "ownedInterface";
	public static final String INPUT = "input";
	public static final String OWNED_ACTION = "ownedAction";
	public static final String OWNED_CASE = "ownedCase";
	public static final String OWNED_CALCULATION = "ownedCalculation";
	public static final String OWNED_OCCURRENCE = "ownedOccurrence";
	public static final String NAME = "name";
	public static final String OWNED_REFERENCE = "ownedReference";
	public static final String OWNED_USAGE = "ownedUsage";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String OWNED_STATE = "ownedState";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_SUPERCLASSING = "ownedSuperclassing";
	public static final String IS_VARIATION = "isVariation";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
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
	public static final String OWNED_STAKEHOLDER = "ownedStakeholder";
	public static final String ALIAS_ID = "aliasId";
	public static final String OWNED_CONCERN = "ownedConcern";
	public static final String OWNED_ATTRIBUTE = "ownedAttribute";
	public static final String OWNED_PART = "ownedPart";

}

