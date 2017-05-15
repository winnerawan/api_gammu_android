package app.inbox;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import org.mongodb.morphia.annotations.Indexed;

/**
 * Created by winnerawan
 * on 5/11/17.
 */
public class Inbox {

    private String UpdatedInDB;
    private String ReceivingDateTime;
    private String Text;
    private String SenderNumber;
    private String Coding;
    private String UDH;
    private String SMSCNumber;
    @SerializedName("Class")
    @Expose
    private String Class;
    private String TextDecoded;
    private String ID;
    private String RecipientID;
    private String Processed;

    public Inbox() { }

    public String getUpdatedInDB() {
        return UpdatedInDB;
    }

    public void setUpdatedInDB(String updatedInDB) {
        UpdatedInDB = updatedInDB;
    }

    public String getReceivingDateTime() {
        return ReceivingDateTime;
    }

    public void setReceivingDateTime(String receivingDateTime) {
        ReceivingDateTime = receivingDateTime;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getSenderNumber() {
        return SenderNumber;
    }

    public void setSenderNumber(String senderNumber) {
        SenderNumber = senderNumber;
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

    public String getSMSCNumber() {
        return SMSCNumber;
    }

    public void setSMSCNumber(String SMSCNumber) {
        this.SMSCNumber = SMSCNumber;
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

    public String getRecipientID() {
        return RecipientID;
    }

    public void setRecipientID(String recipientID) {
        RecipientID = recipientID;
    }

    public String getProcessed() {
        return Processed;
    }

    public void setProcessed(String processed) {
        Processed = processed;
    }
}
