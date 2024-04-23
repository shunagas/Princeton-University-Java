public class GreatCircle {
    public static void main(String[] args) {
        // latitude緯度longitude経度radius
        double lat1 = Double.parseDouble(args[0]);
        double lon1 = Double.parseDouble(args[1]);
        double lat2 = Double.parseDouble(args[2]);
        double lon2 = Double.parseDouble(args[3]);
        lat1 = Math.toRadians(lat1);
        lon1 = Math.toRadians(lon1);
        lat2 = Math.toRadians(lat2);
        lon2 = Math.toRadians(lon2);
        double dLat = lat2 - lat1;
        double dLon = lon2 - lon1;
        double r = 6371.0;

        double a = Math.sqrt(Math.pow(Math.sin(dLat / 2), 2) +
                Math.cos(lat1) * Math.cos(lat2) * Math.pow(Math.sin(dLon / 2), 2));
        double distance = 2 * r * Math.asin(a);

        System.out.println(distance + " kilometers");

    }
}