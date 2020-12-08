package kamal.collections.ex;

public class Ex {
    int modelYear;
    String modelName;

       public Ex(int year, String name){
           modelYear = year;
           modelName = name;
       }
    public static void main(String[] args) {
        Ex myCar = new Ex(1995,"Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}



