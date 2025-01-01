@Test
public void testExampleDomain() {
    // Set up the WebDriver
    System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
    WebDriver driver = new ChromeDriver();

    try {
        // Navigate to the page
        driver.get("https://example.com");

        // Validate the title
        String expectedTitle = "Example Domain";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);

        // Interact with the hyperlink
        WebElement link = driver.findElement(By.xpath("//a[text()='More information...']"));
        link.click();

        // Validate the navigation to the link's destination
        String currentUrl = driver.getCurrentUrl();
        assertEquals("https://www.iana.org/domains/example", currentUrl);

    } finally {
        // Close the browser
        driver.quit();
    }
}
