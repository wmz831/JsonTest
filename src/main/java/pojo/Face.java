package pojo;

import java.util.Date;

/**
 * Create by Wang Mingzhen om 2018/7/24
 */
public class Face {

    private Integer id;
    private Long id64;
    private String name;
    private Long LDate;
    private Date uDate;
    private Vertice[] vertices;


    public Face(){}

    public Face(Integer id,Long id64,String name,Long LDate,Date uDate,Vertice[] vertices){
        this.id = id;
        this.id64 = id64;
        this.name = name;
        this.LDate = LDate;
        this.uDate = uDate;
        this.LDate = LDate;
        this.vertices = vertices;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getId64() {
        return id64;
    }

    public void setId64(Long id64) {
        this.id64 = id64;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getLDate() {
        return LDate;
    }

    public void setLDate(Long LDate) {
        this.LDate = LDate;
    }

    public Date getuDate() {
        return uDate;
    }

    public void setuDate(Date uDate) {
        this.uDate = uDate;
    }

    public Vertice[] getVertices() {
        return vertices;
    }

    public void setVertices(Vertice[] vertices) {
        this.vertices = vertices;
    }
}
