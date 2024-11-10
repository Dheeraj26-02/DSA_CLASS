public class AVL_Client {
    public static void main(String args[]) {
        AVL a=new AVL();
        for(int i=0;i<1000;i++)
        {
            a.insert(i);
        }
        System.out.println(a.height());
    }
}
