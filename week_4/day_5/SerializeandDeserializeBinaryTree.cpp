class Codec {
public:

    // Encodes a tree to a single string.
    string serialize(TreeNode* root) {
        if (!root) return "N,";

        return to_string(root->val) + "," +
               serialize(root->left) +
               serialize(root->right);
    }

    TreeNode* buildTree(stringstream &ss) {
        string val;
        getline(ss, val, ',');

        if (val == "N") return NULL;

        TreeNode* node = new TreeNode(stoi(val));
        node->left = buildTree(ss);
        node->right = buildTree(ss);

        return node;
    }

    // Decodes your encoded data to tree.
    TreeNode* deserialize(string data) {
        stringstream ss(data);
        return buildTree(ss);
    }
};
