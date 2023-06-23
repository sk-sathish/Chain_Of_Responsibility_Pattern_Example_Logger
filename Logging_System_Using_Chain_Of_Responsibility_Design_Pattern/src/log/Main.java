package log;

public class Main {
	public static void main(String[] args) {
		Logger logger = new InfoLogger(new DebugLogger(new WarningLogger(new ErrorLogger(null))));
		logger.log(Level.INFO, "Info logging test 1");
		logger.log(Level.WARNING, "Warning logging test 1");
		logger.log(Level.DEBUG, "Debug logging test 1");
		logger.log(Level.ERROR, "Error logging test 1");
		
		logger.log(Level.INFO, "Info logging test 2");
		logger.log(Level.WARNING, "Warning logging test 2");
		logger.log(Level.DEBUG, "Debug logging test 2");
		logger.log(Level.ERROR, "Error logging test 2");
	}
}
