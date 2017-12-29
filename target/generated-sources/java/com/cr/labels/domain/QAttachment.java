package com.cr.labels.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAttachment is a Querydsl query type for Attachment
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAttachment extends EntityPathBase<Attachment> {

    private static final long serialVersionUID = 1531841072L;

    public static final QAttachment attachment = new QAttachment("attachment");

    public final StringPath createdBy = createString("createdBy");

    public final ArrayPath<byte[], Byte> file = createArray("file", byte[].class);

    public final StringPath fileName = createString("fileName");

    public QAttachment(String variable) {
        super(Attachment.class, forVariable(variable));
    }

    public QAttachment(Path<? extends Attachment> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAttachment(PathMetadata<?> metadata) {
        super(Attachment.class, metadata);
    }

}

