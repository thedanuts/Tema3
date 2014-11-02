import src.com.packet.basic.interfaces.ISetter;
import src.com.packet.operation.Add;
import src.com.packet.operation.Divide;
import src.com.packet.operation.Operation;
import src.com.packet.operation.Substract;

/**
 * Created by Danuts on 11/2/2014.
 */
public class Main2 {

    /**
     * The entry point to this project
     * @param args The arguments to the executable
     */

    public static void main(String[] args) {

        ISetter op1 = new Add(5,4);
        Operation op2 = new Divide(6,2);
        op2.execute();
        System.out.println(op2.getResult());
        op2.print();
        System.out.println(op1.getOp());
    }

}
