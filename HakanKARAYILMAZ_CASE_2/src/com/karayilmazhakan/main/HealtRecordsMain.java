package com.karayilmazhakan.main;

import com.karayilmazhakan.model.HealtRecordModel;

public class HealtRecordsMain {

    public static void main(String[] args) {

        HealtRecordModel healtRecord = new HealtRecordModel("Hakan","KARAYILMAZ",
                                                "Erkek",14,1,
                                                1991,90,1.90);

        healtRecord.showSummary();

    }
}
