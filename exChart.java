import org.knowm.xchart.*;

public class ChartDemo {
    public static void main(String[] args) {
        List<String> titles = Arrays.asList("Video A", "Video B", "Video C");
        List<Double> views = Arrays.asList(5000.0, 12000.0, 3000.0);

        CategoryChart chart = new CategoryChartBuilder().width(800).height(600).title("Views").xAxisTitle("Video").yAxisTitle("Views").build();
        chart.addSeries("Views", titles, views);

        new SwingWrapper<>(chart).displayChart();
    }
}
