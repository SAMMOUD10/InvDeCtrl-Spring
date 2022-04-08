package EXT;

import DAO.IntDao;

public class DaoImplVWS implements IntDao {
    @Override
    public double getData() {
        System.out.println("Version Web Services");
        return 90;
    }
}
