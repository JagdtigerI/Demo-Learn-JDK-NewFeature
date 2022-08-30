package TextBlock;

public class Demo {
    public static void main(String[] args) {
        String text = """
                This is a text block.
                It can be used to display
                long text.
                """;
        System.out.println(text);

        String text2 = """
                <html>
                  <body>
                      <p>Hello, world</p>
                  </body>
                </html>
                """;
        System.out.println(text2);
    }
}
