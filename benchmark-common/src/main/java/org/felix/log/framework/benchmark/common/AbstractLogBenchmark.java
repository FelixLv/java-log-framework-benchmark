package org.felix.log.framework.benchmark.common;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Intellij IDEA
 * User: felix
 * Date: 16/12/13
 * Time: 下午1:05
 */
public abstract class AbstractLogBenchmark {
    protected abstract int workThreads();
    protected abstract void doPrint();
    protected abstract String logFrameworkType();
    protected abstract int printCount();

    protected void printLog() throws InterruptedException {
        final CountDownLatch countDownLatch = new CountDownLatch(workThreads());
        long start = System.currentTimeMillis();
        for(int i = 0 ; i < workThreads() ; i ++){
            new Thread(new Runnable() {
                public void run() {
                    for(int j = 0 ; j< printCount() ; j ++ ){
                        doPrint();
                    }
                    countDownLatch.countDown();
                }
            }).start();
        }
        countDownLatch.await();
        long end  = System.currentTimeMillis();
        System.out.println("use " + logFrameworkType() + ",print count " + printCount() + ",costs time " + (end - start) + "ms");
    }
}
