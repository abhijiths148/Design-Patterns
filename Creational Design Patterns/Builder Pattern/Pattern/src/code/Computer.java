package code;

public class Computer {
    /**
     * required parameters
     */
    private String RAM;
    private String CPU;
    /**
     * optional parameters
     */
    private Boolean isGraphicsCardEnabled;
    private Boolean isBluetoothEnabled;

    public String getRAM(){
        return RAM;
    }

    public String getCPU(){
        return CPU;
    }

    public Boolean getIsGraphicsCardEnabled(){
        return isGraphicsCardEnabled;
    }
    public Boolean getIsBluetoothEnabled(){
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder){
        this.RAM = builder.RAM;
        this.CPU = builder.CPU;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    /**
     * nested class as Buider class for Computer
     */
    public static class ComputerBuilder {
        private String RAM;
        private String CPU;
        private Boolean isGraphicsCardEnabled;
        private Boolean isBluetoothEnabled;

        /**
         * This builderclass constructor with required parameters is must
         * @param ram
         * @param cpu
         */
        public ComputerBuilder(String ram, String cpu){
            this.RAM = ram;
            this.CPU = cpu;
        }

        public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled){
            this.isGraphicsCardEnabled = isGraphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled){
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }
        /**
         * method for the client program to create a Computer object
         */
        public Computer build(){
            return new Computer(this);
        }
    }

}
