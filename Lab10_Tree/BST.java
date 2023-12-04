package Lab10_Tree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class BST<E extends Comparable<E>> {
	private BNode<E> root;

	public BST() {
		this.root = null;
	}

	public BNode<E> getRoot() {
		return root;
	}

	public void setRoot(BNode<E> root) {
		this.root = root;
	}

	// Add element e into BST
	public void add(E e) {
		if (this.root == null) {
			this.root = new BNode<>(e);
		} else {
			this.root.add(e);
		}
	}

	// Add a collection of elements col into BST
	public void add(Collection<E> col) {
		for (E e : col) {
			add(e);
		}
	}

	// compute the depth of a node in BST
	public int depth(E node) {
		if (root == null) {
			return -1; // Empty tree, so depth is -1
		}

		BNode<E> current = root;
		int depth = 0;

		while (current != null) {
			int comp = node.compareTo(current.getData());

			if (comp == 0) {
				return depth;
			} else if (comp < 0) {
				current = current.getLeft();
			} else {
				current = current.getRight();
			}

			depth++;
		}

		return -1; // Node not found in the tree
	}

	// compute the height of BST
	public int height() {
		if (root == null) {
			return -1;
		} else {
			return root.height();
		}
	}

	// Compute total nodes in BST
	public int size() {
		if (root == null) {
			return 0;
		} else {
			return root.size();
		}

	}

	// Check whether element e is in BST
	public boolean contains(E e) {
		if (root == null) {
			return false;
		} else {
			return root.contains(e);
		}
	}

	private E findMin(BNode<E> node) {
		if (node.getLeft() == null) {
			return node.getData();
		} else {
			return findMin(node.getLeft());
		}
	}

	// Find the minimum element in BST
	public E findMin() {
		if (root == null) {
			return null;
		} else {
			return findMin(root);
		}
	}

	private E findMax(BNode<E> node) {
		if (node.getRight() == null) {
			return node.getData();
		} else {
			return findMax(node.getRight());
		}
	}

	// Find the maximum element in BST
	public E findMax() {
		if (root == null) {
			return null;
		} else {
			return findMax(root);
		}
	}

	// Remove element e from BST
	public boolean remove(E e) {
		// TODO
		return false;
	}

	// get the ancestors of a node
	public List<E> ancestors(E data) {
		List<E> ancestorsList = new ArrayList<>();
		collectAncestors(root, data, ancestorsList);
		return ancestorsList;
	}

	private boolean collectAncestors(BNode<E> node, E data, List<E> ancestorsList) {
		if (node == null) {
			return false;
		}

		if (node.getData().equals(data)) {
			return true;
		} else if (data.compareTo(node.getData()) < 0) {
			if (collectAncestors(node.getLeft(), data, ancestorsList)) {
				ancestorsList.add(node.getData());
				return true;
			}
		} else {
			if (collectAncestors(node.getRight(), data, ancestorsList)) {
				ancestorsList.add(node.getData());
				return true;
			}
		}
		return false;
	}

	// Display BST using inorder traversal
	public void inorder() {
		inorderTraversal(root);
		System.out.println(); // Add a new line after traversal for clarity
	}

	private void inorderTraversal(BNode<E> node) {
		if (node != null) {
			inorderTraversal(node.getLeft());
			System.out.print(node.getData() + " ");
			inorderTraversal(node.getRight());
		}
	}

	// Display BST using preorder traversal
	public void preorder() {
		preorderTraversal(root);
		System.out.println(); // Add a new line after traversal for clarity
	}

	private void preorderTraversal(BNode<E> node) {
		if (node != null) {
			System.out.print(node.getData() + " ");
			preorderTraversal(node.getLeft());
			preorderTraversal(node.getRight());
		}
	}

	// Display BST using postorder traversal
	public void postorder() {
		postorderTraversal(root);
		System.out.println(); // Add a new line after traversal for clarity
	}

	private void postorderTraversal(BNode<E> node) {
		if (node != null) {
			postorderTraversal(node.getLeft());
			postorderTraversal(node.getRight());
			System.out.print(node.getData() + " ");
		}
	}

}