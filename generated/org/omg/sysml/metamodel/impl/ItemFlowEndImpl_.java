package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
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
@StaticMetamodel(ItemFlowEndImpl.class)
public abstract class ItemFlowEndImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<ItemFlowEndImpl, Feature> chainingFeature;
	public static volatile ListAttribute<ItemFlowEndImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<ItemFlowEndImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<ItemFlowEndImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<ItemFlowEndImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<ItemFlowEndImpl, Type> type;
	public static volatile ListAttribute<ItemFlowEndImpl, Feature> output;
	public static volatile SingularAttribute<ItemFlowEndImpl, Boolean> isSufficient;
	public static volatile ListAttribute<ItemFlowEndImpl, Comment> documentationComment;
	public static volatile SingularAttribute<ItemFlowEndImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<ItemFlowEndImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<ItemFlowEndImpl, UUID> identifier;
	public static volatile SingularAttribute<ItemFlowEndImpl, Boolean> isDerived;
	public static volatile ListAttribute<ItemFlowEndImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<ItemFlowEndImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<ItemFlowEndImpl, String> qualifiedName;
	public static volatile ListAttribute<ItemFlowEndImpl, Documentation> documentation;
	public static volatile ListAttribute<ItemFlowEndImpl, Feature> endFeature;
	public static volatile ListAttribute<ItemFlowEndImpl, Feature> directedFeature;
	public static volatile SingularAttribute<ItemFlowEndImpl, Boolean> isEnd;
	public static volatile ListAttribute<ItemFlowEndImpl, Type> featuringType;
	public static volatile ListAttribute<ItemFlowEndImpl, Feature> input;
	public static volatile SingularAttribute<ItemFlowEndImpl, Boolean> isComposite;
	public static volatile SingularAttribute<ItemFlowEndImpl, String> name;
	public static volatile ListAttribute<ItemFlowEndImpl, Element> ownedMember;
	public static volatile ListAttribute<ItemFlowEndImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<ItemFlowEndImpl, Type> disjointType;
	public static volatile CollectionAttribute<ItemFlowEndImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<ItemFlowEndImpl, Membership> membership;
	public static volatile SingularAttribute<ItemFlowEndImpl, Boolean> isPortion;
	public static volatile SingularAttribute<ItemFlowEndImpl, Boolean> isNonunique;
	public static volatile ListAttribute<ItemFlowEndImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile SingularAttribute<ItemFlowEndImpl, Boolean> isReadOnly;
	public static volatile ListAttribute<ItemFlowEndImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<ItemFlowEndImpl, Feature> feature;
	public static volatile ListAttribute<ItemFlowEndImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<ItemFlowEndImpl, Element> member;
	public static volatile ListAttribute<ItemFlowEndImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<ItemFlowEndImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<ItemFlowEndImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<ItemFlowEndImpl, String> effectiveName;
	public static volatile SingularAttribute<ItemFlowEndImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<ItemFlowEndImpl, Membership> importedMembership;
	public static volatile ListAttribute<ItemFlowEndImpl, Element> ownedElement;
	public static volatile ListAttribute<ItemFlowEndImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<ItemFlowEndImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<ItemFlowEndImpl, Import> ownedImport;
	public static volatile SingularAttribute<ItemFlowEndImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<ItemFlowEndImpl, TextualRepresentation> ownedTextualRepresentation;
	public static volatile SingularAttribute<ItemFlowEndImpl, String> humanId;
	public static volatile ListAttribute<ItemFlowEndImpl, String> aliasId;
	public static volatile ListAttribute<ItemFlowEndImpl, Specialization> ownedSpecialization;

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
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
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

