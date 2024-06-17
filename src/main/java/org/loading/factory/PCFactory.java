package org.loading.factory;

public class PCFactory extends AbstractComputerFactory {
    
    @Override
    public Computer createComputer() {
        return new PC("pc", "cpu-pc", "4G");
    }
}
