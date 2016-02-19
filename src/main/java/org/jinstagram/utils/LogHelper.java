package org.jinstagram.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import org.slf4j.Logger;

public final class LogHelper {
    
    /**
     * <p>
     * The message format pattern used to log the exception.
     * </p>
     */
    private static final String EXCEPTION_PATTERN = "Error in method {0}.\n\tException name: {1}.\n\t"
            + "Stack trace: {2}.\n\tTime spent in the method: {3} milliseconds.";
    
    /**
     * <p>
     * The message format pattern used to log the exit of method.
     * </p>
     */
    private static final String EXIT_METHOD_PATTERN = "Exiting method %s.\n\tReturn value: [{%s}].\n\tTime spent in the method: {2" +
            "%d} milliseconds.";
    
    /**
     * <p>
     * The message format pattern used to log the entrance of method.
     * </p>
     */
    private static final String ENTRANCE_METHOD_PATTERN = "Entering method %s.\n\tMethod arguments: [%s].";

    private static Gson GSON = new GsonBuilder().setPrettyPrinting().create();

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
     * Logs for entrance into every public methods with {@link Level#DEBUG}.
     * </p>
     *
     * @param methodName      The name of method entranced into.
     * @param methodArguments The method arguments
     * @param logger          the logger instance
     */
    public static void logEntrance(Logger logger, String methodName, String methodArguments) {
        logger.debug(String.format(ENTRANCE_METHOD_PATTERN, methodName, methodArguments));

    }

    /**
     * <p>
     * Logs for exit from every public methods with {@link Level#DEBUG}.
     * </p>
     *
     * @param methodName     The name of method existed from.
     * @param returnValue    the return value
     * @param timeSpent      the time spent
     * @param logger         the logger instance
     * @param verboseLogging the control flag defining whether the detailed logging actions should be performed
     */
    public static void logExit(Logger logger, String methodName, String returnValue,
                               long timeSpent) {
        logger.debug(String.format(EXIT_METHOD_PATTERN, methodName, returnValue, timeSpent));

    }

    /**
     * <p>
     * Logs the given <code>Throwable</code> with {@link Level#ERROR}.
     * </p>;2
     *
     * @param methodName     The name of method where the exception occurs.
     * @param e              The <code>Throwable</code> caught to be logged.
     * @param timeSpent      the time spent
     * @param logger         the logger instance
     * @param verboseLogging the control flag defining whether the detailed logging actions should be performed
     */
    public static void logException(Logger logger, String methodName, Throwable e,
                                    long timeSpent) {
        logger.error(String.format(EXCEPTION_PATTERN, methodName, e.getClass().getSimpleName(), e.getMessage()));
    }

    /**
     * Pretty print the JSON response in the logs
     *
     * @param logger     the logger instance
     * @param jsonString the json String which is to be pretty printed.
     */
    public static void prettyPrintJSONResponse(Logger logger, String jsonString) {
        if(logger.isDebugEnabled()) {
            // it can fail...on 404 it usually not a json
            String s;
            try {
                final JsonElement element = new JsonParser().parse(jsonString);
                s = new GsonBuilder().setPrettyPrinting().create().toJson(element);
            } catch(Exception e) {
                s = jsonString;
            }
            
            logger.debug("Received JSON response from Instagram - " + s);
        }
    }

}