package org.wikipedia.tests;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.Test;
import org.wikipedia.fw.HelperBase;


public class ArticleTest extends HelperBase {

    public ArticleTest(AppiumDriver driver) {
        super(driver);
    }

    @Test
    public void testAddArticleToFavoritesAndRemove() {
        System.out.println("app opened");

    }
}
