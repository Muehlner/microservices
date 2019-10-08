package alexandria.uoldiveo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("catalog")
public class CatalogController {

    private static int count = 0;

    @GetMapping("list")
    public List<String> list(){
        System.out.println(++count);
        return Arrays.asList("Catalog 1", "Catalog 2", "Catalog 3", "Catalog 4");
    }

}
