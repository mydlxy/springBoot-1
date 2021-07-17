package cn.abel.bean;

/**
 * 这是一个user类的无用注释
 *
 */
public class News {
    /*id 身份证*/
    private Integer id;
    /*头衔*/
    private String title;
    /*职位内容*/
    private String content;
    /*图片路径*/
    private String imagePath;
    /*数量总和之类的*/
    private Integer readSum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public Integer getReadSum() {
        return readSum;
    }

    public void setReadSum(Integer readSum) {
        this.readSum = readSum;
    }
}