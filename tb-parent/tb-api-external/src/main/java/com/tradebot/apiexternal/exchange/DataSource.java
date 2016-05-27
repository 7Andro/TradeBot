package com.tradebot.apiexternal.exchange;

import java.util.List;
import java.util.Map;

public interface DataSource {
	
	public String getStockPrice(String stockName);
	public Map<String, String> readIndex(String stockExchangheName);
	public List<String> getMarketNews();
	public List<String> getStockRecommendations();
	public List<String> getHistoricalData(String stockName);
	public List<String> getStocksWithHighestVol(String stockName);
	public List<String> getStockGainers(String stockName);
	public List<String> getStockLosers(String stockName);
}
