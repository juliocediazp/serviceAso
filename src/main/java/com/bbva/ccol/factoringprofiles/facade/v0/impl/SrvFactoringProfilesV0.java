package com.bbva.ccol.factoringprofiles.facade.v0.impl;


import com.bbva.ccol.factoringprofiles.facade.v0.ISrvFactoringProfilesV0;
import com.bbva.jee.arq.spring.core.catalog.gabi.ServiceResponse;
import com.bbva.jee.arq.spring.core.servicing.annotations.SMC;
import com.bbva.jee.arq.spring.core.servicing.annotations.SN;
import com.bbva.jee.arq.spring.core.servicing.annotations.VN;
import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiResponse;
import com.wordnik.swagger.annotations.ApiResponses;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Service;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

@Path("/v0")
@VN(vnn = "v0")
@SN(registryID = "SNCO20200043", logicalID = "factoring")
@Api(value = "/factoring/v0", description = "PRUEBA")
@Produces({MediaType.APPLICATION_JSON})
@Consumes({MediaType.APPLICATION_JSON})
@Service(value = "srvFactoringProfilesV0")
public class SrvFactoringProfilesV0 implements ISrvFactoringProfilesV0 {

    private static final Log log = LogFactory.getLog(SrvFactoringProfilesV0.class);


    @Override
    @ApiOperation(value = "PRUEBA", response = ServiceResponse.class)
    @ApiResponses(value = {
            @ApiResponse(code = -1, message = "aliasGCE1"),
            @ApiResponse(code = -1, message = "aliasGCE2"),
            @ApiResponse(code = 200, message = "Found", response = ServiceResponse.class),
            @ApiResponse(code = 500, message = "Technical Error")})
    @GET
    @Path("/profiles/{profile-id}")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    @SMC(registryID = "SMGG20210689", logicalID = "getProfiles", forcedCatalog = "gabiCatalog")
    public ServiceResponse getProfiles(@PathParam(value = "profile-id") Boolean prueba) {
        log.info(prueba);
        return ServiceResponse.data(!prueba).build();
    }
}
