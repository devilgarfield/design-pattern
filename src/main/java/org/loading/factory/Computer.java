package org.loading.factory;

public abstract class Computer {

    public abstract String getName();

    public abstract String getCpu();

    public abstract String getRam();

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("name='").append(getName()).append('\'');
        sb.append(", cpu='").append(getCpu()).append('\'');
        sb.append(", ram='").append(getRam()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
