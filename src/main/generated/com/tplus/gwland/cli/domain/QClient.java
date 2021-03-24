package com.tplus.gwland.cli.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QClient is a Querydsl query type for Client
 */
@Generated("com.querydsl.codegen.EntitySerializer")
public class QClient extends EntityPathBase<Client> {

    private static final long serialVersionUID = -93229151L;

    public static final QClient client = new QClient("client");

    public final StringPath cliAge = createString("cliAge");

    public final StringPath cliGen = createString("cliGen");

    public final StringPath cliId = createString("cliId");

    public final StringPath cliMail = createString("cliMail");

    public final StringPath cliName = createString("cliName");

    public final NumberPath<Long> cliNum = createNumber("cliNum", Long.class);

    public final ListPath<com.tplus.gwland.rev.domain.Review, com.tplus.gwland.rev.domain.QReview> review = this.<com.tplus.gwland.rev.domain.Review, com.tplus.gwland.rev.domain.QReview>createList("review", com.tplus.gwland.rev.domain.Review.class, com.tplus.gwland.rev.domain.QReview.class, PathInits.DIRECT2);

    public final ListPath<com.tplus.gwland.svy.domain.Survey, com.tplus.gwland.svy.domain.QSurvey> survey = this.<com.tplus.gwland.svy.domain.Survey, com.tplus.gwland.svy.domain.QSurvey>createList("survey", com.tplus.gwland.svy.domain.Survey.class, com.tplus.gwland.svy.domain.QSurvey.class, PathInits.DIRECT2);

    public QClient(String variable) {
        super(Client.class, forVariable(variable));
    }

    public QClient(Path<? extends Client> path) {
        super(path.getType(), path.getMetadata());
    }

    public QClient(PathMetadata metadata) {
        super(Client.class, metadata);
    }

}

