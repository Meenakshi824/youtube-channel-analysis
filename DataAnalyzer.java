double totalViews = 0;
double maxViews = 0;
for (String[] row : rows) {
    double views = Double.parseDouble(row[4]);
    totalViews += views;
    if (views > maxViews) maxViews = views;
}
System.out.println("Total Views: " + totalViews);
System.out.println("Max Viewed Video: " + maxViews);
