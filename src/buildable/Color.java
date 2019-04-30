package buildable;

public class Color
{
  private static final int DEFAULT_ALPHA = 0;
  public int red;
  public int green;
  public int blue;
  public int alpha;

  public Color(java.awt.Color color)
  {
    this(color.getRed(), color.getGreen(), color.getBlue());
  }

  public Color(Color original)
  {
    this.red = original.red;
    this.green = original.green;
    this.blue = original.blue;
    this.alpha = original.alpha;
  }

  public Color(int red, int green, int blue)
  {
    this(red, green, blue, 0);
  }

  public Color(int red, int green, int blue, int brightness)
  {
    this.red = red;
    this.green = green;
    this.blue = blue;
    this.alpha = brightness;
  }

  public Color copy()
  {
    return new Color(this.red, this.green, this.blue, this.alpha);
  }

  public java.awt.Color getJavaAwtColorNegative()
  {
    return getNegative().getJavaAwtColor();
  }

  public Color getNegative()
  {
    return new Color(negate(this.red), negate(this.green), negate(this.blue), this.alpha);
  }

  private int negate(int value)
  {
    return 255 - value;
  }

  public java.awt.Color getJavaAwtColor()
  {
    return new java.awt.Color(this.red, this.green, this.blue);
  }

  public void setAlpha(int alpha)
  {
    this.alpha = alpha;
  }

  public int getAlpha()
  {
    return this.alpha;
  }

  public int getBlue()
  {
    return this.blue;
  }

  public int getGreen()
  {
    return this.green;
  }

  public int getRed()
  {
    return this.red;
  }
}
