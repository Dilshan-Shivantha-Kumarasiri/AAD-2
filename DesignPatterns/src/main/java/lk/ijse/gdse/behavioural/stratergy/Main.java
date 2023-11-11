package lk.ijse.gdse.behavioural.stratergy;

public class Main {


    public static void main(String[] args) {

        Strategy addOperation = new AddOperation();
        Context context = new Context(addOperation);

        System.out.println(context.executeOperation(1,2));

        Context substractContext = new Context(new Substract());
        System.out.println(substractContext.executeOperation(1,2));

    }
}
