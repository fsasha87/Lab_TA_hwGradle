package decorator;

import decorator.pageFactoryUtils.IElement;
import org.openqa.selenium.*;

import java.util.List;

public abstract class ElementDecorator implements WebElement, IElement {
    protected WebElement element;

    public ElementDecorator(WebElement element) {
        this.element = element;
    }

    @Override
    public void click() {
        element.click();
    }

    @Override
    public void submit() {

    }

    @Override
    public void sendKeys(CharSequence... charSequences) {
        element.sendKeys();
    }

    @Override
    public void clear() {
        element.clear();
    }

    @Override
    public String getTagName() {
        return null;
    }

    @Override
    public String getAttribute(String s) {
        return null;
    }

    @Override
    public boolean isSelected() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public String getText() {
        return null;
    }

    @Override
    public List<WebElement> findElements(By by) {
        return null;
    }

    @Override
    public WebElement findElement(By by) {
        return null;
    }

    @Override
    public boolean isDisplayed() {
        return false;
    }

    @Override
    public Point getLocation() {
        return null;
    }

    @Override
    public Dimension getSize() {
        return null;
    }

    @Override
    public Rectangle getRect() {
        return null;
    }

    @Override
    public String getCssValue(String s) {
        return null;
    }

    @Override
    public <X> X getScreenshotAs(OutputType<X> outputType) throws WebDriverException {
        return null;
    }
}
