package Services;

import java.sql.SQLException;
import java.util.ArrayList;

public interface IServiceReclamation <T>{
    void addReclamation(T t) throws SQLException;
    void updateReclamation(T t) throws  SQLException;
    void deleteReclamation(int id) throws  SQLException;
    ArrayList<T> readAll() throws  SQLException;
    T get(int id) throws SQLException;
}
