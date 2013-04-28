package ceng.bim492.hw2;

import com.codometer.homework.bim460.homework3.Sms;
import com.codometer.homework.bim460.homework3.SmsSender;
import com.codometer.homework.bim460.homework3.SmsStatus;
import com.codometer.homework.bim460.homework3.annotations.PrepareSms;
import com.codometer.homework.bim460.homework3.annotations.ProcessResult;
import com.codometer.homework.bim460.homework3.annotations.SendSms;

/**
 * User: ali
 * Date: 4/22/13
 * Time: 4:47 PM
 */
@com.codometer.homework.bim460.homework3.annotations.VodafoneSmsSender
public class VodafoneSmsSender extends SmsSender {


    @PrepareSms
    public void PrepareSms() {
        getSms().addStatus(SmsStatus.VodafonePrepared);

    }

    @SendSms
    public void SendSms() {
        getSms().addStatus(SmsStatus.VodafoneSent);
    }

    @ProcessResult
    public void ProcessResult() {
        getSms().addStatus(SmsStatus.VodafoneProcessed);
    }
}
