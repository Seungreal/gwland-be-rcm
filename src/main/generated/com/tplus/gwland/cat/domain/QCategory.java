package com.tplus.gwland.cat.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCategory is a Querydsl query type for Category
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QCategory extends EntityPathBase<Category> {

    private static final long serialVersionUID = -172397046L;

    public static final QCategory category = new QCategory("category");

    public final StringPath areacode = createString("areacode");

    public final StringPath cat1 = createString("cat1");

    public final StringPath cat2 = createString("cat2");

    public final StringPath cat3 = createString("cat3");

    public final NumberPath<Long> catNum = createNumber("catNum", Long.class);

    public final StringPath contentid = createString("contentid");

    public final StringPath contenttypeid = createString("contenttypeid");

    public final ListPath<com.tplus.gwland.pce.domain.Place, com.tplus.gwland.pce.domain.QPlace> placeList = this.<com.tplus.gwland.pce.domain.Place, com.tplus.gwland.pce.domain.QPlace>createList("placeList", com.tplus.gwland.pce.domain.Place.class, com.tplus.gwland.pce.domain.QPlace.class, PathInits.DIRECT2);

    public QCategory(String variable) {
        super(Category.class, forVariable(variable));
    }

    public QCategory(Path<? extends Category> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCategory(PathMetadata metadata) {
        super(Category.class, metadata);
    }

}

