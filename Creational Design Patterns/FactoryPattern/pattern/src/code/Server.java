package code;

public class Server extends Computer {
    String ram;
    String cpu;
    String hdd;

    public Server(String RAM,String HDD, String CPU){
        this.ram = RAM;
        this.hdd = HDD;
        this.cpu = CPU;
    }

    public void setRam(String RAM){
        this.ram = RAM;
    }
    public void setCpu(String CPU){
        this.cpu = CPU;
    }
    public void setHdd(String HDD){
        this.hdd = HDD;
    }

    public String getRAM(){
        return ram;
    }
    public String getCPU(){
        return cpu;
    }
    public String getHDD(){
        return hdd;
    }
}
