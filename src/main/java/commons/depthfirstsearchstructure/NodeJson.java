package commons.depthfirstsearchstructure;

import java.util.List;
import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class NodeJson
{
    @SerializedName("nodes")
    @Expose
    private List<SubNode> nodes = null;
    @SerializedName("startNode")
    @Expose
    private String startNode;

    public List<SubNode> getNodes()
    {
        return nodes;
    }

    public void setNodes(List<SubNode> nodes)
    {
        this.nodes = nodes;
    }

    public String getStartNode()
    {
        return startNode;
    }

    public void setStartNode(String startNode)
    {
        this.startNode = startNode;
    }

}