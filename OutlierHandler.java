List<Double> viewList = new ArrayList<>();
for (String[] row : rows) {
    viewList.add(Double.parseDouble(row[4]));
}
Collections.sort(viewList);
double q1 = viewList.get(viewList.size() / 4);
double q3 = viewList.get(3 * viewList.size() / 4);
double iqr = q3 - q1;
