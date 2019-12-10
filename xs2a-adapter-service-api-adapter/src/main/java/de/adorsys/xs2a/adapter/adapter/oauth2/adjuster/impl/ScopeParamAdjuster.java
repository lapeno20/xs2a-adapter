package de.adorsys.xs2a.adapter.adapter.oauth2.adjuster.impl;

import de.adorsys.xs2a.adapter.service.oauth.ParamAdjuster;
import de.adorsys.xs2a.adapter.service.oauth.ParamAdjustingResultHolder;
import org.apache.commons.lang3.StringUtils;

import static de.adorsys.xs2a.adapter.service.Oauth2Service.Parameters;

public class ScopeParamAdjuster implements ParamAdjuster {
    private static final String DEFAULT_SCOPE_PARAM_VALUE = "ais";

    @Override
    public ParamAdjustingResultHolder adjustParam(ParamAdjustingResultHolder adjustingResultHolder,
                                                  Parameters parametersFromTpp) {
        String scope = parametersFromTpp.getScope();

        if (StringUtils.isBlank(scope)) {
            scope = DEFAULT_SCOPE_PARAM_VALUE;
        }

        adjustingResultHolder.addAdjustedParam(Parameters.SCOPE, scope);

        return adjustingResultHolder;
    }
}
