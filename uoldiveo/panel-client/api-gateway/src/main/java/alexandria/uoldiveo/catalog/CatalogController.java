package alexandria.uoldiveo.catalog;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("catalog")
class CatalogController {

    private CatalogRestClient catalogRestClient;

    CatalogController(CatalogRestClient catalogRestClient) {
        this.catalogRestClient = catalogRestClient;
    }

    @CrossOrigin
    @GetMapping("list")
    List<String> list() {
        return catalogRestClient.list();
    }
}
