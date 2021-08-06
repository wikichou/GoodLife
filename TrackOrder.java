package test;

public class TrackOrder {

    private int serial = 0;
    private Database db = new Database();

    public int track(int serial) {
        for (int i = 0; i <= 10000; i++) {
            if (db.checkExist(i)) {
                if(serial == db.getCustomerAccount(i).getMyorder().getSerial()){
                    return i;
                }
            }
        }
        return -1;
    }
}
