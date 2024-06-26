// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.support.generated;

import com.azure.core.credential.AccessToken;
import com.azure.core.http.HttpClient;
import com.azure.core.management.AzureEnvironment;
import com.azure.core.management.profile.AzureProfile;
import com.azure.core.test.http.MockHttpResponse;
import com.azure.resourcemanager.support.SupportManager;
import com.azure.resourcemanager.support.models.Consent;
import com.azure.resourcemanager.support.models.ContactProfile;
import com.azure.resourcemanager.support.models.PreferredContactMethod;
import com.azure.resourcemanager.support.models.QuotaChangeRequest;
import com.azure.resourcemanager.support.models.QuotaTicketDetails;
import com.azure.resourcemanager.support.models.SecondaryConsent;
import com.azure.resourcemanager.support.models.ServiceLevelAgreement;
import com.azure.resourcemanager.support.models.SeverityLevel;
import com.azure.resourcemanager.support.models.SupportEngineer;
import com.azure.resourcemanager.support.models.SupportTicketDetails;
import com.azure.resourcemanager.support.models.TechnicalTicketDetails;
import com.azure.resourcemanager.support.models.UserConsent;
import java.nio.charset.StandardCharsets;
import java.time.OffsetDateTime;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

public final class SupportTicketsCreateMockTests {
    @Test
    public void testCreate() throws Exception {
        String responseStr
            = "{\"properties\":{\"supportTicketId\":\"bejdcn\",\"description\":\"qqmoaku\",\"problemClassificationId\":\"gm\",\"problemClassificationDisplayName\":\"rwr\",\"severity\":\"moderate\",\"enrollmentId\":\"twaenuuzko\",\"require24X7Response\":false,\"advancedDiagnosticConsent\":\"No\",\"problemScopingQuestions\":\"rfdwoyu\",\"supportPlanId\":\"ziuiefozbhdm\",\"contactDetails\":{\"firstName\":\"mlmz\",\"lastName\":\"hoftr\",\"preferredContactMethod\":\"email\",\"primaryEmailAddress\":\"equi\",\"additionalEmailAddresses\":[\"icslfaoq\",\"piyylhalnswhccsp\"],\"phoneNumber\":\"aivwitqscywu\",\"preferredTimeZone\":\"gwol\",\"country\":\"h\",\"preferredSupportLanguage\":\"zbwemh\"},\"serviceLevelAgreement\":{\"startTime\":\"2021-04-14T21:32:09Z\",\"expirationTime\":\"2021-08-12T10:49:45Z\",\"slaMinutes\":73661757},\"supportEngineer\":{\"emailAddress\":\"msweypqwdxggicc\"},\"supportPlanType\":\"xqhuexm\",\"supportPlanDisplayName\":\"tlstvlzywem\",\"title\":\"zrncsdt\",\"problemStartTime\":\"2021-07-01T02:09:13Z\",\"serviceId\":\"siypbs\",\"serviceDisplayName\":\"ytguslf\",\"status\":\"dcygqukyhejhz\",\"createdDate\":\"2021-04-26T05:02:54Z\",\"modifiedDate\":\"2021-04-29T01:54:20Z\",\"fileWorkspaceName\":\"elolppvksrpqvuj\",\"isTemporaryTicket\":\"Yes\",\"technicalTicketDetails\":{\"resourceId\":\"twdw\"},\"quotaTicketDetails\":{\"quotaChangeRequestSubType\":\"swibyr\",\"quotaChangeRequestVersion\":\"l\",\"quotaChangeRequests\":[{\"region\":\"fwpracstwi\",\"payload\":\"khevxccedc\"},{\"region\":\"md\",\"payload\":\"dnwzxltjcvnhltiu\"},{\"region\":\"xnavvwxq\",\"payload\":\"y\"},{\"region\":\"nyowxwlmdjrkvfg\",\"payload\":\"fvpdbo\"}]},\"secondaryConsent\":[{\"userConsent\":\"Yes\",\"type\":\"j\"},{\"userConsent\":\"Yes\",\"type\":\"rribd\"},{\"userConsent\":\"Yes\",\"type\":\"ipqkghvxndzwm\"},{\"userConsent\":\"Yes\",\"type\":\"ajpjo\"}]},\"id\":\"wkqnyhg\",\"name\":\"ij\",\"type\":\"jivfxzsjabib\"}";

        HttpClient httpClient
            = response -> Mono.just(new MockHttpResponse(response, 200, responseStr.getBytes(StandardCharsets.UTF_8)));
        SupportManager manager = SupportManager.configure()
            .withHttpClient(httpClient)
            .authenticate(tokenRequestContext -> Mono.just(new AccessToken("this_is_a_token", OffsetDateTime.MAX)),
                new AzureProfile("", "", AzureEnvironment.AZURE));

        SupportTicketDetails response = manager.supportTickets()
            .define("ao")
            .withDescription("jervtia")
            .withProblemClassificationId("xsdszuempsb")
            .withSeverity(SeverityLevel.HIGHESTCRITICALIMPACT)
            .withAdvancedDiagnosticConsent(Consent.NO)
            .withContactDetails(new ContactProfile().withFirstName("fn")
                .withLastName("ckw")
                .withPreferredContactMethod(PreferredContactMethod.EMAIL)
                .withPrimaryEmailAddress("zqwhxxbuyqaxzfeq")
                .withAdditionalEmailAddresses(Arrays.asList("priolx", "rjaltolmncw"))
                .withPhoneNumber("bqwcsdbnwdcf")
                .withPreferredTimeZone("ucqdpfuvglsb")
                .withCountry("jcanvxbvtvudut")
                .withPreferredSupportLanguage("cormr"))
            .withTitle("dsg")
            .withServiceId("mkycgra")
            .withSupportTicketId("ulpqblylsyxkqjn")
            .withEnrollmentId("yvpnqicvinvkjj")
            .withRequire24X7Response(true)
            .withProblemScopingQuestions("uukzclewyhmlw")
            .withSupportPlanId("ztzp")
            .withServiceLevelAgreement(new ServiceLevelAgreement())
            .withSupportEngineer(new SupportEngineer())
            .withProblemStartTime(OffsetDateTime.parse("2021-04-29T00:37:52Z"))
            .withFileWorkspaceName("mqoefkifrvtpuqu")
            .withTechnicalTicketDetails(new TechnicalTicketDetails().withResourceId("kfbtndoaongbjc"))
            .withQuotaTicketDetails(new QuotaTicketDetails().withQuotaChangeRequestSubType("jitcjedftwwaez")
                .withQuotaChangeRequestVersion("jvdcpzfoqouic")
                .withQuotaChangeRequests(
                    Arrays.asList(new QuotaChangeRequest().withRegion("rzgszufoxci").withPayload("p"),
                        new QuotaChangeRequest().withRegion("oamciodh").withPayload("azxkhnzbonlwnto"),
                        new QuotaChangeRequest().withRegion("okdwb").withPayload("kszzcmrvexztv"),
                        new QuotaChangeRequest().withRegion("qgsfraoyzkoow").withPayload("mnguxawqaldsyu"))))
            .withSecondaryConsent(
                Arrays.asList(new SecondaryConsent().withUserConsent(UserConsent.YES).withType("qfobwyz"),
                    new SecondaryConsent().withUserConsent(UserConsent.YES).withType("kutwpf"),
                    new SecondaryConsent().withUserConsent(UserConsent.YES).withType("m"),
                    new SecondaryConsent().withUserConsent(UserConsent.NO).withType("dsnfdsdoakgtdl")))
            .create();

        Assertions.assertEquals("bejdcn", response.supportTicketId());
        Assertions.assertEquals("qqmoaku", response.description());
        Assertions.assertEquals("gm", response.problemClassificationId());
        Assertions.assertEquals(SeverityLevel.MODERATE, response.severity());
        Assertions.assertEquals("twaenuuzko", response.enrollmentId());
        Assertions.assertEquals(false, response.require24X7Response());
        Assertions.assertEquals(Consent.NO, response.advancedDiagnosticConsent());
        Assertions.assertEquals("rfdwoyu", response.problemScopingQuestions());
        Assertions.assertEquals("ziuiefozbhdm", response.supportPlanId());
        Assertions.assertEquals("mlmz", response.contactDetails().firstName());
        Assertions.assertEquals("hoftr", response.contactDetails().lastName());
        Assertions.assertEquals(PreferredContactMethod.EMAIL, response.contactDetails().preferredContactMethod());
        Assertions.assertEquals("equi", response.contactDetails().primaryEmailAddress());
        Assertions.assertEquals("icslfaoq", response.contactDetails().additionalEmailAddresses().get(0));
        Assertions.assertEquals("aivwitqscywu", response.contactDetails().phoneNumber());
        Assertions.assertEquals("gwol", response.contactDetails().preferredTimeZone());
        Assertions.assertEquals("h", response.contactDetails().country());
        Assertions.assertEquals("zbwemh", response.contactDetails().preferredSupportLanguage());
        Assertions.assertEquals("zrncsdt", response.title());
        Assertions.assertEquals(OffsetDateTime.parse("2021-07-01T02:09:13Z"), response.problemStartTime());
        Assertions.assertEquals("siypbs", response.serviceId());
        Assertions.assertEquals("elolppvksrpqvuj", response.fileWorkspaceName());
        Assertions.assertEquals("twdw", response.technicalTicketDetails().resourceId());
        Assertions.assertEquals("swibyr", response.quotaTicketDetails().quotaChangeRequestSubType());
        Assertions.assertEquals("l", response.quotaTicketDetails().quotaChangeRequestVersion());
        Assertions.assertEquals("fwpracstwi", response.quotaTicketDetails().quotaChangeRequests().get(0).region());
        Assertions.assertEquals("khevxccedc", response.quotaTicketDetails().quotaChangeRequests().get(0).payload());
        Assertions.assertEquals(UserConsent.YES, response.secondaryConsent().get(0).userConsent());
        Assertions.assertEquals("j", response.secondaryConsent().get(0).type());
    }
}
