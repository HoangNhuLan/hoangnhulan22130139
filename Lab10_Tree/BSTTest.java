package Lab10_Tree;

import java.util.List;

public class BSTTest {
	    public static void main(String[] args) {
	        // Create a binary search tree
	        BST<Integer> bst = new BST<>();

	        // Add elements to the BST
	        bst.add(25);
	        bst.add(15);
	        bst.add(50);
	        bst.add(10);
	        bst.add(22);
	        bst.add(35);
	        bst.add(70);
	        bst.add(4);
	        bst.add(12);
	        bst.add(18);
	        bst.add(24);
	        bst.add(31);
	        bst.add(44);
	        bst.add(66);
	        bst.add(90);

	        // Test various methods
	        System.out.println("In-order traversal:");
	        inOrderTraversal(bst.getRoot());

	        int elementToFind = 31;
	        System.out.println("\nDoes the BST contain " + elementToFind + "? " + bst.contains(elementToFind));

	        int elementToRemove = 22;
	        System.out.println("\nRemoving " + elementToRemove + " from the BST:");
	        bst.remove(elementToRemove);
	        inOrderTraversal(bst.getRoot());

	        System.out.println("\n\nSize of the BST: " + bst.size());
	        System.out.println("Height of the BST: " + bst.height());
	        System.out.println("Minimum element in the BST: " + bst.findMin());
	        System.out.println("Maximum element in the BST: " + bst.findMax());

	        int elementToCheckDepth = 44;
	        System.out.println("\nDepth of " + elementToCheckDepth + ": " + bst.depth(elementToCheckDepth));

	        int elementToAdd = 20;
	        System.out.println("\nAdding " + elementToAdd + " to the BST:");
	        bst.add(elementToAdd);
	        inOrderTraversal(bst.getRoot());

	        int elementToFindAncestors = 31;
	        List<Integer> ancestors = bst.ancestors(elementToFindAncestors);
	        System.out.println("\n\nAncestors of " + elementToFindAncestors + ": " + ancestors);
	       
	        System.out.println("In-order traversal:");
	        bst.inorder();

	        System.out.println("Pre-order traversal:");
	        bst.preorder();

	        System.out.println("Post-order traversal:");
	        bst.postorder();
	    }

	    // Helper method for in-order traversal
	    private static void inOrderTraversal(BNode<Integer> node) {
	        if (node != null) {
	            inOrderTraversal(node.getLeft());
	            System.out.print(node.getData() + " ");
	            inOrderTraversal(node.getRight());
	        }
	    }
	}
