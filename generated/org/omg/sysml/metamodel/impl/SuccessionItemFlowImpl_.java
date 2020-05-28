package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Association;
import org.omg.sysml.metamodel.Behavior;
import org.omg.sysml.metamodel.Classifier;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Expression;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.ItemFeature;
import org.omg.sysml.metamodel.ItemFlowEnd;
import org.omg.sysml.metamodel.ItemFlowFeature;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.Parameter;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.Step;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.Type;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SuccessionItemFlowImpl.class)
public abstract class SuccessionItemFlowImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<SuccessionItemFlowImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isConjugated;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Subsetting> ownedSubsetting;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Element> source;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Type> type;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Feature> output;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Feature> sourceOutputFeature;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Expression> guardExpression;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isSufficient;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Redefinition> ownedRedefinition;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, UUID> identifier;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Feature> endFeature;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Association> ownedAssociationType;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Type> referencedType;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, ItemFeature> itemFeature;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isEnd;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Feature> input;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Feature> targetInputFeature;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Element> relatedElement;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Type> ownedType;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Step> effectStep;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, String> name;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, FeatureTyping> typing;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Feature> connectorEnd;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, ItemFlowEnd> itemFlowEnd;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Element> ownedMember;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Membership> ownedMembership;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Classifier> itemType;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Association> association;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Membership> membership;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Element> ownedRelatedElement;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Step> triggerStep;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Feature> feature;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Parameter> parameter;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Element> member;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<SuccessionItemFlowImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Behavior> behavior;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, ItemFlowFeature> itemFlowFeature;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Membership> importedMembership;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Element> ownedElement;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<SuccessionItemFlowImpl, FeatureMembership> featureMembership;
	public static volatile ListAttribute<SuccessionItemFlowImpl, Import> ownedImport;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Feature> relatedFeature;
	public static volatile CollectionAttribute<SuccessionItemFlowImpl, Element> target;
	public static volatile SingularAttribute<SuccessionItemFlowImpl, Boolean> isDirected;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String SOURCE = "source";
	public static final String TYPE = "type";
	public static final String OUTPUT = "output";
	public static final String SOURCE_OUTPUT_FEATURE = "sourceOutputFeature";
	public static final String GUARD_EXPRESSION = "guardExpression";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String END_FEATURE = "endFeature";
	public static final String OWNED_ASSOCIATION_TYPE = "ownedAssociationType";
	public static final String REFERENCED_TYPE = "referencedType";
	public static final String ITEM_FEATURE = "itemFeature";
	public static final String IS_END = "isEnd";
	public static final String INPUT = "input";
	public static final String TARGET_INPUT_FEATURE = "targetInputFeature";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String OWNED_TYPE = "ownedType";
	public static final String EFFECT_STEP = "effectStep";
	public static final String NAME = "name";
	public static final String TYPING = "typing";
	public static final String CONNECTOR_END = "connectorEnd";
	public static final String ITEM_FLOW_END = "itemFlowEnd";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";
	public static final String ITEM_TYPE = "itemType";
	public static final String ASSOCIATION = "association";
	public static final String MEMBERSHIP = "membership";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String TRIGGER_STEP = "triggerStep";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String FEATURE = "feature";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PARAMETER = "parameter";
	public static final String MEMBER = "member";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String BEHAVIOR = "behavior";
	public static final String ITEM_FLOW_FEATURE = "itemFlowFeature";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String RELATED_FEATURE = "relatedFeature";
	public static final String TARGET = "target";
	public static final String IS_DIRECTED = "isDirected";

}

