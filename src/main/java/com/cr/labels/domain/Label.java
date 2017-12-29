package com.cr.labels.domain;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;

@RooJavaBean
@RooToString
@RooJpaEntity
public class Label {

    /**
     */
    private String labelKey;

    /**
     */
    private String labelValue;

    /**
     */
    @JsonIgnore
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "label")
    private Set<LabelTranslation> translations = new HashSet<LabelTranslation>();
}
