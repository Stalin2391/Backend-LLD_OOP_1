package SOLID.LLD2.designpaterns.singleton.multithreadsingleton;

public class DbConnection {
    private static DbConnection instance = null;
    String url;
    String name;
    int portNo;

    private DbConnection() {};

    public static DbConnection getInstance() {
        if(instance == null){
            synchronized (DbConnection.class){
               if(instance == null){
                   instance = new DbConnection();
               }
            }
        }
        return instance;

    }
}
