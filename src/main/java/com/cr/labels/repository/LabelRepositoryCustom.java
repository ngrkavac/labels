package com.cr.labels.repository;
import com.cr.labels.domain.Label;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustom;

@RooJpaRepositoryCustom(entity = Label.class, defaultSearchResult = Label.class)
public interface LabelRepositoryCustom {
}
