package com.cr.labels.repository;

import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.cr.labels.domain.LabelTranslation;
import com.cr.labels.domain.QLabelTranslation;
import com.mysema.query.jpa.JPQLQuery;

@RooJpaRepositoryCustomImpl(repository = LabelTranslationRepositoryCustom.class)
public class LabelTranslationRepositoryImpl extends QueryDslRepositorySupport{

    LabelTranslationRepositoryImpl() {
        super(LabelTranslation.class);
    }
    
    private JPQLQuery getQueryFrom(QLabelTranslation qEntity){
        return from(qEntity);
    }
}