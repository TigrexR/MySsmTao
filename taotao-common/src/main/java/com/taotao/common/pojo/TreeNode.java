package com.taotao.common.pojo;

/**
 * Created by Linus on 2018/4/8.
 * @author Linus
 */
public class TreeNode {
    private long id;
    private String text;
    private String state;

    public TreeNode(long id, String text, String state){
        this.id = id;
        this.text = text;
        this.state = state;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getText() {
        return text;
    }

    public String getState() {
        return state;
    }
}
