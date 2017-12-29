package com.cr.labels.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QLabelTranslation is a Querydsl query type for LabelTranslation
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLabelTranslation extends EntityPathBase<LabelTranslation> {

    private static final long serialVersionUID = -1855328662L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QLabelTranslation labelTranslation = new QLabelTranslation("labelTranslation");

    public final QLabel label;

    public final StringPath translationLanguage = createString("translationLanguage");

    public QLabelTranslation(String variable) {
        this(LabelTranslation.class, forVariable(variable), INITS);
    }

    public QLabelTranslation(Path<? extends LabelTranslation> path) {
        this(path.getType(), path.getMetadata(), path.getMetadata().isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLabelTranslation(PathMetadata<?> metadata) {
        this(metadata, metadata.isRoot() ? INITS : PathInits.DEFAULT);
    }

    public QLabelTranslation(PathMetadata<?> metadata, PathInits inits) {
        this(LabelTranslation.class, metadata, inits);
    }

    public QLabelTranslation(Class<? extends LabelTranslation> type, PathMetadata<?> metadata, PathInits inits) {
        super(type, metadata, inits);
        this.label = inits.isInitialized("label") ? new QLabel(forProperty("label")) : null;
    }

}

