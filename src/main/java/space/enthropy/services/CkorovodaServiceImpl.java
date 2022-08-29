package space.enthropy.services;

import io.quarkus.cache.CacheResult;
import io.smallrye.common.constraint.NotNull;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import space.enthropy.models.Command;
import space.enthropy.models.Response;
import space.enthropy.models.SkillRequest;

import javax.enterprise.context.ApplicationScoped;
import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;

@ApplicationScoped
public class CkorovodaServiceImpl implements CkorovodaService {
    private static final Logger LOGGER = LoggerFactory.getLogger(CkorovodaServiceImpl.class);

    private static final List<String> CKOROVODA_ASKING = Arrays.asList("кто такая скоровода", "расскажи про скороводу",
            "что ты знаешь о скоровода", "что ты знаешь о скороводе", "расскажи о скоровода", "расскажи о скороводе");

    @Override
    @CacheResult(cacheName = "ckorovoda-cache")
    public Response ckorovodaZhopa(@NotNull @Valid SkillRequest request) {
        LOGGER.info("Upcoming Request in Service layer is: '{}'", request);
        return CKOROVODA_ASKING.stream().filter(item -> StringUtils.containsAnyIgnoreCase(request.getRequest().getOriginalUtterance(),
                item)).count() > 0L ? Response.builder()
                .text("Очередная сиськожопостримерша, разводит школьников на деньги, флиртует с первым встречным")
                .tts("Очередн+ая с+исько ж+опо стр+имерша, разводит шк+ольников на д+еньги, флирт+ует с п+ервым встр+ечным")
                .version("1.0")
                .build() : Response.builder()
                .text(Command.UNKNOWN.getText())
                .tts(Command.UNKNOWN_TTS.getText())
                .version("1.0")
                .build();
    }
}
