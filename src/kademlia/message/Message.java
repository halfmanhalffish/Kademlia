package kademlia.message;

import java.net.InetAddress;

public interface Message extends Streamable
{

    /**
     * The unique code for the message type, used to differentiate all messages
     * from each other. Since this is of <code>byte</code> type there can
     * be at most 256 different message types.
     *
     * @return byte A unique code representing the message type
     * */
    public byte code();

    /**
     * Specify the internet address where the message that this message responds to originated.
     */
    void setOrigin(InetAddress address, int port);
}
