// THIS IS AN AUTOGENERATED FILE. DO NOT EDIT THIS FILE DIRECTLY.
package org.omg.sysml.metamodel.impl;

import org.omg.sysml.metamodel.*;
import org.omg.sysml.metamodel.Package;
import org.omg.sysml.metamodel.Class;

import jackson.DataSerializer;
import jackson.DataDeserializer;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import org.hibernate.annotations.Any;
import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.FetchMode;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.EnumType;
import javax.persistence.ElementCollection;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.FetchType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Table;
import javax.persistence.SecondaryTable;
import javax.persistence.CollectionTable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity(name = "AnnotationImpl")
@SecondaryTable(name = "Annotation")
@org.hibernate.annotations.Table(appliesTo = "Annotation", fetch = FetchMode.SELECT, optional = false)
@DiscriminatorValue(value = "Annotation")
@JsonTypeName(value = "Annotation")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
public class AnnotationImpl extends SysMLTypeImpl implements Annotation {

    private List<String> aliasIds;

    @Override
    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "Annotation_aliasIds", joinColumns = @JoinColumn(name = "Annotation_id"))
    public List<String> getAliasIds() {
        if (aliasIds == null) {
            aliasIds = new ArrayList<>();
        }
        return aliasIds;
    }

    @JsonSetter
    public void setAliasIds(List<String> aliasIds) {
        this.aliasIds = aliasIds;
    }

    private Element annotatedElement;

    @Override
    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    @Any(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "annotatedElement_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "annotatedElement_id", table = "Annotation")
    public Element getAnnotatedElement() {
        return annotatedElement;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = ElementImpl.class)
    public void setAnnotatedElement(Element annotatedElement) {
        this.annotatedElement = annotatedElement;
    }

    private AnnotatingElement annotatingElement;

    @Override
    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    @Any(metaDef = "AnnotatingElementMetaDef", metaColumn = @javax.persistence.Column(name = "annotatingElement_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "annotatingElement_id", table = "Annotation")
    public AnnotatingElement getAnnotatingElement() {
        return annotatingElement;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = AnnotatingElementImpl.class)
    public void setAnnotatingElement(AnnotatingElement annotatingElement) {
        this.annotatingElement = annotatingElement;
    }

    private String declaredName;

    @Override
    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    @javax.persistence.Column(name = "declaredName", table = "Annotation")
    public String getDeclaredName() {
        return declaredName;
    }

    @JsonSetter
    public void setDeclaredName(String declaredName) {
        this.declaredName = declaredName;
    }

    private String declaredShortName;

    @Override
    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    @javax.persistence.Column(name = "declaredShortName", table = "Annotation")
    public String getDeclaredShortName() {
        return declaredShortName;
    }

    @JsonSetter
    public void setDeclaredShortName(String declaredShortName) {
        this.declaredShortName = declaredShortName;
    }

    private List<Documentation> documentation;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "DocumentationMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Annotation_documentation", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<Documentation> getDocumentation() {
        if (documentation == null) {
            documentation = new ArrayList<>();
        }
        return documentation;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = DocumentationImpl.class)
    public void setDocumentation(List<Documentation> documentation) {
        this.documentation = documentation;
    }

    private java.util.UUID elementId;

    @Override
    @JsonGetter
    @javax.persistence.Column(name = "elementId", table = "Annotation")
    public java.util.UUID getElementId() {
        return elementId;
    }

    @JsonSetter
    public void setElementId(java.util.UUID elementId) {
        this.elementId = elementId;
    }

    private Boolean isImplied;

    @Override
    @JsonGetter
    @javax.persistence.Column(name = "isImplied", table = "Annotation")
    public Boolean getIsImplied() {
        return isImplied;
    }

    @JsonSetter
    public void setIsImplied(Boolean isImplied) {
        this.isImplied = isImplied;
    }

    private Boolean isImpliedIncluded;

    @Override
    @JsonGetter
    @javax.persistence.Column(name = "isImpliedIncluded", table = "Annotation")
    public Boolean getIsImpliedIncluded() {
        return isImpliedIncluded;
    }

    @JsonSetter
    public void setIsImpliedIncluded(Boolean isImpliedIncluded) {
        this.isImpliedIncluded = isImpliedIncluded;
    }

    private Boolean isLibraryElement;

    @Override
    @JsonGetter
    // @javax.persistence.Transient
    @javax.persistence.Column(name = "isLibraryElement", table = "Annotation")
    public Boolean getIsLibraryElement() {
        return isLibraryElement;
    }

    @JsonSetter
    public void setIsLibraryElement(Boolean isLibraryElement) {
        this.isLibraryElement = isLibraryElement;
    }

    private String name;

    @Override
    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    // @javax.persistence.Transient
    @javax.persistence.Column(name = "name", table = "Annotation")
    public String getName() {
        return name;
    }

    @JsonSetter
    public void setName(String name) {
        this.name = name;
    }

    private List<Annotation> ownedAnnotation;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "AnnotationMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Annotation_ownedAnnotation", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<Annotation> getOwnedAnnotation() {
        if (ownedAnnotation == null) {
            ownedAnnotation = new ArrayList<>();
        }
        return ownedAnnotation;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = AnnotationImpl.class)
    public void setOwnedAnnotation(List<Annotation> ownedAnnotation) {
        this.ownedAnnotation = ownedAnnotation;
    }

    private List<Element> ownedElement;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Annotation_ownedElement", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<Element> getOwnedElement() {
        if (ownedElement == null) {
            ownedElement = new ArrayList<>();
        }
        return ownedElement;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = ElementImpl.class)
    public void setOwnedElement(List<Element> ownedElement) {
        this.ownedElement = ownedElement;
    }

    private List<Element> ownedRelatedElement;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Annotation_ownedRelatedElement", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<Element> getOwnedRelatedElement() {
        if (ownedRelatedElement == null) {
            ownedRelatedElement = new ArrayList<>();
        }
        return ownedRelatedElement;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = ElementImpl.class)
    public void setOwnedRelatedElement(List<Element> ownedRelatedElement) {
        this.ownedRelatedElement = ownedRelatedElement;
    }

    private List<Relationship> ownedRelationship;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    @ManyToAny(metaDef = "RelationshipMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Annotation_ownedRelationship", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<Relationship> getOwnedRelationship() {
        if (ownedRelationship == null) {
            ownedRelationship = new ArrayList<>();
        }
        return ownedRelationship;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = RelationshipImpl.class)
    public void setOwnedRelationship(List<Relationship> ownedRelationship) {
        this.ownedRelationship = ownedRelationship;
    }

    private Element owner;

    @Override
    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "owner_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", table = "Annotation")
    public Element getOwner() {
        return owner;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = ElementImpl.class)
    public void setOwner(Element owner) {
        this.owner = owner;
    }

    private Element owningAnnotatedElement;

    @Override
    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "owningAnnotatedElement_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningAnnotatedElement_id", table = "Annotation")
    public Element getOwningAnnotatedElement() {
        return owningAnnotatedElement;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = ElementImpl.class)
    public void setOwningAnnotatedElement(Element owningAnnotatedElement) {
        this.owningAnnotatedElement = owningAnnotatedElement;
    }

    private AnnotatingElement owningAnnotatingElement;

    @Override
    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "AnnotatingElementMetaDef", metaColumn = @javax.persistence.Column(name = "owningAnnotatingElement_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningAnnotatingElement_id", table = "Annotation")
    public AnnotatingElement getOwningAnnotatingElement() {
        return owningAnnotatingElement;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = AnnotatingElementImpl.class)
    public void setOwningAnnotatingElement(AnnotatingElement owningAnnotatingElement) {
        this.owningAnnotatingElement = owningAnnotatingElement;
    }

    private OwningMembership owningMembership;

    @Override
    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "OwningMembershipMetaDef", metaColumn = @javax.persistence.Column(name = "owningMembership_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningMembership_id", table = "Annotation")
    public OwningMembership getOwningMembership() {
        return owningMembership;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = OwningMembershipImpl.class)
    public void setOwningMembership(OwningMembership owningMembership) {
        this.owningMembership = owningMembership;
    }

    private Namespace owningNamespace;

    @Override
    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "NamespaceMetaDef", metaColumn = @javax.persistence.Column(name = "owningNamespace_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningNamespace_id", table = "Annotation")
    public Namespace getOwningNamespace() {
        return owningNamespace;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = NamespaceImpl.class)
    public void setOwningNamespace(Namespace owningNamespace) {
        this.owningNamespace = owningNamespace;
    }

    private Element owningRelatedElement;

    @Override
    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    @Any(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "owningRelatedElement_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningRelatedElement_id", table = "Annotation")
    public Element getOwningRelatedElement() {
        return owningRelatedElement;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = ElementImpl.class)
    public void setOwningRelatedElement(Element owningRelatedElement) {
        this.owningRelatedElement = owningRelatedElement;
    }

    private Relationship owningRelationship;

    @Override
    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    @Any(metaDef = "RelationshipMetaDef", metaColumn = @javax.persistence.Column(name = "owningRelationship_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningRelationship_id", table = "Annotation")
    public Relationship getOwningRelationship() {
        return owningRelationship;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = RelationshipImpl.class)
    public void setOwningRelationship(Relationship owningRelationship) {
        this.owningRelationship = owningRelationship;
    }

    private String qualifiedName;

    @Override
    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    // @javax.persistence.Transient
    @javax.persistence.Column(name = "qualifiedName", table = "Annotation")
    public String getQualifiedName() {
        return qualifiedName;
    }

    @JsonSetter
    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }

    private List<Element> relatedElement;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Annotation_relatedElement", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<Element> getRelatedElement() {
        if (relatedElement == null) {
            relatedElement = new ArrayList<>();
        }
        return relatedElement;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = ElementImpl.class)
    public void setRelatedElement(List<Element> relatedElement) {
        this.relatedElement = relatedElement;
    }

    private String shortName;

    @Override
    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    // @javax.persistence.Transient
    @javax.persistence.Column(name = "shortName", table = "Annotation")
    public String getShortName() {
        return shortName;
    }

    @JsonSetter
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    private List<Element> source;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Annotation_source", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<Element> getSource() {
        if (source == null) {
            source = new ArrayList<>();
        }
        return source;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = ElementImpl.class)
    public void setSource(List<Element> source) {
        this.source = source;
    }

    private List<Element> target;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Annotation_target", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<Element> getTarget() {
        if (target == null) {
            target = new ArrayList<>();
        }
        return target;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = ElementImpl.class)
    public void setTarget(List<Element> target) {
        this.target = target;
    }

    private List<TextualRepresentation> textualRepresentation;

    @Override
    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "TextualRepresentationMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Annotation_textualRepresentation", joinColumns = @JoinColumn(name = "class_id"), inverseJoinColumns = @JoinColumn(name = "attribute_id"))
    public List<TextualRepresentation> getTextualRepresentation() {
        if (textualRepresentation == null) {
            textualRepresentation = new ArrayList<>();
        }
        return textualRepresentation;
    }

    @JsonSetter
    @JsonDeserialize(contentUsing = DataDeserializer.class, contentAs = TextualRepresentationImpl.class)
    public void setTextualRepresentation(List<TextualRepresentation> textualRepresentation) {
        this.textualRepresentation = textualRepresentation;
    }
}