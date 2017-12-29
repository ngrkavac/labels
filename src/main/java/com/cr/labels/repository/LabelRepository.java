package com.cr.labels.repository;
import com.cr.labels.domain.Label;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

@RooJpaRepository(entity = Label.class)
public interface LabelRepository {
}
