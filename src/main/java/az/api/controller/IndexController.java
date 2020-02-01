package az.api.controller;

import az.api.model.constants.EndPoints;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author knfx094
 */
@RestController
@RequestMapping(EndPoints.INDEX)
public class IndexController {

    @GetMapping
    @ResponseBody
    public ResponseEntity<?> index() {
        return ResponseEntity.ok("{\"message\":\"hello\"}");
    }

}
