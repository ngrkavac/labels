package com.cr.labels.domain;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;
import com.mysema.query.types.path.PathInits;


/**
 * QLabel is a Querydsl query type for Label
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QLabel extends EntityPathBase<Label> {

    private static final long serialVersionUID = -1361602105L;

    public static final QLabel label = new QLabel("label");

    public final StringPath labelKey = createString("labelKey");

    public final StringPath labelValue = createString("labelValue");

    public final SetPath<LabelTranslation, QLabelTranslation> translations = this.<LabelTranslation, QLabelTranslation>createSet("translations", LabelTranslation.class, QLabelTranslation.class, PathInits.DIRECT2);

    public QLabel(String variable) {
        super(Label.class, forVariable(variable));
    }

    public QLabel(Path<? extends Label> path) {
        super(path.getType(), path.getMetadata());
    }

    public QLabel(PathMetadata<?> metadata) {
        super(Label.class, metadata);
    }

}

