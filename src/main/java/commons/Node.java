package commons;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Node
{

    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName("left")
    @Expose
    private Object left;
    @SerializedName("right")
    @Expose
    private Object right;
    @SerializedName("value")
    @Expose
    private Integer value;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public Object getLeft()
    {
        return left;
    }

    public void setLeft(Object left)
    {
        this.left = left;
    }

    public Object getRight()
    {
        return right;
    }

    public void setRight(Object right)
    {
        this.right = right;
    }

    public Integer getValue()
    {
        return value;
    }

    public void setValue(Integer value)
    {
        this.value = value;
    }

}