package com.aakash.service;

import java.util.List;

import com.aakash.beans.HistoryBean;
import com.aakash.beans.TrainException;

public interface BookingService {

	public List<HistoryBean> getAllBookingsByCustomerId(String customerEmailId) throws TrainException;

	public HistoryBean createHistory(HistoryBean bookingDetails) throws TrainException;

}
