package org.loading.factory;

public class ServerFactory extends AbstractComputerFactory {
    
    @Override
    public Computer createComputer() {
        return new Server("16G", "cpu-server", "服务器");
    }
}
