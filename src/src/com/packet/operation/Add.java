package src.com.packet.operation;

import src.com.packet.basic.interfaces.ISetter;

/**
 * Created by Danuts on 10/29/2014.
 */
public class Add extends Operation implements ISetter {

    public Add(int op1, int op2) {
        super(op1, op2);
    }

    /*@Override
    public void setValue(int value) {
        mOp1.setValue(value);
    }*/

    @Override
    public String getOp() {
        return " + ";
    }

    @Override
    public void print() {
        System.out.println(mOp1+getOp()+mOp2+" = "+mResult);
    }

    @Override
    public void execute() {
        mResult=mOp1+mOp2;
    }

    @Override
    public boolean greaterThan(int valueToCheck) {

        if (valueToCheck > 255)
            return true;
        return false;
    }
}
