/*
 * SysML v2 REST/HTTP Pilot Implementation
 * Copyright (C) 2020 InterCAX LLC
 * Copyright (C) 2020 California Institute of Technology ("Caltech")
 * Copyright (C) 2021-2022 Twingineer LLC
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 */

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

// import info.archinnov.achilles.annotations.UDT;

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

import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.HashSet;

@Entity(name = "UnioningImpl")
@SecondaryTable(name = "Unioning")
@org.hibernate.annotations.Table(appliesTo = "Unioning", fetch = FetchMode.SELECT, optional = false)
// @info.archinnov.achilles.annotations.Table(table = "Unioning")
@DiscriminatorValue(value = "Unioning")
@JsonTypeName(value = "Unioning")
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME)
public class UnioningImpl extends SysMLTypeImpl implements Unioning {
    // @info.archinnov.achilles.annotations.Column("aliasIds")
    private List<String> aliasIds;

    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    @ElementCollection(targetClass = String.class)
    @CollectionTable(name = "Unioning_aliasIds",
            joinColumns = @JoinColumn(name = "Unioning_id"))
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



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("documentation")
    private List<Documentation> documentation;

    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "DocumentationMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Unioning_documentation",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "attribute_id"))
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



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("effectiveName")
    private String effectiveName;

    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    // @javax.persistence.Transient
    @javax.persistence.Column(name = "effectiveName", table = "Unioning")
    public String getEffectiveName() {
        return effectiveName;
    }

    @JsonSetter
    public void setEffectiveName(String effectiveName) {
        this.effectiveName = effectiveName;
    }



    // @info.archinnov.achilles.annotations.Column("elementId")
    private java.util.UUID elementId;

    @JsonGetter
    @javax.persistence.Column(name = "elementId", table = "Unioning")
    public java.util.UUID getElementId() {
        return elementId;
    }

    @JsonSetter
    public void setElementId(java.util.UUID elementId) {
        this.elementId = elementId;
    }



    // @info.archinnov.achilles.annotations.Column("isImplied")
    private Boolean isImplied;

    @JsonGetter
    @javax.persistence.Column(name = "isImplied", table = "Unioning")
    public Boolean getIsImplied() {
        return isImplied;
    }

    @JsonSetter
    public void setIsImplied(Boolean isImplied) {
        this.isImplied = isImplied;
    }



    // @info.archinnov.achilles.annotations.Column("isImpliedIncluded")
    private Boolean isImpliedIncluded;

    @JsonGetter
    @javax.persistence.Column(name = "isImpliedIncluded", table = "Unioning")
    public Boolean getIsImpliedIncluded() {
        return isImpliedIncluded;
    }

    @JsonSetter
    public void setIsImpliedIncluded(Boolean isImpliedIncluded) {
        this.isImpliedIncluded = isImpliedIncluded;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("isLibraryElement")
    private Boolean isLibraryElement;

    @JsonGetter
    // @javax.persistence.Transient
    @javax.persistence.Column(name = "isLibraryElement", table = "Unioning")
    public Boolean getIsLibraryElement() {
        return isLibraryElement;
    }

    @JsonSetter
    public void setIsLibraryElement(Boolean isLibraryElement) {
        this.isLibraryElement = isLibraryElement;
    }



    // @info.archinnov.achilles.annotations.Column("name")
    private String name;

    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    @javax.persistence.Column(name = "name", table = "Unioning")
    public String getName() {
        return name;
    }

    @JsonSetter
    public void setName(String name) {
        this.name = name;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("ownedAnnotation")
    private List<Annotation> ownedAnnotation;

    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "AnnotationMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Unioning_ownedAnnotation",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "attribute_id"))
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



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("ownedElement")
    private List<Element> ownedElement;

    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Unioning_ownedElement",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "attribute_id"))
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



    // @info.archinnov.achilles.annotations.Column("ownedRelatedElement")
    private List<Element> ownedRelatedElement;

    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Unioning_ownedRelatedElement",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "attribute_id"))
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



    // @info.archinnov.achilles.annotations.Column("ownedRelationship")
    private List<Relationship> ownedRelationship;

    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    @ManyToAny(metaDef = "RelationshipMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Unioning_ownedRelationship",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "attribute_id"))
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



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("owner")
    private Element owner;

    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "owner_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id", table = "Unioning")
    public Element getOwner() {
        return owner;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = ElementImpl.class)
    public void setOwner(Element owner) {
        this.owner = owner;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("owningMembership")
    private OwningMembership owningMembership;

    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "OwningMembershipMetaDef", metaColumn = @javax.persistence.Column(name = "owningMembership_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningMembership_id", table = "Unioning")
    public OwningMembership getOwningMembership() {
        return owningMembership;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = OwningMembershipImpl.class)
    public void setOwningMembership(OwningMembership owningMembership) {
        this.owningMembership = owningMembership;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("owningNamespace")
    private Namespace owningNamespace;

    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "NamespaceMetaDef", metaColumn = @javax.persistence.Column(name = "owningNamespace_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningNamespace_id", table = "Unioning")
    public Namespace getOwningNamespace() {
        return owningNamespace;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = NamespaceImpl.class)
    public void setOwningNamespace(Namespace owningNamespace) {
        this.owningNamespace = owningNamespace;
    }



    // @info.archinnov.achilles.annotations.Column("owningRelatedElement")
    private Element owningRelatedElement;

    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    @Any(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "owningRelatedElement_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningRelatedElement_id", table = "Unioning")
    public Element getOwningRelatedElement() {
        return owningRelatedElement;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = ElementImpl.class)
    public void setOwningRelatedElement(Element owningRelatedElement) {
        this.owningRelatedElement = owningRelatedElement;
    }



    // @info.archinnov.achilles.annotations.Column("owningRelationship")
    private Relationship owningRelationship;

    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    @Any(metaDef = "RelationshipMetaDef", metaColumn = @javax.persistence.Column(name = "owningRelationship_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "owningRelationship_id", table = "Unioning")
    public Relationship getOwningRelationship() {
        return owningRelationship;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = RelationshipImpl.class)
    public void setOwningRelationship(Relationship owningRelationship) {
        this.owningRelationship = owningRelationship;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("qualifiedName")
    private String qualifiedName;

    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    // @javax.persistence.Transient
    @javax.persistence.Column(name = "qualifiedName", table = "Unioning")
    public String getQualifiedName() {
        return qualifiedName;
    }

    @JsonSetter
    public void setQualifiedName(String qualifiedName) {
        this.qualifiedName = qualifiedName;
    }



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("relatedElement")
    private List<Element> relatedElement;

    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Unioning_relatedElement",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "attribute_id"))
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



    // @info.archinnov.achilles.annotations.Column("shortName")
    private String shortName;

    @JsonGetter
    @Lob
    @org.hibernate.annotations.Type(type = "org.hibernate.type.TextType")
    @javax.persistence.Column(name = "shortName", table = "Unioning")
    public String getShortName() {
        return shortName;
    }

    @JsonSetter
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }



    // @info.archinnov.achilles.annotations.Column("source")
    private List<Element> source;

    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Unioning_source",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "attribute_id"))
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



    // @info.archinnov.achilles.annotations.Column("target")
    private List<Element> target;

    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    @ManyToAny(metaDef = "ElementMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Unioning_target",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "attribute_id"))
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



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("textualRepresentation")
    private List<TextualRepresentation> textualRepresentation;

    @JsonGetter
    @JsonSerialize(contentUsing = DataSerializer.class)
    // @javax.persistence.Transient
    @ManyToAny(metaDef = "TextualRepresentationMetaDef", metaColumn = @javax.persistence.Column(name = "attribute_type"), fetch = FetchType.LAZY)
    @JoinTable(name = "Unioning_textualRepresentation",
            joinColumns = @JoinColumn(name = "class_id"),
            inverseJoinColumns = @JoinColumn(name = "attribute_id"))
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



    // @info.archinnov.achilles.annotations.Transient
    // @info.archinnov.achilles.annotations.Column("typeUnioned")
    private Type typeUnioned;

    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    // @javax.persistence.Transient
    @Any(metaDef = "TypeMetaDef", metaColumn = @javax.persistence.Column(name = "typeUnioned_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "typeUnioned_id", table = "Unioning")
    public Type getTypeUnioned() {
        return typeUnioned;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = TypeImpl.class)
    public void setTypeUnioned(Type typeUnioned) {
        this.typeUnioned = typeUnioned;
    }



    // @info.archinnov.achilles.annotations.Column("unioningType")
    private Type unioningType;

    @JsonGetter
    @JsonSerialize(using = DataSerializer.class)
    @Any(metaDef = "TypeMetaDef", metaColumn = @javax.persistence.Column(name = "unioningType_type"), fetch = FetchType.LAZY)
    @JoinColumn(name = "unioningType_id", table = "Unioning")
    public Type getUnioningType() {
        return unioningType;
    }

    @JsonSetter
    @JsonDeserialize(using = DataDeserializer.class, as = TypeImpl.class)
    public void setUnioningType(Type unioningType) {
        this.unioningType = unioningType;
    }



}