// WARNING: DO NOT EDIT THIS FILE. THIS FILE IS MANAGED BY SPRING ROO.
// You may push code into the target .java compilation unit if you wish to edit any member(s).

package com.cr.labels.repository;

import com.cr.labels.domain.Label;
import com.cr.labels.domain.QLabel;
import com.cr.labels.repository.GlobalSearch;
import com.cr.labels.repository.LabelRepositoryCustom;
import com.cr.labels.repository.LabelRepositoryImpl;
import com.mysema.query.BooleanBuilder;
import com.mysema.query.jpa.JPQLQuery;
import com.mysema.query.types.Order;
import com.mysema.query.types.OrderSpecifier;
import com.mysema.query.types.path.NumberPath;
import java.util.List;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.transaction.annotation.Transactional;

privileged aspect LabelRepositoryImpl_Roo_Jpa_Repository_Impl {
    
    declare parents: LabelRepositoryImpl implements LabelRepositoryCustom;
    
    declare @type: LabelRepositoryImpl: @Transactional(readOnly = true);
    
    public Page<Label> LabelRepositoryImpl.findAll(GlobalSearch globalSearch, Pageable pageable) {
        NumberPath<Long> idLabel = new NumberPath<Long>(Long.class, "id");
        QLabel label = QLabel.label;
        JPQLQuery query = getQueryFrom(label);
        BooleanBuilder where = new BooleanBuilder();

        if (globalSearch != null) {
            String txt = globalSearch.getText();
            where.and(
                label.labelKey.containsIgnoreCase(txt)
                .or(label.labelValue.containsIgnoreCase(txt))
            );

        }
        query.where(where);

        long totalFound = query.count();
        if (pageable != null) {
            if (pageable.getSort() != null) {
                for (Sort.Order order : pageable.getSort()) {
                    Order direction = order.isAscending() ? Order.ASC : Order.DESC;

                    switch(order.getProperty()){
                        case "labelKey":
                           query.orderBy(new OrderSpecifier<String>(direction, label.labelKey));
                           break;
                        case "labelValue":
                           query.orderBy(new OrderSpecifier<String>(direction, label.labelValue));
                           break;
                    }
                }
            }
            query.offset(pageable.getOffset()).limit(pageable.getPageSize());
        }
        query.orderBy(idLabel.asc());
        
        List<Label> results = query.list(label);
        return new PageImpl<Label>(results, pageable, totalFound);
    }
    
}
