### Build with Spark Java & Mysql
### Build Status
[![Build 
Status](https://api.travis-ci.org/winnerawan/openmadiun.svg?branch=master)](https://travis-ci.org/winnerawan/api_gammu_android)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)

# License 
```html
/****************************************************************************
 Copyright 2016 Winnerawan T

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or 
implied.
 See the License for the specific language governing permissions and
 limitations under the License.
****************************************************************************/
```

### Requirements
   * Gammu version 16
   * Java 8
### How To
   * Set up database (upload later)
   * Ganti database & password di db.MySQLAdapter
   * Build & run
```bash
   java -jar name_of_jar_file.jar -cp app.Application
```
### Contoh

## Index

   * Request 
      * _GET_ ```/```
   * Response
```js
{
  "status": 200,
  "message": "Selamat! Anda telah menemukan halaman kosong! Pergi rayakan penemuan besar ini dengan mengirimkan admin kopi...",
  "result": {
    "gammu_version": "13"
  }
}
```

## User
   * ``` Buat table user dengan 5 kolom (user_id (AUTO_INCREMENT), username, email, password, gcm_id)```
### Register
   * Request
      * _POST_ ```/register```
   * Params
      * username
      * email
      * password
   * Response
```js
{
  "status": 200,
  "message": "OK",
  "result": {
    "username": "administrator",
    "email": "admin@gmail.com"
  }
}
```
   * _Password encode using BCrypt (Spring Security) it's save!_
   

### List Inbox
   * Request
     * _GET_ ```/inboxes```
   * Response
```js
{
  "status": 200,
  "message": "OK",
  "result": [
    {
      "UpdatedInDB": "2015-05-10 07:12:08.0",
      "ReceivingDateTime": "2015-04-08 06:09:20.0",
      "Text": "0043004C006B007000230031003200330034",
      "SenderNumber": "+62856457XXXX",
      "Coding": "Default_No_Compression",
      "UDH": "",
      "SMSCNumber": "+62816124",
      "Class": "-1",
      "TextDecoded": "Hello World!",
      "ID": "29",
      "RecipientID": "",
      "Processed": "true"
    },
    {
      "UpdatedInDB": "2015-04-26 08:21:36.0",
      "ReceivingDateTime": "2014-07-27 19:44:39.0",
      "Text": "",
      "SenderNumber": "0821144119XX",
      "Coding": "Default_No_Compression",
      "UDH": "",
      "SMSCNumber": "",
      "Class": "-1",
      "TextDecoded": "clkp#1234",
      "ID": "2",
      "RecipientID": "",
      "Processed": "true"
    }
  ]
}
```

### 1 Inbox by SenderNumber
   * Request
     * _GET_ ```/inbox/:SenderNumber```
   * Response

```js
{
  "status": 200,
  "message": "OK",
  "result": {
    "UpdatedInDB": "2015-04-08 05:26:40.0",
    "ReceivingDateTime": "2015-03-24 15:00:00.0",
    "Text": 
"00470075006E0061006B0061006E00200061006B0075006E00200061006E00640061002000750074006B00200069006E007400650072006E006500740061006E002000640069006A006100720069006E00670061006E0020005300750070006500720057006900460069002E00430065006B00200075007300650072002F007000730077006400200064006700200053004D00530020006B00650033003600330020006B006500740069006B003A0020005300540041005400550053002E002000430065006B0020006C006F006B006100730069006E0079006100200064007200200053007500700065007200570069004600690020004100700070007300200064006900200041006E00640072006F00690064002C00200069004F0053002C00420042002C00570069006E0064006F00770073002000500068006F006E0065",
    "SenderNumber": "INDOSAT",
    "Coding": "Default_No_Compression",
    "UDH": "",
    "SMSCNumber": "+62816124",
    "Class": "-1",
    "TextDecoded": "Gunakan akun anda utk internetan dijaringan SuperWiFi.Cek user/pswd dg SMS ke363 ketik: STATUS. Cek lokasinya dr SuperWiFi Apps di Android, iOS,BB,Windows Phone",
    "ID": "4",
    "RecipientID": "",
    "Processed": "true"
  }
}
```

#### Update later...
### EOF
