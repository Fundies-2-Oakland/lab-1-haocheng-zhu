import java.lang.Math;

public class Vector3D {
    private final double x;
    private final double y;
    private final double z;


    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double getX() {
        return x;
    }


    public double getY() {
        return y;
    }


    public double getZ() {
        return z;
    }

    public String toString() {
        String one = String.format("%.2f", x);
        String two = String.format("%.2f", y);
        String three = String.format("%.2f", z);
        return "(" + one + ", " + two + ", " + three + ")";
    }

    public double getMagnitude() {
        double inside = x * x + y * y + z * z;
        return Math.sqrt(inside);
    }

    public String normalize(double magnitude) {

        double newX = x / magnitude;
        double newY = y / magnitude;
        double newZ = z / magnitude;

        try {
        } catch (IllegalStateException e) {
            System.err.println("magnitude can not be 0");
        }
        return "(" + newX + ", " + newY + ", " + newZ + ")";

    }

    public String Add(Vector3D other) {
        double newX = this.x + other.x;
        double newY = this.y + other.y;
        double newZ = this.z + other.z;
        return "(" + newX + ", " + newY + ", " + newZ + ")";
    }

    public String multiply(double num) {
        double newX = this.x * num;
        double newY = this.y * num;
        double newZ = this.z * num;
        return "(" + newX + ", " + newY + ", " + newZ + ")";
    }

    public double dotProduct(Vector3D other) {
        double newX = this.x * other.x;
        double newY = this.y * other.y;
        double newZ = this.z * other.z;
        return newX + newY + newZ;
    }

    public double angleBetween(Vector3D other) {
        double numerator = this.dotProduct(other);
        double denominator = this.getMagnitude() * other.getMagnitude();
        try {
        } catch (IllegalStateException e) {
            System.err.println("magnitude can not be 0");
        }
        return Math.toDegrees(Math.acos(numerator / denominator));
    }

    public String crossProduct(Vector3D other) {
        double newX = this.y * other.z - this.z * other.y;
        double newY = this.z * other.x - this.x * other.z;
        double newZ = this.x * other.y - this.y * other.x;
        return "(" + newX + ", " + newY + ", " + newZ + ")";
    }

    public static void main(String[] args) {
        Vector3D vector = new Vector3D(12.123, 13.133, 14.131);
        System.out.println(vector);
    }
}
