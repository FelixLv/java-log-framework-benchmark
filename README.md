#Java Log Framwork Benchmark


###利用50个线程同步和异步两种方式输出50万行和500行日志耗时对比



|50-thread|log4j|logback|log4j2|
|--|--|--|--|--|
|50-10000-syc | 11756ms|22315ms|3651ms|
|50-10000-async|10571ms|8153ms|3573ms|
|50-10-10000-syc|130031ms|207604ms|22829ms|
|50-10-10000-async|88910ms|66993ms|25573ms|


###版本


```

			<!--slf4j api-->
            <dependency>
                <groupId>org.slf4j</groupId>
                <artifactId>slf4j-api</artifactId>
                <version>1.7.21</version>
            </dependency>
            <!--log4j impl-->
            <dependency>
                <groupId>log4j</groupId>
                <artifactId>log4j</artifactId>
                <version>1.2.17</version>
            </dependency>
            <dependency>
                <groupId>org.slf4j</groupId>
                <artifactId>slf4j-log4j12</artifactId>
                <version>1.7.21</version>
            </dependency>

            <!--logback impl-->
            <dependency>
                <groupId>ch.qos.logback</groupId>
                <artifactId>logback-classic</artifactId>
                <version>1.1.8</version>
            </dependency>

            <!--log4j2 impl-->
            <dependency>
                <groupId>org.apache.logging.log4j</groupId>
                <artifactId>log4j-slf4j-impl</artifactId>
                <version>2.7</version>
            </dependency>
            <dependency>
                <groupId>org.apache.logging.log4j</groupId>
                <artifactId>log4j-core</artifactId>
                <version>2.7</version>
            </dependency>
            <dependency>
                <groupId>org.apache.logging.log4j</groupId>
                <artifactId>log4j-api</artifactId>
                <version>2.7</version>
            </dependency>

            <dependency>
                <groupId>com.lmax</groupId>
                <artifactId>disruptor</artifactId>
                <version>3.3.6</version>
            </dependency>
```

