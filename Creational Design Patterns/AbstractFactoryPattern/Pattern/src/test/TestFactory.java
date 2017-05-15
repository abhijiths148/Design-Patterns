package test;

import code.model.*;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2gb","1TB","2GHz"));
        System.out.println("PC config : "+pc);
        Computer server = ComputerFactory.getComputer(new ServerFactory("12gb","2TB","3GHz"));
        System.out.println("Server config: "+server);
        Computer laptop = ComputerFactory.getComputer(new LaptopFactory("4gb","500gb","2.3GHz"));
        System.out.println("Laptop config: "+laptop);
    }
}
