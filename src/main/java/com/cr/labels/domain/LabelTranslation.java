package com.cr.labels.domain;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;

@RooJavaBean
@RooToString
@RooJpaEntity
public class LabelTranslation {

    /**
     */
    private String translationLanguage;
   
    @ManyToOne
    @JoinColumn(name="label_id", nullable=false)
    private Label label;
}
