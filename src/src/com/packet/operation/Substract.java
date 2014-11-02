package src.com.packet.operation;
import src.com.packet.basic.interfaces.ISetter;

/**
 * Created by Danuts on 10/30/2014.
 */
public class Substract extends Operation implements ISetter {
    public Substract(int op1, int op2) {
        super(op1, op2);
    }

    /*@Override
    public void setValue(int value) {
        mOp1.setValue(value);
    }*/

    @Override
    public String getOp() {
        return " - ";
    }

    @Override
    public void print() {
        System.out.println(mOp1+getOp()+mOp2+" = "+mResult);
    }

    @Override
    public boolean greaterThan(int valueToCheck) {

        if (valueToCheck < 0)
            return false;

        return true;
    }

    @Override
    public void execute() {
       /*if (mOp2 == 0)
           throw new OpException("Division by 0!");*/

        mResult=mOp1-mOp2;

    }
}
