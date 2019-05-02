package framework

import spock.lang.Specification
import zopa.calculator.service.api.RenderService
import zopa.calculator.service.impl.RenderServiceImpl

class FindAndReplaceCommandSpec extends Specification {

    RenderService renderService
    def setup() {
        renderService = new RenderServiceImpl()
    }

    def "mytest"(){
        given: "a text that contains a command"
        String html = "<haha> @header.html @body.html text @body.html"

        Map<String,String> commands = new HashMap<>()
        commands.put("@header.html","<div> header </div>")
        commands.put("@body.html","<div> body </div>")

        when: "i replace the commands"
        String renderHtml = renderService.renderHtml(commands, html)

        then:
        renderHtml == "<haha> <div> header </div> <div> body </div> text <div> body </div>"
    }


}