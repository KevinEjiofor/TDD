package stringBuilder;

public class Main {
    public static void main(String[] args) {

        UndoStringBuilder usb = new UndoStringBuilder();

        usb.append("to be or not to be");
        System.out.println(usb);
        usb.replace(3, 5, "eat");
        System.out.println(usb);
        usb.replace(17, 19, "eat");
        System.out.println(usb);
        usb.reverse();
        System.out.println(usb);

        System.out.println();

        usb.undo();
        System.out.println(usb);
        usb.undo();
        System.out.println(usb);
        usb.undo();
        System.out.println(usb);



    }
}
