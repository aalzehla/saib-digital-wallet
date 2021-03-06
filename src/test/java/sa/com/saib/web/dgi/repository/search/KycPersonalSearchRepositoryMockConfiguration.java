package sa.com.saib.web.dgi.repository.search;

import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Configuration;

/**
 * Configure a Mock version of {@link KycPersonalSearchRepository} to test the
 * application without starting Elasticsearch.
 */
@Configuration
public class KycPersonalSearchRepositoryMockConfiguration {

    @MockBean
    private KycPersonalSearchRepository mockKycPersonalSearchRepository;

}
