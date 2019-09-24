package models;

import java.io.Serializable;

/**
 *
 * @author 794473
 */
public class Note implements Serializable
{
    String title;
    String text;
    
    public Note()
    {
        
    }

    public Note(String title, String text) 
    {
        this.title = title;
        this.text = text;
}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setContent(String text) {
        this.text = text;
    }
    
    
}
