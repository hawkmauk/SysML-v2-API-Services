package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.ActionUsage;
import org.omg.sysml.metamodel.Class;
import org.omg.sysml.metamodel.ConstraintUsage;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Feature;
import org.omg.sysml.metamodel.FeatureMembership;
import org.omg.sysml.metamodel.FeatureTyping;
import org.omg.sysml.metamodel.Generalization;
import org.omg.sysml.metamodel.Import;
import org.omg.sysml.metamodel.Membership;
import org.omg.sysml.metamodel.PortUsage;
import org.omg.sysml.metamodel.Property;
import org.omg.sysml.metamodel.Redefinition;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.RequirementUsage;
import org.omg.sysml.metamodel.StateUsage;
import org.omg.sysml.metamodel.Subsetting;
import org.omg.sysml.metamodel.TransitionUsage;
import org.omg.sysml.metamodel.Type;
import org.omg.sysml.metamodel.Usage;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(SnapshotFeatureImpl.class)
public abstract class SnapshotFeatureImpl_ extends org.omg.sysml.metamodel.impl.MofObjectImpl_ {

	public static volatile ListAttribute<SnapshotFeatureImpl, Generalization> ownedGeneralization;
	public static volatile SingularAttribute<SnapshotFeatureImpl, Boolean> isConjugated;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Usage> nestedUsage;
	public static volatile SingularAttribute<SnapshotFeatureImpl, Boolean> isUnique;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Subsetting> ownedSubsetting;
	public static volatile ListAttribute<SnapshotFeatureImpl, Membership> membership;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Type> type;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, RequirementUsage> nestedRequirement;
	public static volatile SingularAttribute<SnapshotFeatureImpl, Boolean> isNonunique;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Feature> output;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, PortUsage> nestedPort;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, TransitionUsage> nestedTransition;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Feature> feature;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, ConstraintUsage> nestedConstraint;
	public static volatile ListAttribute<SnapshotFeatureImpl, Membership> inheritedMembership;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Property> property;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Feature> ownedEndFeature;
	public static volatile ListAttribute<SnapshotFeatureImpl, Element> member;
	public static volatile ListAttribute<SnapshotFeatureImpl, FeatureMembership> ownedFeatureMembership;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Class> block;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Feature> inheritedFeature;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, StateUsage> nestedState;
	public static volatile SingularAttribute<SnapshotFeatureImpl, Boolean> isSufficient;
	public static volatile SingularAttribute<SnapshotFeatureImpl, Boolean> isOrdered;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Redefinition> ownedRedefinition;
	public static volatile ListAttribute<SnapshotFeatureImpl, Membership> importedMembership;
	public static volatile SingularAttribute<SnapshotFeatureImpl, UUID> identifier;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Element> ownedElement;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, ActionUsage> nestedAction;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Property> nestedProperty;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Feature> ownedFeature;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Relationship> ownedRelationship;
	public static volatile ListAttribute<SnapshotFeatureImpl, FeatureMembership> featureMembership;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Feature> endFeature;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Type> referencedType;
	public static volatile ListAttribute<SnapshotFeatureImpl, Import> ownedImport;
	public static volatile SingularAttribute<SnapshotFeatureImpl, Boolean> isEnd;
	public static volatile SingularAttribute<SnapshotFeatureImpl, Boolean> isAbstract;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Feature> input;
	public static volatile SingularAttribute<SnapshotFeatureImpl, Boolean> isComposite;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, Type> ownedType;
	public static volatile CollectionAttribute<SnapshotFeatureImpl, FeatureTyping> typing;
	public static volatile SingularAttribute<SnapshotFeatureImpl, String> name;
	public static volatile ListAttribute<SnapshotFeatureImpl, Element> ownedMember;
	public static volatile ListAttribute<SnapshotFeatureImpl, Membership> ownedMembership;

	public static final String OWNED_GENERALIZATION = "ownedGeneralization";
	public static final String IS_CONJUGATED = "isConjugated";
	public static final String NESTED_USAGE = "nestedUsage";
	public static final String IS_UNIQUE = "isUnique";
	public static final String OWNED_SUBSETTING = "ownedSubsetting";
	public static final String MEMBERSHIP = "membership";
	public static final String TYPE = "type";
	public static final String NESTED_REQUIREMENT = "nestedRequirement";
	public static final String IS_NONUNIQUE = "isNonunique";
	public static final String OUTPUT = "output";
	public static final String NESTED_PORT = "nestedPort";
	public static final String NESTED_TRANSITION = "nestedTransition";
	public static final String FEATURE = "feature";
	public static final String NESTED_CONSTRAINT = "nestedConstraint";
	public static final String INHERITED_MEMBERSHIP = "inheritedMembership";
	public static final String PROPERTY = "property";
	public static final String OWNED_END_FEATURE = "ownedEndFeature";
	public static final String MEMBER = "member";
	public static final String OWNED_FEATURE_MEMBERSHIP = "ownedFeatureMembership";
	public static final String BLOCK = "block";
	public static final String INHERITED_FEATURE = "inheritedFeature";
	public static final String NESTED_STATE = "nestedState";
	public static final String IS_SUFFICIENT = "isSufficient";
	public static final String IS_ORDERED = "isOrdered";
	public static final String OWNED_REDEFINITION = "ownedRedefinition";
	public static final String IMPORTED_MEMBERSHIP = "importedMembership";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String NESTED_ACTION = "nestedAction";
	public static final String NESTED_PROPERTY = "nestedProperty";
	public static final String OWNED_FEATURE = "ownedFeature";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String FEATURE_MEMBERSHIP = "featureMembership";
	public static final String END_FEATURE = "endFeature";
	public static final String REFERENCED_TYPE = "referencedType";
	public static final String OWNED_IMPORT = "ownedImport";
	public static final String IS_END = "isEnd";
	public static final String IS_ABSTRACT = "isAbstract";
	public static final String INPUT = "input";
	public static final String IS_COMPOSITE = "isComposite";
	public static final String OWNED_TYPE = "ownedType";
	public static final String TYPING = "typing";
	public static final String NAME = "name";
	public static final String OWNED_MEMBER = "ownedMember";
	public static final String OWNED_MEMBERSHIP = "ownedMembership";

}
