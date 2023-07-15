package web.novelPlatform.entity;


import lombok.Getter;
import lombok.Setter;
import web.novelPlatform.entity.Novel;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
public class Content {

    @Id
    @GeneratedValue
    @Column(name = "content_id")
    private Long id;
    private String title;

    @Column(length = 5000)
    private String contents;

    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "novel_id") // one의 외부에서 보여지는 id와 연결을 해줘야 한다.
    private Novel novel;

    @OneToMany(mappedBy = "content", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> commentList;

}
