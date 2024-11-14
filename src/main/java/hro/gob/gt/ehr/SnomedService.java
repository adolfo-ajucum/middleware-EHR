package hro.gob.gt.ehr;

import org.apache.http.client.utils.URIBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class SnomedService {

    private static final String BASE_URL = "https://snowstorm.snomedtools.org/fhir/ValueSet/$expand";

    @Autowired
    private RestTemplate restTemplate;

    //Reason Encounter
    public String fetchSnomedEncounterReason(String filter){
        String respuesta = "";
        try {
            URI uri = new URIBuilder(BASE_URL)
                    .addParameter("url", "http://snomed.info/sct/449081005/version/20240930?fhir_vs=ecl/<404684003%20OR%20<71388002%20OR%20<243796009%20OR%20<272379006")
                    .addParameter("count", "20")
                    .addParameter("displayLanguage", "es")
                    .addParameter("filter", filter)
                    .build();

            System.out.println("FHIR Encounter Reason URL: " + uri.toString());
            respuesta = restTemplate.getForObject(uri, String.class);
            return respuesta;
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return "Ha ocurrido un error al obtener la URL";
        }
    }

    //Diagnostico
    public String fetchSnomedDiagnostic(String filter){
        String respuesta = "";
        try {
            URI uri = new URIBuilder(BASE_URL)
                    .addParameter("url", "http://snomed.info/sct/449081005/version/20240930?fhir_vs=ecl/<404684003")
                    .addParameter("count", "20")
                    .addParameter("displayLanguage", "es")
                    .addParameter("filter", filter)
                    .build();

            System.out.println("FHIR Encounter Reason URL: " + uri.toString());
            respuesta = restTemplate.getForObject(uri, String.class);
            return respuesta;
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return "Ha ocurrido un error al obtener la URL";
        }
    }

    //Procedimiento
    public String fetchSnomedProcedure(String filter){
        String respuesta = "";
        try {
            URI uri = new URIBuilder(BASE_URL)
                    .addParameter("url", "http://snomed.info/sct/449081005/version/20240930?fhir_vs=ecl/<71388002")
                    .addParameter("count", "20")
                    .addParameter("displayLanguage", "es")
                    .addParameter("filter", filter)
                    .build();

            System.out.println("FHIR Encounter Reason URL: " + uri.toString());
            respuesta = restTemplate.getForObject(uri, String.class);
            return respuesta;
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return "Ha ocurrido un error al obtener la URL";
        }
    }

    //Lateralidad
    public String fetchSnomedLaterality(String filter){
        String respuesta = "";
        try {
            URI uri = new URIBuilder(BASE_URL)
                    .addParameter("url", "http://snomed.info/sct/449081005/version/20240930?fhir_vs=ecl/<182353008")
                    .addParameter("count", "20")
                    .addParameter("displayLanguage", "es")
                    .addParameter("filter", filter)
                    .build();

            System.out.println("FHIR Encounter Reason URL: " + uri.toString());
            respuesta = restTemplate.getForObject(uri, String.class);
            return respuesta;
        } catch (URISyntaxException e) {
            e.printStackTrace();
            return "Ha ocurrido un error al obtener la URL";
        }
    }
}
