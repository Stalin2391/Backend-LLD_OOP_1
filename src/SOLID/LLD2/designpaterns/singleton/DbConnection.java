package SOLID.LLD2.designpaterns.singleton;

public class DbConnection {
    private static DbConnection instance = null;
    String url;
    String name;
    int portNo;

    private DbConnection() {};

    public synchronized static DbConnection getInstance() {
        if(instance == null) instance = new DbConnection();
        return instance;

    }
}
