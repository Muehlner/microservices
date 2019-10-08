package alexandria.uoldiveo.catalog;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient("service-catalog")
interface CatalogRestClient {

    @GetMapping("/catalog/list")
    List<String> list();

}
