package top.emanjusaka.eim.common.route.algorithm.consistenthash;

import top.emanjusaka.eim.common.route.RouteHandle;

import java.util.List;

/**
 * @description:
 * @author: lld
 * @version: 1.0
 */
public class ConsistentHashHandle implements RouteHandle {

    //TreeMap
    private AbstractConsistentHash hash;

    public void setHash(AbstractConsistentHash hash) {
        this.hash = hash;
    }

    @Override
    public String routeServer(List<String> values, String key) {
        return hash.process(values, key);
    }
}
