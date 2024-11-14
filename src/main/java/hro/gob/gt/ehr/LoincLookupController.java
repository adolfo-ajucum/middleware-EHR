package hro.gob.gt.ehr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoincLookupController {

    @Autowired
    private LoincLookupService loincLookupService;


    //@CrossOrigin(origins = {"http://localhost:5173", "http:localhost:3000"})
    @GetMapping("/lookup-loinc")
    public String lookupLoincCode(@RequestParam String loincCode) {
        return loincLookupService.fetchLoincData(loincCode);
    }


}
