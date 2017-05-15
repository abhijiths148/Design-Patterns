package test;

import code.Computer;
import code.ComputerFactory;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer("PC","2gb","1TB","2GHz");
        System.out.println("PC config : "+pc);
        Computer server = ComputerFactory.getComputer("Server","16gb","5000TB","3GHz");
        System.out.println("Server : "+server);
    }
}
