package test;

import code.Computer;

public class TestBuilder {
    public static void main(String[] args) {
        Computer comp = new Computer.ComputerBuilder("2gb","2.5gHz")
                .setBluetoothEnabled(false)
                .setGraphicsCardEnabled(true)
                .build();
        System.out.println("RAM = "+comp.getRAM()+", CPU = "+comp.getCPU()+", Graphics : "+comp.getIsGraphicsCardEnabled()+
        ", Bluetooth : "+comp.getIsBluetoothEnabled());
    }
}
