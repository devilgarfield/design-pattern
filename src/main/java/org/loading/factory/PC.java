package org.loading.factory;

public class PC extends Computer {
    private final String name;
    private final String cpu;
    private final String ram;

    public PC(String name, String cpu, String ram) {
        this.name = name;
        this.cpu = cpu;
        this.ram = ram;
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
