package icecube.daq.trigger.exceptions;

/**
 * Used to mark unimplemented code.
 */
public class UnimplementedError
    extends Error
{
    /**
     * Create an unimplemented code error.
     */
    public UnimplementedError()
    {
        super("Unimplemented");
    }
}
