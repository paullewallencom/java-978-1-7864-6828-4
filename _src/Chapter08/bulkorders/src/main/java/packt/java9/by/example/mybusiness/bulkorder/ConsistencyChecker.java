package packt.java9.by.example.mybusiness.bulkorder;

import packt.java9.by.example.mybusiness.bulkorder.dtos.Order;

/**
 * Checks an order that the items in it are consistent.
 */
public interface ConsistencyChecker {

    /**
     * Checks consistency non imperative.
     *
     * @param order , which to check for consistency
     * @return true if the order is not consistent. false means that the method did not find inconsistency, but does not
     * necessarily mean that it is inconsistent.
     */
    boolean isInconsistent(Order order);
}
