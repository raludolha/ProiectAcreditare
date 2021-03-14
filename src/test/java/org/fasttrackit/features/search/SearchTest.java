package org.fasttrackit.features.search;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.fasttrackit.pages.SearchResultsPage;
import org.fasttrackit.steps.serenity.LoginSteps;
import org.fasttrackit.steps.serenity.SearchSteps;
import org.junit.Test;
import utils.BaseTest;
import utils.EnvironmentConstants;

public class SearchTest extends BaseTest {
    @Steps
    private LoginSteps loginSteps;
    @Steps
    private SearchSteps searchSteps;



    @Test
    public void verifyIfProductIsDisplayed(){
        loginSteps.login(EnvironmentConstants.USER_NAME, EnvironmentConstants.USER_PASSWORD);
        searchSteps.search("Hoodie");
        searchSteps.verifyIfProductIsDisplayed("New hoodie");

    }

}
