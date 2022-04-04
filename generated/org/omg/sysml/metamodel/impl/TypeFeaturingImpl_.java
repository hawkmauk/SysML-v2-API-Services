package org.omg.sysml.metamodel.impl;

import java.util.UUID;
import javax.annotation.processing.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import org.omg.sysml.metamodel.Annotation;
import org.omg.sysml.metamodel.Documentation;
import org.omg.sysml.metamodel.Element;
import org.omg.sysml.metamodel.Relationship;
import org.omg.sysml.metamodel.TextualRepresentation;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(TypeFeaturingImpl.class)
public abstract class TypeFeaturingImpl_ extends org.omg.sysml.lifecycle.impl.DataImpl_ {

	public static volatile ListAttribute<TypeFeaturingImpl, TextualRepresentation> textualRepresentation;
	public static volatile SingularAttribute<TypeFeaturingImpl, UUID> identifier;
	public static volatile ListAttribute<TypeFeaturingImpl, Annotation> ownedAnnotation;
	public static volatile ListAttribute<TypeFeaturingImpl, Element> ownedElement;
	public static volatile ListAttribute<TypeFeaturingImpl, Relationship> ownedRelationship;
	public static volatile SingularAttribute<TypeFeaturingImpl, String> qualifiedName;
	public static volatile ListAttribute<TypeFeaturingImpl, Documentation> documentation;
	public static volatile ListAttribute<TypeFeaturingImpl, Element> ownedRelatedElement;
	public static volatile ListAttribute<TypeFeaturingImpl, Element> source;
	public static volatile ListAttribute<TypeFeaturingImpl, Element> target;
	public static volatile SingularAttribute<TypeFeaturingImpl, String> humanId;
	public static volatile ListAttribute<TypeFeaturingImpl, String> aliasId;
	public static volatile ListAttribute<TypeFeaturingImpl, Element> relatedElement;
	public static volatile SingularAttribute<TypeFeaturingImpl, String> name;
	public static volatile SingularAttribute<TypeFeaturingImpl, String> effectiveName;

	public static final String TEXTUAL_REPRESENTATION = "textualRepresentation";
	public static final String IDENTIFIER = "identifier";
	public static final String OWNED_ANNOTATION = "ownedAnnotation";
	public static final String OWNED_ELEMENT = "ownedElement";
	public static final String OWNED_RELATIONSHIP = "ownedRelationship";
	public static final String QUALIFIED_NAME = "qualifiedName";
	public static final String DOCUMENTATION = "documentation";
	public static final String OWNED_RELATED_ELEMENT = "ownedRelatedElement";
	public static final String SOURCE = "source";
	public static final String TARGET = "target";
	public static final String HUMAN_ID = "humanId";
	public static final String ALIAS_ID = "aliasId";
	public static final String RELATED_ELEMENT = "relatedElement";
	public static final String NAME = "name";
	public static final String EFFECTIVE_NAME = "effectiveName";

}

