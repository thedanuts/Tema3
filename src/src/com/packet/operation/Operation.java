package src.com.packet.operation;

import src.com.packet.basic.interfaces.ISetter;

/**
 * Created by Danuts on 10/29/2014.
 */
public abstract class Operation implements ISetter{

    protected int mResult;
    public int mOp1, mOp2;

    public Operation(int op1, int op2) {
        mOp1 = op1;
        mOp2 = op2;
        mResult = 0;
    }

    public int getResult() {

        return mResult;

    }

    public abstract void execute();
    public void print(){
        System.out.println(mOp1 + getOp() + mOp2 + " = " + mResult);
    }
    /**
     *
     * @return false if the operation's result is nonzero, true on the contrary
     */

    public boolean checkIfZero(){
        if (mResult == 0)
        {
            System.out.println("Result is 0!");
            return true;
        }

        return false;
    }
}
