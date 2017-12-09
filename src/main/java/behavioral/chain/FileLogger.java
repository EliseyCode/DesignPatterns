package behavioral.chain;

public class FileLogger extends Logger {
    private static final int LOG_LVL = 20;

    public FileLogger() {
        super(LOG_LVL);
    }

    @Override
    protected void writeMsg(String msg) {
        System.err.println(this.getClass().getSimpleName() + ": " + msg);
    }
}
