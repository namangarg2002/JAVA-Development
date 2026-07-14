package com.naman.learning.Log4jDemo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4JTest {
    
    private static final Logger logger=LogManager.getLogger(Log4JTest.class);

    public static void process(){
        // Service
        logger.trace("FROM THE TRACE METHOD");
        logger.debug("FROM THE DEBUG METHOD");
        logger.info("FROM THE INFO METHOD");
        logger.warn("FROM THE WARN METHOD");
        logger.error("FROM THE ERROR METHOD");
        logger.fatal("FROM THE FATAL METHOD");
    }
}
