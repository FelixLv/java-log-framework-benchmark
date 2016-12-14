package org.felix.log.framework.benchmark.log4j;

import org.felix.log.framework.benchmark.common.AbstractLogBenchmark;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Intellij IDEA
 * User: felix
 * Date: 16/12/13
 * Time: 下午2:38
 */
public class Log4jBenchmark extends AbstractLogBenchmark{
    private static final Logger logger = LoggerFactory.getLogger(Log4jBenchmark.class);

    protected int workThreads() {
        return 50;
    }

    protected void doPrint() {
        logger.info("log4j hello world benchmark");
    }

    protected String logFrameworkType() {
        return "log4j";
    }

    protected int printCount() {
        return 10*10000;
    }

    public static void main(String[] args) throws InterruptedException {
        Log4jBenchmark log4jBenchmark = new Log4jBenchmark();
        log4jBenchmark.printLog();
    }
}
