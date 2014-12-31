package org.jinstagram.utils;

import org.slf4j.Logger;

public final class LogHelper {

	/**
	 * <p>
	 * Private default constructor, so the <code>LogHelper</code> can not be created
	 * by the outside code.
	 * </p>
	 */
	private LogHelper() {
	}

	/**
	 * <p>
	 * The message format pattern used to log the entrance of method.
	 * </p>
	 */
	private static final String ENTRANCE_METHOD_PATTERN = "Entering method ${REPLACED_CLASSNAME}#{0}.\n\tMethod arguments: [{1}].";

	/**
	 * <p>
	 * The message format pattern used to log the exit of method.
	 * </p>
	 */
	private static final String EXIT_METHOD_PATTERN = "Exiting method ${REPLACED_CLASSNAME}#{0}.\n\tReturn value: [{1}].\n\tTime spent in the method: {2} milliseconds.";

	/**
	 * <p>
	 * The message format pattern used to log the exception.
	 * </p>
	 */
	private static final String EXCEPTION_PATTERN = "Error in method ${REPLACED_CLASSNAME}#{0}.\n\tException name: {1}.\n\t"
			+ "Stack trace: {2}.\n\tTime spent in the method: {3} milliseconds.";

	/**
	 * <p>
	 * Logs for entrance into every public methods with {@link Level#DEBUG}.
	 * </p>
	 *
	 * @param methodName
	 *            The name of method entranced into.
	 * @param methodArguments
	 *            The method arguments
	 * @param timestamp
	 *            the time stamp
	 * @param logger
	 *            the logger instance
	 * @param verboseLogging
	 *            the control flag defining whether the detailed logging actions should be performed
	 */
	public static void logEntrance(Logger logger, String methodName, String methodArguments) {
		logger.debug(ENTRANCE_METHOD_PATTERN, methodName, methodArguments);

	}

	/**
	 * <p>
	 * Logs for exit from every public methods with {@link Level#DEBUG}.
	 * </p>
	 *
	 * @param methodName
	 *            The name of method existed from.
	 * @param returnValue
	 *            the return value
	 * @param timeSpent
	 *            the time spent
	 * @param logger
	 *            the logger instance
	 * @param verboseLogging
	 *            the control flag defining whether the detailed logging actions should be performed
	 */
	public static void logExit(Logger logger, boolean verboseLogging, String methodName, String returnValue,
			long timeSpent) {
		logger.debug(EXIT_METHOD_PATTERN, methodName, returnValue, timeSpent);

	}

	/**
	 * <p>
	 * Logs the given <code>Throwable</code> with {@link Level#ERROR}.
	 * </p>
	 *
	 * @param methodName
	 *            The name of method where the exception occurs.
	 * @param e
	 *            The <code>Throwable</code> caught to be logged.
	 * @param timeSpent
	 *            the time spent
	 * @param logger
	 *            the logger instance
	 * @param verboseLogging
	 *            the control flag defining whether the detailed logging actions should be performed
	 */
	public static void logException(Logger logger, boolean verboseLogging, String methodName, Throwable e,
			long timeSpent) {
		logger.error(EXCEPTION_PATTERN, methodName, e.getClass().getSimpleName(), e.getMessage());

	}

}