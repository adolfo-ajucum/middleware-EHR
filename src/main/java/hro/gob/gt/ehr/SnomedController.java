package hro.gob.gt.ehr;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SnomedController {

    @Autowired
    private SnomedService snomedService;

    //Encounter Reason
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/snomedctEncounterReason")
    public String SnomedctEncounterReason(@RequestParam String filter) {
        return snomedService.fetchSnomedEncounterReason(filter);
    }

    //Diagnostico
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/snomedctDiagnostic")
    public String SnomedctDiagnostic(@RequestParam String filter) {
        return snomedService.fetchSnomedDiagnostic(filter);
    }


    //Procedure
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/snomedctProcedure")
    public String SnomedctProcedure(@RequestParam String filter) {
        return snomedService.fetchSnomedProcedure(filter);
    }

    //Laterality
    @CrossOrigin(origins = "http://localhost:5173")
    @GetMapping("/snomedcLaterality")
    public String SnomedctLateracity(@RequestParam String filter) {
        return snomedService.fetchSnomedLaterality(filter);
    }
}
