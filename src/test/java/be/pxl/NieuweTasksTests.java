package be.pxl;

import com.microsoft.playwright.*;
import org.junit.jupiter.api.Test;

public class NieuweTasksTests {

    @Test
    public void Task1() {
        try (Playwright pw = Playwright.create()) { // guarantee the browser and pages will be closed in the end
            //BrowserType.LaunchOptions launchOptions = new BrowserType.LaunchOptions().setHeadless(false);
            Browser browser = pw.chromium().launch();
            Page page = browser.newPage();
            page.navigate("http://localhost:5001/app/catalog.html");
            System.out.println("title " + page.title());
            page.locator(".event-name").all().forEach(text -> {
                System.out.println("Event: " + text.innerText());
            });
        }
    }



}