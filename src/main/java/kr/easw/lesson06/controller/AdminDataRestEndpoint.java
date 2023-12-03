package kr.easw.lesson06.controller;
import kr.easw.lesson06.model.dto.TextDataDto;
import kr.easw.lesson06.service.TextDataService;
import kr.easw.lesson06.service.UserDataService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@@ -18,16 +20,15 @@
public class AdminDataRestEndpoint {
    private final TextDataService textDataService;

    // 이 메서드의 엔드포인트를 /api/v1/data/add로 설정합니다. POST만 허용됩니다.
    @PostMapping("/add")
    public ModelAndView addText(@RequestParam Map<String, String> data, @RequestBody Map<String, String> body) {
        // 만약 body로 값이 넘어왔다면 body를, 그렇지 않다면 data를 사용합니다.
        // 이는 form-data로 넘어왔는지, JSON으로 넘어왔는지에 따라 값이 달라지기 때문입니다.
        if (data.containsKey("text"))
            textDataService.addText(new TextDataDto(0L, data.get("text")));
        else if (body.containsKey("text"))
            textDataService.addText(new TextDataDto(0L, body.get("text")));
        @PostMapping(value = "/add",consumes = {MediaType.APPLICATION_FORM_URLENCODED_VALUE})
        public ModelAndView addText(@RequestParam MultiValueMap<String, String> data) {
            textDataService.addText(new TextDataDto(0L, data.getFirst("text")));
            return new ModelAndView("redirect:/admin?success=true");
        }

        @PostMapping(value = "/add",consumes = {MediaType.APPLICATION_JSON_VALUE})
        public ModelAndView addText(@RequestBody Map<String, String> body) {
            textDataService.addText(new TextDataDto(0L, body.get("text")));
            return new ModelAndView("redirect:/admin?success=true");
        }
    }