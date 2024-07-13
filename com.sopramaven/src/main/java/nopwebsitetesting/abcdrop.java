package nopwebsitetesting;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;



public class abcdrop {

    public static void main(String[] args) throws InterruptedException {
        // Setup WebDriver
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        // JavaScript to perform drag and drop based on positions
        String script = "function simulateDragAndDrop(sourceX, sourceY, targetX, targetY) {" +
                "    var target = document.elementFromPoint(sourceX, sourceY);" +
                "    var targetRect = target.getBoundingClientRect();" +
                "    var centerX = targetRect.left + targetRect.width / 2;" +
                "    var centerY = targetRect.top + targetRect.height / 2;" +
                "    var mouseDownEvent = new MouseEvent('mousedown', {" +
                "        view: window," +
                "        bubbles: true," +
                "        cancelable: true," +
                "        clientX: centerX," +
                "        clientY: centerY" +
                "    });" +
                "    target.dispatchEvent(mouseDownEvent);" +
                "    var mouseMoveEvent = new MouseEvent('mousemove', {" +
                "        view: window," +
                "        bubbles: true," +
                "        cancelable: true," +
                "        clientX: targetX," +
                "        clientY: targetY" +
                "    });" +
                "    document.dispatchEvent(mouseMoveEvent);" +
                "    var mouseUpEvent = new MouseEvent('mouseup', {" +
                "        view: window," +
                "        bubbles: true," +
                "        cancelable: true," +
                "        clientX: targetX," +
                "        clientY: targetY" +
                "    });" +
                "    document.dispatchEvent(mouseUpEvent);" +
                "}" +
                "simulateDragAndDrop(8, 18, 450, 100);";

        // Execute the JavaScript code
        ((JavascriptExecutor) driver).executeScript(script);

        // Give some time to observe the result
        Thread.sleep(5000);

        // Close the browser
        driver.quit();
    }
}
