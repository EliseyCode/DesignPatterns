package behavioral.chain;

public class DBLogger extends Logger {

    private static final int LOG_LVL = 30;

    public DBLogger() {
        super(LOG_LVL);
    }

    @Override
    protected void writeMsg(String msg) {
        System.err.println(this.getClass().getSimpleName() + ": " + msg);
    }
}
