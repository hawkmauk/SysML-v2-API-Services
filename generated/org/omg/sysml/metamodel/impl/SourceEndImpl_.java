package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
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
@StaticMetamodel(SourceEndImpl.class)
public abstract class SourceEndImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<SourceEndImpl, Feature> chainingFeature;
	public static volatile ListAttribute<SourceEndImpl, TypeFeaturing> ownedTypeFeaturing;
	public static volatile SingularAttribute<SourceEndImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<SourceEndImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<SourceEndImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<SourceEndImpl, Type> type;
	public static volatile ListAttribute<SourceEndImpl, Feature> output;
	public static volatile SingularAttribute<SourceEndImpl, Boolean> isSufficient;
	public static volatile SingularAttribute<SourceEndImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<SourceEndImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<SourceEndImpl, UUID> elementId;
	public static volatile ListAttribute<SourceEndImpl, TextualRepresentation> textualRepresentation;
	public static volatile SingularAttribute<SourceEndImpl, Boolean> isDerived;
	public static volatile ListAttribute<SourceEndImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<SourceEndImpl, Feature> ownedFeature;
	public static volatile SingularAttribute<SourceEndImpl, String> qualifiedName;
	public static volatile ListAttribute<SourceEndImpl, Documentation> documentation;
	public static volatile ListAttribute<SourceEndImpl, Feature> endFeature;
	public static volatile ListAttribute<SourceEndImpl, Feature> directedFeature;
	public static volatile SingularAttribute<SourceEndImpl, Boolean> isEnd;
	public static volatile ListAttribute<SourceEndImpl, Type> featuringType;
	public static volatile ListAttribute<SourceEndImpl, Feature> input;
	public static volatile SingularAttribute<SourceEndImpl, Boolean> isComposite;
	public static volatile SingularAttribute<SourceEndImpl, String> name;
	public static volatile SingularAttribute<SourceEndImpl, String> shortName;
	public static volatile ListAttribute<SourceEndImpl, Element> ownedMember;
	public static volatile ListAttribute<SourceEndImpl, Membership> ownedMembership;
	public static volatile CollectionAttribute<SourceEndImpl, Disjoining> ownedDisjoining;
	public static volatile ListAttribute<SourceEndImpl, Membership> membership;
	public static volatile SingularAttribute<SourceEndImpl, Boolean> isPortion;
	public static volatile SingularAttribute<SourceEndImpl, Boolean> isNonunique;
	public static volatile ListAttribute<SourceEndImpl, FeatureChaining> ownedFeatureChaining;
	public static volatile SingularAttribute<SourceEndImpl, Boolean> isReadOnly;
	public static volatile ListAttribute<SourceEndImpl, FeatureTyping> ownedTyping;
	public static volatile ListAttribute<SourceEndImpl, Feature> feature;
	public static volatile ListAttribute<SourceEndImpl, Membership> inheritedMembership;
	public static volatile ListAttribute<SourceEndImpl, Element> member;
	public static volatile ListAttribute<SourceEndImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<SourceEndImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile ListAttribute<SourceEndImpl, Feature> inheritedFeature;
	public static volatile SingularAttribute<SourceEndImpl, String> effectiveName;
	public static volatile SingularAttribute<SourceEndImpl, FeatureDirectionKind> direction;
	public static volatile ListAttribute<SourceEndImpl, Membership> importedMembership;
	public static volatile ListAttribute<SourceEndImpl, Element> ownedElement;
	public static volatile ListAttribute<SourceEndImpl, String> aliasIds;
	public static volatile ListAttribute<SourceEndImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<SourceEndImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<SourceEndImpl, Import> ownedImport;
	public static volatile SingularAttribute<SourceEndImpl, Boolean> isAbstract;
	public static volatile ListAttribute<SourceEndImpl, Specialization> ownedSpecialization;

	public static final String CHAINING_FEATURE = "chainingFeature";
	public static final String OWNED_TYPE_FEATURING = "ownedTypeFeaturing";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String TYPE = "type";
	public static final String OUTPUT = "output";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String ELEMENT_ID = "elementId";
	public static final String TEXTUAL_REPRESENTATION = "textualRepresentation";
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
	public static final String SHORT_NAME = "shortName";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
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
	public static final String ALIAS_IDS = "aliasIds";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String OWNED_SPECIALIZATION = "ownedSpecialization";

}

