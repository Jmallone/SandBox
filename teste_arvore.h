
class BSTNode{

  public:

    BSTNode();
    BSTNode(int);
    virtual ~BSTNode();

    int getData();
    void setData(int);

    BSTNode* getLeft();
    BSTNode* getRight();

    void setLeft(BSTNode*);
    void setRight(BSTNode*);

    protected;

    private:
      BSTNode* left , right;

}
