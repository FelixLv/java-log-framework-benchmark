package org.felix.log.framework.benchmark.log4j2;

import org.apache.logging.log4j.LogManager;
import org.felix.log.framework.benchmark.common.AbstractLogBenchmark;

/**
 * Created by Intellij IDEA
 * User: felix
 * Date: 16/12/13
 * Time: 下午2:33
 */
public class Log4j2Benchmark extends AbstractLogBenchmark{
    private static final org.apache.logging.log4j.Logger logger = LogManager.getLogger(Log4j2Benchmark.class);

    protected int workThreads() {
        return 50;
    }

    protected void doPrint() {
        logger.info("log4j2 hello world benchmark");
    }

    protected String logFrameworkType() {
        return "log4j2";
    }

    protected int printCount() {
        return 10*10000;
    }

    public static void main(String[] args) throws InterruptedException {
        //异步设置
        System.setProperty("Log4jContextSelector","org.apache.logging.log4j.core.async.AsyncLoggerContextSelector");
        Log4j2Benchmark log4j2Benchmark = new Log4j2Benchmark();
        log4j2Benchmark.printLog();
    }
}
