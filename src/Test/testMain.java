package Test;

import Utils.DataSource;

public class testMain {
    public static void main(String[] args) {
        DataSource ds =  DataSource.getInstance();
        ds.getCon();

    }
}
