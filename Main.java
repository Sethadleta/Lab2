class Main 
{
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

  int total = 55 * 9;
  System.out.println("Total M&M's :" + total);

  double blue = total * .24;
  System.out.println("Blue M&M's :" + blue);
  
  double brown = total * .13;
  System.out.println("Brown M&M's :" + brown);

  double green = total * .16;
  System.out.println("Green M&M's :" + green);

  double red = total * .13;
  System.out.println("Red M&M's :" + red);

  double yellow = total * .14;
  System.out.println("Yellow M&M's :" + yellow);

  double orange = total * .20;
  System.out.println("Orange M&M's :" + orange);

  double sum = Math.floor(blue + brown + green + red + yellow + orange);
  System.out.println("Sum of M&M's :" + sum);

  if (blue > brown && green > red)
  System.out.println("Blue over Brown and Green over Red");

  if (brown <= orange)
  System.out.println("Brown is less than or equal to orange");

  if (sum == total)
  System.out.println("Numbers match");
  }
}