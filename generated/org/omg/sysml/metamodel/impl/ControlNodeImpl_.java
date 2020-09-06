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
import org.omg.sysml.metamodel.AttributeUsage;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
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
@StaticMetamodel(ControlNodeImpl.class)
public abstract class ControlNodeImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<ControlNodeImpl, Generalization> ownedGeneralization;
	public static volatile CollectionAttribute<ControlNodeImpl, PartUsage> nestedPart;
	public static volatile SingularAttribute<ControlNodeImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<ControlNodeImpl, Usage> usage;
	public static volatile SingularAttribute<ControlNodeImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<ControlNodeImpl, Usage> nestedUsage;
	public static volatile CollectionAttribute<ControlNodeImpl, Subsetting> ownedSubsetting;
	public static volatile CollectionAttribute<ControlNodeImpl, Type> type;
	public static volatile CollectionAttribute<ControlNodeImpl, RequirementUsage> nestedRequirement;
	public static volatile CollectionAttribute<ControlNodeImpl, Feature> output;
	public static volatile CollectionAttribute<ControlNodeImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<ControlNodeImpl, TransitionUsage> nestedTransition;
	public static volatile CollectionAttribute<ControlNodeImpl, ConstraintUsage> nestedConstraint;
	public static volatile CollectionAttribute<ControlNodeImpl, Usage> variant;
	public static volatile SingularAttribute<ControlNodeImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<ControlNodeImpl, StateUsage> nestedState;
	public static volatile CollectionAttribute<ControlNodeImpl, Comment> documentationComment;
	public static volatile SingularAttribute<ControlNodeImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<ControlNodeImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<ControlNodeImpl, UUID> identifier;
	public static volatile CollectionAttribute<ControlNodeImpl, AttributeUsage> nestedAttribute;
	public static volatile CollectionAttribute<ControlNodeImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<ControlNodeImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<ControlNodeImpl, Usage> flowFeature;
	public static volatile CollectionAttribute<ControlNodeImpl, Documentation> documentation;
	public static volatile CollectionAttribute<ControlNodeImpl, AnalysisCaseUsage> nestedAnalysisCase;
	public static volatile CollectionAttribute<ControlNodeImpl, VerificationCaseUsage> nestedVerificationCase;
	public static volatile CollectionAttribute<ControlNodeImpl, Feature> endFeature;
	public static volatile CollectionAttribute<ControlNodeImpl, Behavior> actionDefinition;
	public static volatile CollectionAttribute<ControlNodeImpl, Type> referencedType;
	public static volatile SingularAttribute<ControlNodeImpl, Boolean> isEnd;
	public static volatile CollectionAttribute<ControlNodeImpl, ItemUsage> nestedItem;
	public static volatile CollectionAttribute<ControlNodeImpl, Feature> input;
	public static volatile CollectionAttribute<ControlNodeImpl, CalculationUsage> nestedCalculation;
	public static volatile SingularAttribute<ControlNodeImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<ControlNodeImpl, ViewUsage> nestedView;
	public static volatile CollectionAttribute<ControlNodeImpl, Type> ownedType;
	public static volatile SingularAttribute<ControlNodeImpl, String> name;
	public static volatile ListAttribute<ControlNodeImpl, Element> ownedMember;
	public static volatile ListAttribute<ControlNodeImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<ControlNodeImpl, CaseUsage> nestedCase;
	public static volatile CollectionAttribute<ControlNodeImpl, IndividualUsage> nestedIndividual;
	public static volatile ListAttribute<ControlNodeImpl, Membership> membership;
	public static volatile SingularAttribute<ControlNodeImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<ControlNodeImpl, ReferenceUsage> nestedReference;
	public static volatile SingularAttribute<ControlNodeImpl, Boolean> isVariation;
	public static volatile CollectionAttribute<ControlNodeImpl, FeatureTyping> ownedTyping;
	public static volatile CollectionAttribute<ControlNodeImpl, Feature> feature;
	public static volatile ListAttribute<ControlNodeImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<ControlNodeImpl, Feature> parameter;
	public static volatile ListAttribute<ControlNodeImpl, Element> member;
	public static volatile CollectionAttribute<ControlNodeImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<ControlNodeImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<ControlNodeImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<ControlNodeImpl, Behavior> behavior;
	public static volatile ListAttribute<ControlNodeImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<ControlNodeImpl, Element> ownedElement;
	public static volatile CollectionAttribute<ControlNodeImpl, ActionUsage> nestedAction;
	public static volatile ListAttribute<ControlNodeImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<ControlNodeImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<ControlNodeImpl, Import> ownedImport;
	public static volatile SingularAttribute<ControlNodeImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<ControlNodeImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<ControlNodeImpl, VariantMembership> variantMembership;
	public static volatile CollectionAttribute<ControlNodeImpl, RenderingUsage> nestedRendering;
	public static volatile SingularAttribute<ControlNodeImpl, String> humanId;
	public static volatile CollectionAttribute<ControlNodeImpl, ConnectionUsage> nestedConnection;
	public static volatile CollectionAttribute<ControlNodeImpl, String> aliasId;
	public static volatile CollectionAttribute<ControlNodeImpl, InterfaceUsage> nestedInterface;
	public static volatile CollectionAttribute<ControlNodeImpl, ViewpointUsage> nestedViewpoint;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String NESTED_PART = "nestedPart";
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
	public static final String NESTED_ATTRIBUTE = "nestedAttribute";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String FLOW_FEATURE = "flowFeature";
	public static final String DOCUMENTATION = "documentation";
	public static final String NESTED_ANALYSIS_CASE = "nestedAnalysisCase";
	public static final String NESTED_VERIFICATION_CASE = "nestedVerificationCase";
	public static final String END_FEATURE = "endFeature";
	public static final String ACTION_DEFINITION = "actionDefinition";
	public static final String REFERENCED_TYPE = "referencedType";
	public static final String IS_END = "isEnd";
	public static final String NESTED_ITEM = "nestedItem";
	public static final String INPUT = "input";
	public static final String NESTED_CALCULATION = "nestedCalculation";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String NESTED_VIEW = "nestedView";
	public static final String OWNED_TYPE = "ownedType";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String NESTED_CASE = "nestedCase";
	public static final String NESTED_INDIVIDUAL = "nestedIndividual";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String NESTED_REFERENCE = "nestedReference";
	public static final String IS_VARIATION = "isVariation";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String VARIANT_MEMBERSHIP = "variantMembership";
	public static final String NESTED_RENDERING = "nestedRendering";
	public static final String HUMAN_ID = "humanId";
	public static final String NESTED_CONNECTION = "nestedConnection";
	public static final String ALIAS_ID = "aliasId";
	public static final String NESTED_INTERFACE = "nestedInterface";
	public static final String NESTED_VIEWPOINT = "nestedViewpoint";

}

