package com.cr.labels.repository;

import org.springframework.data.jpa.repository.support.QueryDslRepositorySupport;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustomImpl;
import com.cr.labels.domain.Attachment;
import com.cr.labels.domain.QAttachment;
import com.mysema.query.jpa.JPQLQuery;

@RooJpaRepositoryCustomImpl(repository = AttachmentRepositoryCustom.class)
public class AttachmentRepositoryImpl extends QueryDslRepositorySupport{

    AttachmentRepositoryImpl() {
        super(Attachment.class);
    }
    
    private JPQLQuery getQueryFrom(QAttachment qEntity){
        return from(qEntity);
    }
}