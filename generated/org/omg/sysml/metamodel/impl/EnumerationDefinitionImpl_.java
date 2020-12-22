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
import org.omg.sysml.metamodel.Superclassing;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Usage;
import org.omg.sysml.metamodel.VariantMembership;
import org.omg.sysml.metamodel.VerificationCaseUsage;
import org.omg.sysml.metamodel.ViewUsage;
import org.omg.sysml.metamodel.ViewpointUsage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(EnumerationDefinitionImpl.class)
public abstract class EnumerationDefinitionImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile CollectionAttribute<EnumerationDefinitionImpl, PortUsage> ownedPort;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, EnumerationUsage> ownedEnumeration;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, VerificationCaseUsage> ownedVerificationCase;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Usage> usage;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, ViewpointUsage> ownedViewpoint;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, AnalysisCaseUsage> ownedAnalysisCase;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, RenderingUsage> ownedRendering;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, ConstraintUsage> ownedConstraint;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Feature> output;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Usage> variant;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, IndividualUsage> ownedIndividual;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, ItemUsage> ownedItem;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, Boolean> isSufficient;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Comment> documentationComment;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, UUID> identifier;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Annotation> ownedAnnotation;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, ViewUsage> ownedView;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Usage> flowFeature;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Documentation> documentation;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Feature> endFeature;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, InterfaceUsage> ownedInterface;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Feature> input;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, ActionUsage> ownedAction;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, CaseUsage> ownedCase;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, CalculationUsage> ownedCalculation;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, String> name;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, ReferenceUsage> ownedReference;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Usage> ownedUsage;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Element> ownedMember;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, StateUsage> ownedState;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Membership> membership;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Superclassing> ownedSuperclassing;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, Boolean> isVariation;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Feature> feature;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Element> member;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<EnumerationDefinitionImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, TransitionUsage> ownedTransition;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, Element> ownedElement;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Relationship> ownedRelationship;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, ConnectionUsage> ownedConnection;
	public static volatile ListAttribute<EnumerationDefinitionImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<EnumerationDefinitionImpl, Import> ownedImport;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, RequirementUsage> ownedRequirement;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, VariantMembership> variantMembership;
	public static volatile SingularAttribute<EnumerationDefinitionImpl, String> humanId;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, String> aliasId;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, EnumerationUsage> enumeratedValue;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, AttributeUsage> ownedAttribute;
	public static volatile CollectionAttribute<EnumerationDefinitionImpl, PartUsage> ownedPart;

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
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String OWNED_TRANSITION = "ownedTransition";
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
	public static final String ENUMERATED_VALUE = "enumeratedValue";
	public static final String OWNED_ATTRIBUTE = "ownedAttribute";
	public static final String OWNED_PART = "ownedPart";

}
