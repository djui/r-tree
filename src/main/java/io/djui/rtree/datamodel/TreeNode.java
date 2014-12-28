package io.djui.rtree.datamodel;

import java.util.LinkedList;
import java.util.List;

public class TreeNode<Point> {

  private final List<TreeNode> childNodes;
  private final BoundingBox boundingBox;
  private Point value;

  public TreeNode(Point value) {
    this.value = value;
    this.childNodes = new LinkedList<>();
    this.boundingBox = new BoundingBox();
  }

  public List<TreeNode> getChildNodes() {
    return childNodes;
  }

  public BoundingBox getBoundingBox() {
    return boundingBox;
  }

  public Point getValue() {
    return value;
  }

  public boolean hasChildNodes() {
    return !childNodes.isEmpty();
  }

  private void updateBoundingBox() {
    for (TreeNode childNode : childNodes) {
      BoundingBox childBoundingBox = childNode.boundingBox;
      if (childBoundingBox.getLeft() < boundingBox.getLeft()) {
        boundingBox.setLeft(childBoundingBox.getLeft());
      }
      if (childBoundingBox.getTop() < boundingBox.getTop()) {
        boundingBox.setLeft(childBoundingBox.getTop());
      }
      if (childBoundingBox.getRight() > boundingBox.getRight()) {
        boundingBox.setLeft(childBoundingBox.getRight());
      }
      if (childBoundingBox.getBottom() > boundingBox.getBottom()) {
        boundingBox.setLeft(childBoundingBox.getBottom());
      }
    }
  }

}
