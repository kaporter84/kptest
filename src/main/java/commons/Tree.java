package commons;

import java.util.List;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Tree
{

    @SerializedName("nodes")
    @Expose
    private List<Node> nodes = null;
    @SerializedName("root")
    @Expose
    private String root;

    public List<Node> getNodes()
    {
        return nodes;
    }

    public void setNodes(List<Node> nodes)
    {
        this.nodes = nodes;
    }

    public String getRoot()
    {
        return root;
    }

    public void setRoot(String root)
    {
        this.root = root;
    }

}