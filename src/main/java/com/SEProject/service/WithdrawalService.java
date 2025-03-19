package com.SEProject.service;

import com.SEProject.model.User;
import com.SEProject.model.Withdrawal;

import java.time.LocalDateTime;
import java.util.List;

public interface WithdrawalService {

    Withdrawal requestWithdrawal(Long amount, User user);
    Withdrawal procceedWithdrawal(Long withdrawalId, boolean accept) throws Exception;

    List<Withdrawal> getUserWithdrawalHistory(User user);
    List<Withdrawal> getAllWithdrawalRequest();


}