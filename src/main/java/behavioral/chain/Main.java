package behavioral.chain;

public class Main {

    public static void main(String[] args) {
        Logger logger = new SystemErrLogger();
        Logger logger20 = new FileLogger();
        Logger logger30 = new DBLogger();

        logger.setNext(logger20);
        logger20.setNext(logger30);

        logger.handle("Msg 5", 5);
        logger.handle("Msg 15", 15);
        logger.handle("Msg 25", 25);
        logger.handle("Msg 35", 35);
    }
}
