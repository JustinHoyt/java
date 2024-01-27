import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class _98_ValidateBinarySearchTreeTest {

    @Test
    public void testTree_2_1_3() {
        TreeNode root = new TreeNode();
        root.val = 2;
        root.left = new TreeNode(1, null, null);
        root.right = new TreeNode(3, null, null);

        _98_ValidateBinarySearchTree validateBinarySearchTree = new _98_ValidateBinarySearchTree();
        boolean actualResult = validateBinarySearchTree.isValidBST(root);

        assertEquals(true, actualResult);
    }
}
