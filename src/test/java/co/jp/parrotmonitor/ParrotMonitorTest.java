package co.jp.parrotmonitor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ParrotMonitorTest {

    @Test
    public void test() {
        ParrotMonitor p = new ParrotMonitor();
        p.monitor();
    }
}