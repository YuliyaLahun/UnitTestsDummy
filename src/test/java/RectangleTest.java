import org.junit.Assert;
import org.junit.Test;

public class RectangleTest {

    Rectangle rectangle = new Rectangle(3, 5);

    @Test
    public void RectangleConstructorSetsLengthTest() {
        Assert.assertEquals(3, rectangle.getLength(), 0);
    }

    @Test
    public void RectangleConstructorSetsWidthTest() {
        Assert.assertEquals(5, rectangle.getWidth(), 0);
    }

    @Test
    public void setLengthTest() {
        rectangle.setLength(7);
        Assert.assertEquals(7, rectangle.getLength(), 0);
    }

    @Test
    public void setWidthTest() {
        rectangle.setWidth(3);
        Assert.assertEquals(3, rectangle.getWidth(), 0);
    }

    @Test
    public void getAreaTest() {
        Assert.assertEquals(15, rectangle.getArea(), 0);
    }
}