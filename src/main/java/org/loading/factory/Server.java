package org.loading.factory;

public class Server extends Computer {
    public final String ram;
    public final String cpu;
    public final String name;

    public Server(String ram, String cpu, String name) {
        this.ram = ram;
        this.cpu = cpu;
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }

    @Override
    public String getRam() {
        return this.ram;
    }
}
