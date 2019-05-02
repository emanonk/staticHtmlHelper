package zopa.calculator.service.api;

import java.util.Map;

public interface RenderService {

    String renderHtml(Map<String,String> commands, String htmlTemplate);
}
