# Dice API (Spring Boot)

このプロジェクトは、1～8のサイコロの目を返す簡単な REST API サンプルです。  
Git から取得してローカルで実行できる手順を示します。

## 必要環境
- Java JDK 17 以上
- Maven（`./mvnw` があるので Maven インストール不要）
- Git
- コマンドプロンプト / ターミナル

## 1. プロジェクトをクローン
```bash
git clone https://github.com/あなたのアカウント/diceapi.git
cd diceapi

## 2. サーバを起動
./mvnw spring-boot:run

## 3. API を呼び出す

ブラウザまたは REST クライアントでアクセス:

http://localhost:8080/diceapi

JSON 形式で乱数結果が返ります

{"result": 5}

## 4. サーバ停止

ターミナルで Ctrl + C を押す
正しく停止されない場合は、もう一度押す必要があるかもしれません

## 5. 注意点

直接 .class や target/ は Git に含まれていません
プロジェクトの変更はコミットして自分のリポジトリに push してください
Spring Boot のコードは Java で書かれていますが、ブラウザから API を試せます

## 6. 追加情報

DiceController.java が API の実装です
DiceapiApplication.java は Spring Boot の起動用テンプレートです（触る必要なし）
JSON の戻り値は Map<String,Integer> で生成されています


---
