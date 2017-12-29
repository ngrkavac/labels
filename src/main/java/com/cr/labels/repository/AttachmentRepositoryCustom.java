package com.cr.labels.repository;
import com.cr.labels.domain.Attachment;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepositoryCustom;

@RooJpaRepositoryCustom(entity = Attachment.class, defaultSearchResult = Attachment.class)
public interface AttachmentRepositoryCustom {
}
