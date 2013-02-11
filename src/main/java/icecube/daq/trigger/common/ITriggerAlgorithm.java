package icecube.daq.trigger.common;

import icecube.daq.payload.IPayload;
import icecube.daq.trigger.exceptions.TriggerException;

import java.util.Map;

/**
 * Interface for old and new trigger algorithms.
 */
public interface ITriggerAlgorithm
{
    /**
     * Get the earliest payload of interest for this algorithm.
     *
     * @return earlist payload
     */
    IPayload getEarliestPayloadOfInterest();

    /**
     * Get the source ID.
     *
     * @return source ID
     */
    int getSourceId();

    /**
     * Get the configuration ID.
     *
     * @return configuration ID
     */
    int getTriggerConfigId();

    /**
     * Get the ID of the most recent trigger request.
     *
     * @return counter value
     */
    int getTriggerCounter();

    /**
     * Get the map of monitored quantitied for this algorithm.
     *
     * @return map of monitored quantity names and values
     */
    Map<String, Object> getTriggerMonitorMap();

    /**
     * Get trigger name.
     * @return triggerName
     */
    String getTriggerName();

    /**
     * Get the trigger type.
     *
     * @return trigger type
     */
    int getTriggerType();

    /**
     * Has this algorithm been fully configured?
     *
     * @return <tt>true</tt> if the algorithm has been fully configured
     */
    boolean isConfigured();

    /**
     * Run trigger algorithm on the payload.
     *
     * @param payload payload to process
     *
     * @throws TriggerException if there was a problem running the algorithm
     */
    void runTrigger(IPayload payload)
        throws TriggerException;

    /**
     * Set source ID.
     *
     * @param val source ID
     */
    void setSourceId(int val);

    /**
     * Set configuration ID.
     *
     * @param val configuration ID
     */
    void setTriggerConfigId(int val);

    /**
     * Set the trigger manager for this trigger.
     *
     * @param mgr trigger manager
     */
    void setTriggerManager(ITriggerManager mgr);

    /**
     * Set trigger name.
     *
     * @param triggerName trigger name
     */
    void setTriggerName(String triggerName);

    /**
     * Set trigger type.
     *
     * @param val trigger type
     */
    void setTriggerType(int val);
}
