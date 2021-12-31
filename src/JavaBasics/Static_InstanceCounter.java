public class Static_InstanceCounter {
    private static int numInstances = 0;
    protected static int getCounter(){
        return numInstances;
    }
    private static void addInstance(){
        numInstances++;
    }
    Static_InstanceCounter(){
        Static_InstanceCounter.addInstance();
    }
    public static void main(String[] args){
        System.out.println("Starting with " + Static_InstanceCounter.numInstances + " instances.");
        for(int i = 0; i < 500; i++){
            new Static_InstanceCounter();
        }
        System.out.println("Created " + Static_InstanceCounter.numInstances + " instances.");
    }
}
