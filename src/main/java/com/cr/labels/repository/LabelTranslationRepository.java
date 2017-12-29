package com.cr.labels.repository;
import com.cr.labels.domain.LabelTranslation;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

@RooJpaRepository(entity = LabelTranslation.class)
public interface LabelTranslationRepository {
}
