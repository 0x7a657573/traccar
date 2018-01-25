package org.traccar.protocol;

import org.junit.Assert;
import org.junit.Test;
import org.traccar.ProtocolTest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class MeiligaoFrameDecoderTest extends ProtocolTest {

    @Test
    public void testDecode() throws Exception {

        MeiligaoFrameDecoder decoder = new MeiligaoFrameDecoder();

        assertNull(
                decoder.decode(null, null, binary("00")));

        assertEquals(
                binary("2424007b8621700151517899553233323835372e3030302c562c333632372e313835342c4e2c30313034352e323130392c452c302e30302c372c3239303131332c2c2a31347c302e307c347c303030307c303030382c303030357c303235443030303230303541374432327c30367c303030314530353527f40d0a"),
                decoder.decode(null, null, binary("2424007B8621700151517899553233323835372E3030302C562C333632372E313835342C4E2C30313034352E323130392C452C302E30302C372C3239303131332C2C2A31347C302E307C347C303030307C303030382C303030357C303235443030303230303541374432327C30367C303030314530353527F40D0A")));

        assertEquals(
                binary("2424007b8621700151517899553233323835372e3030302c562c333632372e313835342c4e2c30313034352e323130392c452c302e30302c372c3239303131332c2c2a31347c302e307c347c303030307c303030382c303030357c303235443030303230303541374432327c30367c303030314530353527f40d0a"),
                decoder.decode(null, null, binary("002424007B8621700151517899553233323835372E3030302C562C333632372E313835342C4E2C30313034352E323130392C452C302E30302C372C3239303131332C2C2A31347C302E307C347C303030307C303030382C303030357C303235443030303230303541374432327C30367C303030314530353527F40D0A")));

    }

}
