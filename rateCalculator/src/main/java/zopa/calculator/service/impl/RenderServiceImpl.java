package zopa.calculator.service.impl;

import zopa.calculator.service.api.RenderService;

import java.util.Iterator;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RenderServiceImpl implements RenderService {

    private final static Logger LOGGER = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public RenderServiceImpl() {
    }


    @Override
    public String renderHtml(Map<String, String> commands, String htmlTemplate) {

        //find the list with the commands and replace it with the html body from the map
        String finalString = htmlTemplate;

        for (String key : commands.keySet()) {
            LOGGER.log(Level.INFO, "replacing:" + key);
            LOGGER.log(Level.INFO, "before:" + finalString);
            finalString = finalString.replaceAll(key, commands.get(key));
            LOGGER.log(Level.INFO, "after:" + finalString);
        }

        return finalString;
    }
}
