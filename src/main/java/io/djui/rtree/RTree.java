package io.djui.rtree;

import java.util.LinkedList;
import java.util.List;

import io.djui.rtree.datamodel.BoundingBox;
import io.djui.rtree.datamodel.Point;
import io.djui.rtree.datamodel.TreeNode;

public class RTree {

  private final int m;
  private TreeNode rootNode;

  public RTree(int m) {
    this.rootNode = new TreeNode<>(null);
    this.m = m;
  }

  public List<Point> search(BoundingBox boundingBox) {
    return search(rootNode, boundingBox);
  }

  private List<Point> search(TreeNode node, BoundingBox boundingBox) {
    List<Point> result = new LinkedList<>();
    if (node.hasChildNodes()) {
      for (TreeNode childNode : node.getChildNodes()) {
        if (intersects?) {
          List<Point> partialResult = search(childNode, boundingBox);
          if (!partialResult.isEmpty()) {
            result.addAll(partialResult);
          }
        }
      }
    } else {
      if (intersects?) {
        
      }
    }
    return result;
  }

  public void insert(Point value) {
//    for (TreeNode childNode : rootNode.getChildNodes()) {
//      childNode.getBoundingBox();
//    }
  }

}
