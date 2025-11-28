public class InterfaceAbstraction {
    Machine fan = new Fan("Fan");
    Machine washer = new WashingMachine("Washing Machine");

}


interface Machine{

    String start();
}

abstract class Appliance implements Machine{

    String name;


    public Appliance(String name){
        this.name = name;
    }

}

class Fan extends Appliance{

    public Fan(String name){
        super(name);
    }

    @Override
    public String start(){
        return "Fan is operating.";
    }

}


class WashingMachine extends Appliance{

    public WashingMachine(String name){
        super(name);
    }

    @Override
    public String start(){
        return "Washing Machine is operating.";
    }

}

