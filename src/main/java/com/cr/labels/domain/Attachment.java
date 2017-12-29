package com.cr.labels.domain;
import org.springframework.roo.addon.javabean.annotations.RooJavaBean;
import org.springframework.roo.addon.javabean.annotations.RooToString;
import org.springframework.roo.addon.jpa.annotations.entity.RooJpaEntity;
import javax.persistence.Lob;
import org.springframework.roo.classpath.operations.jsr303.RooUploadedFile;

@RooJavaBean
@RooToString
@RooJpaEntity
public class Attachment {

    /**
     */
    private String fileName;

    /**
     */
    private String createdBy;

    /**
     */
    @RooUploadedFile(contentType = "application/zip")
    @Lob
    private byte[] file;
}
