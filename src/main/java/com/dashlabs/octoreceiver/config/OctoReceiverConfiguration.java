package com.dashlabs.octoreceiver.config;

import io.dropwizard.Configuration;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.Map;

/**
 * User: blangel
 * Date: 1/7/14
 * Time: 6:06 PM
 */
public class OctoReceiverConfiguration extends Configuration {

    @Valid
    @NotNull
    private final String script;

    @Valid
    @NotNull
    private final Boolean onlyUseScriptArgs;

    private final Map<String, String> repositoryMapping;

    private final Map<String, String> repositoryDependencyMapping;

    @Valid
    @NotNull
    private final EmailConfiguration emailConfiguration;

    @Valid
    @NotNull
    private final String failureSubjectPrefix;

    @Valid
    @NotNull
    private final String failureBodyPrefix;

    @Valid
    @NotNull
    private final String failureEmail;

    private final CodeDeploymentConfiguration codeDeploymentConfiguration;

    private OctoReceiverConfiguration() {
        this(null, null, null, null, null, null, null, null, null);
    }

    public OctoReceiverConfiguration(String script, Boolean onlyUseScriptArgs, Map<String, String> repositoryMapping, Map<String, String> repositoryDependencyMapping,
                                     EmailConfiguration emailConfiguration, String failureSubjectPrefix, String failureBodyPrefix,
                                     String failureEmail, CodeDeploymentConfiguration codeDeploymentConfiguration) {
        this.script = script;
        this.onlyUseScriptArgs = onlyUseScriptArgs;
        this.repositoryMapping = repositoryMapping;
        this.repositoryDependencyMapping = repositoryDependencyMapping;
        this.emailConfiguration = emailConfiguration;
        this.failureSubjectPrefix = failureSubjectPrefix;
        this.failureBodyPrefix = failureBodyPrefix;
        this.failureEmail = failureEmail;
        this.codeDeploymentConfiguration = codeDeploymentConfiguration;
    }

    public String getScript() {
        return script;
    }

    public Boolean getOnlyUseScriptArgs() {
        return onlyUseScriptArgs;
    }

    public Map<String, String> getRepositoryMapping() {
        return repositoryMapping;
    }

    public Map<String, String> getRepositoryDependencyMapping() {
        return repositoryDependencyMapping;
    }

    public EmailConfiguration getEmailConfiguration() {
        return emailConfiguration;
    }

    public String getFailureSubjectPrefix() {
        return failureSubjectPrefix;
    }

    public String getFailureBodyPrefix() {
        return failureBodyPrefix;
    }

    public String getFailureEmail() {
        return failureEmail;
    }

    public CodeDeploymentConfiguration getCodeDeploymentConfiguration() {
        return codeDeploymentConfiguration;
    }
}
