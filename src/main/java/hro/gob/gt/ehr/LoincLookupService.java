package hro.gob.gt.ehr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class LoincLookupService {

    private static final String BASE_URL = "http://localhost/fhir/CodeSystem/$lookup?system=http://loinc.org&code=";

    @Autowired
    private RestTemplate restTemplate;

    public String fetchLoincData(String loincCode) {
        String url = BASE_URL + loincCode;
        String response = restTemplate.getForObject(url, String.class);
        System.out.println("Response from LOINC Lookup for code: "+ loincCode + response);
        return response;
    }
}
