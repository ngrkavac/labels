package com.cr.labels.repository;

import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.cr.labels.domain.Label;
import com.cr.labels.domain.QLabel;
import com.mysema.query.jpa.JPQLQuery;

@RooJpaRepositoryCustomImpl(repository = LabelRepositoryCustom.class)
public class LabelRepositoryImpl extends QueryDslRepositorySupport{

    LabelRepositoryImpl() {
        super(Label.class);
    }
    
    private JPQLQuery getQueryFrom(QLabel qEntity){
        return from(qEntity);
    }
}