package com.cr.labels.repository;
import com.cr.labels.domain.Attachment;
import org.springframework.roo.addon.layers.repository.jpa.annotations.RooJpaRepository;

@RooJpaRepository(entity = Attachment.class)
public interface AttachmentRepository {
}
