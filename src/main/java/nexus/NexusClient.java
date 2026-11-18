
package nexus;

import net.fabricmc.api.ClientModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NexusClient implements ClientModInitializer {

    public static final String MOD_ID = "nexus";

    public static final Logger LOGGER =
            LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitializeClient() {

        LOGGER.info("================================");
        LOGGER.info("       NEXUS CLIENT");
        LOGGER.info("       Version 1.0");
        LOGGER.info("================================");

    }
}
