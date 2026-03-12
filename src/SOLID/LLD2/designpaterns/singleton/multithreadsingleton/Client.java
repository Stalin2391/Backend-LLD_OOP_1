package SOLID.LLD2.designpaterns.singleton.multithreadsingleton;

public class Client {
    public static void main(String[] args) {
        DbConnection db1 = DbConnection.getInstance();
        DbConnection db2 = DbConnection.getInstance();
        System.out.println("DbConnection");

        //Double-Checked Locking
    }
}
