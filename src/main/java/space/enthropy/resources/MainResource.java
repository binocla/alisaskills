package space.enthropy.resources;

import io.smallrye.common.constraint.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import space.enthropy.models.Response;
import space.enthropy.models.SkillRequest;
import space.enthropy.services.CkorovodaService;

import javax.inject.Inject;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/ckorovoda")
public class MainResource {
    private static final Logger LOGGER = LoggerFactory.getLogger(MainResource.class);
    @Inject
    CkorovodaService ckorovodaService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response ckorovoda(@NotNull @Valid SkillRequest request) {
        LOGGER.info("Upcoming Request in Resource layer is: '{}'", request);
        return ckorovodaService.ckorovodaZhopa(request);
    }
}