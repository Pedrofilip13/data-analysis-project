import java.util.ArrayList;

public class StockAnalyzer {

    // Calculate the average stock price for an array
    public static float calculateAveragePrice(float[] prices) {
        float sum = 0;
        for (float price : prices) {
            sum += price;
        }
        return sum / prices.length;
    }

    // Calculate the average stock price for an ArrayList
    public static float calculateAveragePrice(ArrayList<Float> prices) {
        float sum = 0;
        for (float price : prices) {
            sum += price;
        }
        return sum / prices.size();
    }

    // Find the maximum stock price for an array
    public static float findMaximumPrice(float[] prices) {
        float maxPrice = prices[0];
        for (float price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Find the maximum stock price for an ArrayList
    public static float findMaximumPrice(ArrayList<Float> prices) {
        float maxPrice = prices.get(0);
        for (float price : prices) {
            if (price > maxPrice) {
                maxPrice = price;
            }
        }
        return maxPrice;
    }

    // Determine the occurrence count of a specific price
    public static int countOccurrences(float[] prices, float targetPrice) {
        int count = 0;
        for (float price : prices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Determine the occurrence count of a specific price
    public static int countOccurrences(ArrayList<Float> prices, float targetPrice) {
        int count = 0;
        for (float price : prices) {
            if (price == targetPrice) {
                count++;
            }
        }
        return count;
    }

    // Compute the cumulative sum of stock prices
    public static ArrayList<Float> computeCumulativeSum(ArrayList<Float> prices) {
        ArrayList<Float> cumulativeSum = new ArrayList<>();
        float sum = 0;
        for (float price : prices) {
            sum += price;
            cumulativeSum.add(sum);
        }
        return cumulativeSum;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Example data
        float[] stockPricesArray = {10.5f, 12.3f, 11.8f, 13.2f, 15.7f, 14.6f, 16.4f, 17.9f, 19.1f, 18.5f};
        ArrayList<Float> stockPricesList = new ArrayList<>();
        for (float price : stockPricesArray) {
            stockPricesList.add(price);
        }

        // Calculate average stock price
        float averagePriceArray = calculateAveragePrice(stockPricesArray);
        float averagePriceList = calculateAveragePrice(stockPricesList);
        System.out.println("Average Stock Price (Array): " + averagePriceArray);
        System.out.println("Average Stock Price (ArrayList): " + averagePriceList);

        // Find maximum stock price
        float maxPriceArray = findMaximumPrice(stockPricesArray);
        float maxPriceList = findMaximumPrice(stockPricesList);
        System.out.println("Maximum Stock Price (Array): " + maxPriceArray);
        System.out.println("Maximum Stock Price (ArrayList): " + maxPriceList);

        // Determine occurrence count of a specific price
        float targetPrice = 15.7f;
        int occurrenceCountArray = countOccurrences(stockPricesArray, targetPrice);
        int occurrenceCountList = countOccurrences(stockPricesList, targetPrice);
        System.out.println("Occurrence Count of " + targetPrice + " (Array): " + occurrenceCountArray);
        System.out.println("Occurrence Count of " + targetPrice + " (ArrayList): " + occurrenceCountList);

        // Compute cumulative sum of stock prices
        ArrayList<Float> cumulativeSum = computeCumulativeSum(stockPricesList);
        System.out.println("Cumulative Sum of Stock Prices (ArrayList): " + cumulativeSum);
    }
}
