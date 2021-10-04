package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.Comment;
import org.omg.sysml.metamodel.Disjoining;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureChaining;
import org.omg.sysml.metamodel.FeatureDirectionKind;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Specialization;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TextualRepresentation;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.TypeFeaturing;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(StepImpl.class)
public abstract class StepImpl_ extends org.omg.sysml.metamodel.impl.SysMLTypeImpl_ {

	public static volatile ListAttribute<StepImpl, Feature> chainingFeature;
	public static volatile ListAttribute<StepImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<StepImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<StepImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<StepImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<StepImpl, Type> type;
	public static volatile ListAttribute<StepImpl, Feature> output;
	public static volatile SingularAttribute<StepImpl, Boolean> isSufficient;
	public static volatile ListAttribute<StepImpl, Comment> documentationComment;
	public static volatile SingularAttribute<StepImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<StepImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<StepImpl, UUID> identifier;
	public static volatile SingularAttribute<StepImpl, Boolean> isDerived;
	public static volatile ListAttribute<StepImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<StepImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<StepImpl, String> qualifiedName;
	public static volatile ListAttribute<StepImpl, Documentation> documentation;
	public static volatile ListAttribute<StepImpl, Feature> endFeature;
	public static volatile ListAttribute<StepImpl, Feature> directedFeature;
	public static volatile SingularAttribute<StepImpl, Boolean> isEnd;
	public static volatile ListAttribute<StepImpl, Type> featuringType;
	public static volatile ListAttribute<StepImpl, Feature> input;
	public static volatile SingularAttribute<StepImpl, Boolean> isComposite;
	public static volatile SingularAttribute<StepImpl, String> name;
	public static volatile ListAttribute<StepImpl, Element> ownedMember;
	public static volatile ListAttribute<StepImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<StepImpl, Type> disjointType;
	public static volatile CollectionAttribute<StepImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<StepImpl, Membership> membership;
	public static volatile SingularAttribute<StepImpl, Boolean> isPortion;
	public static volatile SingularAttribute<StepImpl, Boolean> isNonunique;
	public static volatile ListAttribute<StepImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile SingularAttribute<StepImpl, Boolean> isReadOnly;
	public static volatile ListAttribute<StepImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<StepImpl, Feature> feature;
	public static volatile ListAttribute<StepImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<StepImpl, Feature> parameter;
	public static volatile ListAttribute<StepImpl, Element> member;
	public static volatile ListAttribute<StepImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<StepImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<StepImpl, Feature> inheritedFeature;
	public static volatile ListAttribute<StepImpl, Behavior> behavior;
	public static volatile SingularAttribute<StepImpl, String> effectiveName;
	public static volatile SingularAttribute<StepImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<StepImpl, Membership> importedMembership;
	public static volatile ListAttribute<StepImpl, Element> ownedElement;
	public static volatile ListAttribute<StepImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<StepImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<StepImpl, Import> ownedImport;
	public static volatile SingularAttribute<StepImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<StepImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile SingularAttribute<StepImpl, String> humanId;
	public static volatile ListAttribute<StepImpl, String> aliasId;
	public static volatile ListAttribute<StepImpl, Specialization> ownedSpecialization;

	public static final String CHAINING_FEATURE = "chainingFeature";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String OUTPUT = "output";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String DOCUMENTATION_COMMENT = "documentationComment";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
	public static final String IS_DERIVED = "isDerived";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String END_FEATURE = "endFeature";
	public static final String DIRECTED_FEATURE = "directedFeature";
	public static final String IS_END = "isEnd";
	public static final String FEATURING_TYPE = "featuringType";
	public static final String INPUT = "input";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String DISJOINT_TYPE = "disjointType";
	public static final String OWNED_DISJOINING = "ownedDisjoining";
	public static final String MEMBERSHIP = "membership";
	public static final String IS_PORTION = "isPortion";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String OWNED_FEATURE_CHAINING = "ownedFeatureChaining";
	public static final String IS_READ_ONLY = "isReadOnly";
	public static final String OWNED_TYPING = "ownedTyping";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String EFFECTIVE_NAME = "effectiveName";
	public static final String DIRECTION = "direction";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_TEXTUAL_REPRESENTATION = "ownedTextualRepresentation";
	public static final String HUMAN_ID = "humanId";
	public static final String ALIAS_ID = "aliasId";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";

}

