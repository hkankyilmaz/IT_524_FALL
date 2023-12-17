package com.karayilmazhakan.main;
import com.karayilmazhakan.model.AccountModel;

public class AccountMain {

    public static void main(String[] args) {

        AccountModel accountOne = new AccountModel("Hakan KARAYILMAZ",1000,0);

        accountOne.credit(1500);
        accountOne.debit(300);
        accountOne.showInfo();


    }
}
