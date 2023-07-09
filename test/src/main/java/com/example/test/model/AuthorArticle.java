package com.example.test.model;


import jakarta.persistence.*;
import lombok.*;
import com.example.test.model.id.AuthorArticleId;

@Entity
@Table(name = "author_article")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuthorArticle {
    @EmbeddedId
    private AuthorArticleId id;
    @ManyToOne
    @MapsId("authorId")
    @JoinColumn(
            name = "author_id",
            referencedColumnName = "id"
    )
    private Author author;
    @ManyToOne
    @MapsId("authorId")
    @JoinColumn(
            name = "article_id",
            referencedColumnName = "id"
    )
    private Article article;
    @ManyToOne
    @JoinColumn(
            name = "author_type_id",
            referencedColumnName = "id"
    )
    private AuthorType authorType;
}
