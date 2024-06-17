package org.loading.factory;

public class ComputerFactory {
    
    public static Computer createComputer(AbstractComputerFactory acf) {
        return acf.createComputer();
    }
}
