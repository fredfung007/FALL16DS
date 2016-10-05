package com.CS102.recitation5;

/**
 * Created by fred on 10/4/2016.
 */

class LLNode<T> {
    private LLNode<T> link;
    private T info;

    LLNode(T info) {
        this.info = info;
        link = null;
    }

    T getInfo()
    // Returns info of this LLONode.
    {
        return info;
    }

    public void setInfo(T info)
    // Sets info of this LLNode.
    {
        this.info = info;
    }

    LLNode<T> getLink()
    // Returns link of this LLNode.
    {
        return link;
    }

    void setLink(LLNode<T> link)
    // Sets link of this LLNode.
    {
        this.link = link;
    }
}
