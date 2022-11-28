package commons;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Treedata
{

    @SerializedName("tree")
    @Expose
    private Tree tree;
    @SerializedName("target")
    private Integer target;

    public Tree getTree()
    {
        return tree;
    }

    public void setTree(Tree tree)
    {
        this.tree = tree;
    }

    public Integer getTarget()
    {
        return target;
    }

    public void setTarget(Integer target)
    {
        this.target = target;
    }

}