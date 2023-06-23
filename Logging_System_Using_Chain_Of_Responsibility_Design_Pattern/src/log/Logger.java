package log;

public abstract class Logger {
	private Logger nextLogger;
	public Logger(Logger nextLogger) {
		this.nextLogger = nextLogger;
	}
	public void log(Level level, String message) {
		if(nextLogger != null) {
			nextLogger.log(level, message);
		}
	}
	
}
