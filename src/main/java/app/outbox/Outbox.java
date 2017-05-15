package app.outbox;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by winnerawan
 * on 5/15/17.
 */
public class Outbox {

    private String UpdatedInDB;
    private String InsertIntoDB;
    private String SendingDateTime;
    private String SendBefore;
    private String SendAfter;
    private String Text;
    private String DestinationNumber;
    private String Coding;
    private String UDH;
    @SerializedName("Class")
    @Expose
    private String Class;
    private String TextDecoded;
    private String ID;
    private String MultiPart;
    private String RelativeValidity;
    private String SenderID;
    private String SendingTimeOut;
    private String DeliveryReport;
    private String CreatorID;
    private String Retries;
    private String Priority;

    public String getUpdatedInDB() {
        return UpdatedInDB;
    }

    public void setUpdatedInDB(String updateInDB) {
        UpdatedInDB = updateInDB;
    }

    public String getInsertIntoDB() {
        return InsertIntoDB;
    }

    public void setInsertIntoDB(String insertIntoDB) {
        InsertIntoDB = insertIntoDB;
    }

    public String getSendingDateTime() {
        return SendingDateTime;
    }

    public void setSendingDateTime(String sendingDateTime) {
        SendingDateTime = sendingDateTime;
    }

    public String getSendBefore() {
        return SendBefore;
    }

    public void setSendBefore(String sendBefore) {
        SendBefore = sendBefore;
    }

    public String getSendAfter() {
        return SendAfter;
    }

    public void setSendAfter(String sendAfter) {
        SendAfter = sendAfter;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getDestinationNumber() {
        return DestinationNumber;
    }

    public void setDestinationNumber(String destinationNumber) {
        DestinationNumber = destinationNumber;
    }

    public String getCoding() {
        return Coding;
    }

    public void setCoding(String coding) {
        Coding = coding;
    }

    public String getUDH() {
        return UDH;
    }

    public void setUDH(String UDH) {
        this.UDH = UDH;
    }

    public String getClass_() {
        return Class;
    }

    public void setClass(String class_) {
        Class = class_;
    }

    public String getTextDecoded() {
        return TextDecoded;
    }

    public void setTextDecoded(String textDecoded) {
        TextDecoded = textDecoded;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMultiPart() {
        return MultiPart;
    }

    public void setMultiPart(String multiPart) {
        MultiPart = multiPart;
    }

    public String getRelativeValidity() {
        return RelativeValidity;
    }

    public void setRelativeValidity(String relativeValidity) {
        RelativeValidity = relativeValidity;
    }

    public String getSenderID() {
        return SenderID;
    }

    public void setSenderID(String senderID) {
        SenderID = senderID;
    }

    public String getSendingTimeOut() {
        return SendingTimeOut;
    }

    public void setSendingTimeOut(String sendingTimeOut) {
        SendingTimeOut = sendingTimeOut;
    }

    public String getDeliveryReport() {
        return DeliveryReport;
    }

    public void setDeliveryReport(String deliveryReport) {
        DeliveryReport = deliveryReport;
    }

    public String getCreatorID() {
        return CreatorID;
    }

    public void setCreatorID(String creatorID) {
        CreatorID = creatorID;
    }

    public String getRetries() {
        return Retries;
    }

    public void setRetries(String retries) {
        Retries = retries;
    }

    public String getPriority() {
        return Priority;
    }

    public void setPriority(String priority) {
        Priority = priority;
    }
}
