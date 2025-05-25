SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
Map<Integer, Integer> hourViews = new HashMap<>();

for (String[] row : rows) {
    Date publishTime = formatter.parse(row[1]); // publish_time
    Calendar cal = Calendar.getInstance();
    cal.setTime(publishTime);
    int hour = cal.get(Calendar.HOUR_OF_DAY);
    hourViews.put(hour, hourViews.getOrDefault(hour, 0) + 1);
}
