package Lab10_Tree;

import java.util.ArrayList;
import java.util.List;

public class BNode<E extends Comparable<E>> {
	private E data;
	private BNode<E> left;
	private BNode<E> right;

	public BNode(E data) {
		this.data = data;
		this.left = null;
		this.right = null;
	}

	public BNode(E data, BNode<E> left, BNode<E> right) {
		this.data = data;
		this.left = left;
		this.right = right;
	}

	public E getData() {
		return data;
	}

	public void setData(E data) {
		this.data = data;
	}

	public BNode<E> getLeft() {
		return left;
	}

	public void setLeft(BNode<E> left) {
		this.left = left;
	}

	public BNode<E> getRight() {
		return right;
	}

	public void setRight(BNode<E> right) {
		this.right = right;
	}

	public void add(E e) {
	    if (e.compareTo(this.data) <0) {
	        if (this.left == null) {
	            this.left = new BNode<>(e);
	        } else {
	            this.left.add(e);
	        }
	    } else {
	        if (this.right == null) {
	            this.right = new BNode<>(e);
	        } else {
	            this.right.add(e);
	        }
	    }
	}

	public boolean contains(E e) {
		int comp = e.compareTo(data);
	    if (comp == 0) {
	        return true;
	    } else {
	        if (comp < 0) {
	            if (left == null) {
	                return false;
	            } else {
	                return left.contains(e);
	            }
	        } else {
	            if (right == null) {
	                return false;
	            } else {
	                return right.contains(e);
	            }
	        }
	    }
	}

	public int size() {
		 int leftSize = 0;
		    int rightSize = 0;

		    if (left != null) {
		        leftSize = left.size();
		    }

		    if (right != null) {
		        rightSize = right.size();
		    }

		    return 1 + leftSize + rightSize;
	}

	public int depth(E node) {
		int comp = node.compareTo(data);

	    if (comp == 0) {
	        return 0;
	    }
	    BNode<E> child = null;
	    int childDepth = -1;

	    if (comp < 0) {
	        child = left;
	    } else {
	        child = right;
	    }

	    if (child != null) {
	        childDepth = child.depth(node);
	    }

	    if (childDepth == -1) {
	        return -1;
	    } else {
	        return 1 + childDepth;
	    }
	}
	// get the ancestors of a node
	public List<E> ancestors(E data) {
		 List<E> ancestorsList = new ArrayList<>();
	        return ancestorsList;
	}

	public int height() {
		  int leftHeight = -1;
		    int rightHeight = -1;

		    if (left != null) {
		        leftHeight = left.height();
		    }

		    if (right != null) {
		        rightHeight = right.height();
		    }

		    if (leftHeight > rightHeight) {
		        return leftHeight + 1;
		    } else {
		        return rightHeight + 1;
		    }
	}

}
