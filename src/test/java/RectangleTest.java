import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(5.3, 3.5);

    @Test
    public void RectangleConstructorSetsLengthTest() {
        Assert.assertEquals(5.3, rectangle.getLength(), 0);
    }

    @Test
    public void RectangleConstructorSetsWidthTest() {
        Assert.assertEquals(3.5, rectangle.getWidth(), 0);
    }

    @Test
    public void setLengthTest() {
        rectangle.setLength(7.2);
        Assert.assertEquals(7.2, rectangle.getLength(), 0);
    }

    @Test
    public void setWidthTest() {
        rectangle.setWidth(4.6);
        Assert.assertEquals(4.6, rectangle.getWidth(), 0);
    }

    @Test
    public void getAreaTest() {
        Assert.assertEquals(18.55, rectangle.getArea(), 0);
    }
}