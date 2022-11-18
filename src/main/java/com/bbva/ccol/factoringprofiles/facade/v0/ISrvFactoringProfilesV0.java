package com.bbva.ccol.factoringprofiles.facade.v0;

import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;

public interface ISrvFactoringProfilesV0 {

    ServiceResponse getProfiles(Boolean prueba);
}
