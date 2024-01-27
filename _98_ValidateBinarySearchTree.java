class _98_ValidateBinarySearchTree {
    public boolean isValidBSTRecursive(TreeNode currentNode, long leftBound, long rightBound) {  // state of recursive step

        // Base case 1: Check if current node is null.
        if (currentNode == null) {
            return true;
        }

        // Base case 2: Check if current node is not in bounds
        // or !(leftBound < currentNode.val && currentNode.val < rightBound)
        if (leftBound >= currentNode.val || currentNode.val >= rightBound) {
            return false;
        }

        boolean isValidLeftSubtree = isValidBSTRecursive(currentNode.left, leftBound, currentNode.val);
        boolean isValidRightSubtree = isValidBSTRecursive(currentNode.right, currentNode.val, rightBound);

        return isValidLeftSubtree && isValidRightSubtree;
    }

    public boolean isValidBST(TreeNode root) {
        return isValidBSTRecursive(root, Long.MIN_VALUE, Long.MAX_VALUE);  // We don't have a bound at first. Using Long (instead of Integer) to handle edge case.
    }
}
