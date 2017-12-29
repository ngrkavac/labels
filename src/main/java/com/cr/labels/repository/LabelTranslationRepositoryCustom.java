package com.cr.labels.repository;
import com.cr.labels.domain.LabelTranslation;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustom;

@RooJpaRepositoryCustom(entity = LabelTranslation.class, defaultSearchResult = LabelTranslation.class)
public interface LabelTranslationRepositoryCustom {
}
