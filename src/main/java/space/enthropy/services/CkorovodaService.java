package space.enthropy.services;

import io.smallrye.common.constraint.NotNull;
import space.enthropy.models.Response;
import space.enthropy.models.SkillRequest;

import javax.validation.Valid;

public interface CkorovodaService {
    /**
     * Sending back:
     * "Очередная сиськожопостримерша,
     * разводит школьников на деньги,
     * флиртует с первым встречным"
     *
     * @param request Request from the Client
     * @return Response, containing hardcoded text
     */
    Response ckorovodaZhopa(@NotNull @Valid SkillRequest request);
}
