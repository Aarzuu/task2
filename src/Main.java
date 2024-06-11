public class Main {
    public static void main(String[] args) {
        Stck obj = new Stck();
        obj.push(5);
        obj.push("yeddi");
        obj.push(true);
        obj.push(32);

        obj.pop();

        obj.peek();

        obj.isempty();

        obj.size();
    }
}