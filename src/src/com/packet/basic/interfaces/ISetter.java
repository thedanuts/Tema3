package src.com.packet.basic.interfaces;

/**
 * Created by Danuts on 10/29/2014.
 */
public interface ISetter {

     /**
     * Print the operation name
     * @return
     */

    public String getOp();

    /**
     *
     * @param valueToCheck Check if this is greater than a value specific to each operation
     * @return
     */

    public boolean greaterThan(int valueToCheck);
}
