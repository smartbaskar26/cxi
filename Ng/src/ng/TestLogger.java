package ng;

import org.apache.logging.log4j.Logger;

public class TestLogger {
	private static final Logger LOGGER = org.apache.logging.log4j.LogManager.getLogger();
private TestLogger() {
		
	}

public static Logger getLogger() {
	return LOGGER;
}
}
