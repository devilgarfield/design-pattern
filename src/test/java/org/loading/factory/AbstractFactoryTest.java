package org.loading.factory;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;


public class AbstractFactoryTest {
    @Test
    void abstractFactoryTest() {
        PCFactory pcFactory = new PCFactory();
        ServerFactory serverFactory = new ServerFactory();

        Computer pc = ComputerFactory.createComputer(pcFactory);
        Computer server = ComputerFactory.createComputer(serverFactory);

        assertThat(pc, is(notNullValue()));
        assertThat(pc.getCpu(), is(equalTo("cpu-pc")));
        assertThat(server, is(notNullValue()));
        assertThat(server.getCpu(), is(equalTo("cpu-server")));
    }
}

