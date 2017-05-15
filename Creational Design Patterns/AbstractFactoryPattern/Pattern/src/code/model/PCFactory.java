package code.model;

import code.design.ComputerAbstractFactory;

public class PCFactory implements ComputerAbstractFactory {

    private String ram;
    private String hdd;
    private String cpu;

    public PCFactory(String RAM,String HDD,String CPU){
        this.ram = RAM;
        this.hdd = HDD;
        this.cpu = CPU;
    }

    @Override
    public Computer createComputer(){
        return new PC(ram,hdd,cpu);
    }
}
