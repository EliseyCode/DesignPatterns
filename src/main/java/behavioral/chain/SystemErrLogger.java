package behavioral.chain;

public class SystemErrLogger extends Logger {
    private static final int LOG_LVL = 0;

    public SystemErrLogger() {
        super(LOG_LVL);
    }

    @Override
    protected void writeMsg(String msg) {
        System.err.println(this.getClass().getSimpleName() + ": " + msg);
    }
}
