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
import org.omg.sysml.metamodel.CalculationUsage;
import org.omg.sysml.metamodel.CaseUsage;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.ConnectionUsage;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.EnumerationUsage;
import org.omg.sysml.metamodel.Expression;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.IndividualUsage;
import org.omg.sysml.metamodel.InterfaceUsage;
import org.omg.sysml.metamodel.ItemUsage;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PartUsage;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.ReferenceUsage;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RenderingUsage;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Step;
import org.omg.sysml.metamodel.Superclassing;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(CaseDefinitionImpl.class)
public abstract class CaseDefinitionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile CollectionAttribute<CaseDefinitionImpl, CalculationUsage> calculation;
	public static volatile CollectionAttribute<CaseDefinitionImpl, PortUsage> ownedPort;
	public static volatile ListAttribute<CaseDefinitionImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<CaseDefinitionImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<CaseDefinitionImpl, EnumerationUsage> ownedEnumeration;
	public static volatile CollectionAttribute<CaseDefinitionImpl, VerificationCaseUsage> ownedVerificationCase;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Usage> usage;
	public static volatile CollectionAttribute<CaseDefinitionImpl, ViewpointUsage> ownedViewpoint;
	public static volatile CollectionAttribute<CaseDefinitionImpl, AnalysisCaseUsage> ownedAnalysisCase;
	public static volatile CollectionAttribute<CaseDefinitionImpl, RenderingUsage> ownedRendering;
	public static volatile CollectionAttribute<CaseDefinitionImpl, ConstraintUsage> ownedConstraint;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Feature> output;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Usage> variant;
	public static volatile CollectionAttribute<CaseDefinitionImpl, ActionUsage> action;
	public static volatile CollectionAttribute<CaseDefinitionImpl, IndividualUsage> ownedIndividual;
	public static volatile CollectionAttribute<CaseDefinitionImpl, ItemUsage> ownedItem;
	public static volatile SingularAttribute<CaseDefinitionImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Comment> documentationComment;
	public static volatile SingularAttribute<CaseDefinitionImpl, UUID> identifier;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<CaseDefinitionImpl, ViewUsage> ownedView;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Usage> flowFeature;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Documentation> documentation;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Feature> endFeature;
	public static volatile CollectionAttribute<CaseDefinitionImpl, InterfaceUsage> ownedInterface;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<CaseDefinitionImpl, ActionUsage> ownedAction;
	public static volatile CollectionAttribute<CaseDefinitionImpl, CaseUsage> ownedCase;
	public static volatile CollectionAttribute<CaseDefinitionImpl, CalculationUsage> ownedCalculation;
	public static volatile SingularAttribute<CaseDefinitionImpl, String> name;
	public static volatile CollectionAttribute<CaseDefinitionImpl, ReferenceUsage> ownedReference;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Usage> ownedUsage;
	public static volatile ListAttribute<CaseDefinitionImpl, Element> ownedMember;
	public static volatile ListAttribute<CaseDefinitionImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<CaseDefinitionImpl, StateUsage> ownedState;
	public static volatile ListAttribute<CaseDefinitionImpl, Membership> membership;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Superclassing> ownedSuperclassing;
	public static volatile SingularAttribute<CaseDefinitionImpl, Boolean> isVariation;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Feature> feature;
	public static volatile ListAttribute<CaseDefinitionImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Feature> parameter;
	public static volatile ListAttribute<CaseDefinitionImpl, Element> member;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<CaseDefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<CaseDefinitionImpl, TransitionUsage> ownedTransition;
	public static volatile ListAttribute<CaseDefinitionImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Element> ownedElement;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Expression> expression;
	public static volatile ListAttribute<CaseDefinitionImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<CaseDefinitionImpl, ConnectionUsage> ownedConnection;
	public static volatile ListAttribute<CaseDefinitionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<CaseDefinitionImpl, Import> ownedImport;
	public static volatile CollectionAttribute<CaseDefinitionImpl, RequirementUsage> ownedRequirement;
	public static volatile SingularAttribute<CaseDefinitionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<CaseDefinitionImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<CaseDefinitionImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<CaseDefinitionImpl, String> humanId;
	public static volatile CollectionAttribute<CaseDefinitionImpl, String> aliasId;
	public static volatile CollectionAttribute<CaseDefinitionImpl, Step> step;
	public static volatile CollectionAttribute<CaseDefinitionImpl, AttributeUsage> ownedAttribute;
	public static volatile CollectionAttribute<CaseDefinitionImpl, PartUsage> ownedPart;

	public static final String CALCULATION = "calculation";
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
	public static final String ACTION = "action";
	public static final String OWNED_INDIVIDUAL = "ownedIndividual";
	public static final String OWNED_ITEM = "ownedItem";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_VIEW = "ownedView";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String FLOW_FEATURE = "flowFeature";
	public static final String DOCUMENTATION = "documentation";
	public static final String END_FEATURE = "endFeature";
	public static final String OWNED_INTERFACE = "ownedInterface";
	public static final String INPUT = "input";
	public static final String OWNED_ACTION = "ownedAction";
	public static final String OWNED_CASE = "ownedCase";
	public static final String OWNED_CALCULATION = "ownedCalculation";
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
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String OWNED_TRANSITION = "ownedTransition";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String EXPRESSION = "expression";
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
	public static final String STEP = "step";
	public static final String OWNED_ATTRIBUTE = "ownedAttribute";
	public static final String OWNED_PART = "ownedPart";

}

