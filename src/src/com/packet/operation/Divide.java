package src.com.packet.operation;

import src.com.packet.basic.interfaces.ISetter;
import src.com.packet.exceptions.OpException;

/**
 * Created by Danuts on 11/2/2014.
 */
public class Divide extends Operation implements ISetter {

    public Divide(int op1, int op2) {
        super(op1, op2);
    }

    /*@Override
    public void setValue(int value) {
        mOp1.setValue(value);
    }*/

    @Override
    public String getOp() {
        return " / ";
    }

    @Override
    public boolean greaterThan(int valueToCheck) {

        if (valueToCheck < 0)
            return false;

        return true;
    }

    @Override
    public void execute() throws OpException {
       if (mOp2 == 0)
           throw new OpException("Division by 0!");

        mResult = mOp1 / mOp2;

    }
}