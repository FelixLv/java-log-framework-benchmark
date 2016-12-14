package org.felix.log.framework.benchmark.logback;

import org.felix.log.framework.benchmark.common.AbstractLogBenchmark;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Intellij IDEA
 * User: felix
 * Date: 16/12/13
 * Time: 下午1:22
 */
public class LogbackBenchmark extends AbstractLogBenchmark{
    private static final Logger logger = LoggerFactory.getLogger(LogbackBenchmark.class);

    protected int workThreads() {
        return 50;
    }

    protected void doPrint() {
        logger.info("logback hello world benchmark");
    }

    protected String logFrameworkType() {
        return "logback";
    }

    protected int printCount() {
        return 10*10000;
    }

    public static void main(String[] args) throws InterruptedException {
        LogbackBenchmark logbackBenchmark = new LogbackBenchmark();
        logbackBenchmark.printLog();
    }
}
