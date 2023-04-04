# hashicorp-vault-demo
HashiCorp Vault ve Spring Boot entegrasyonu için hazırlanmış örnek proje.

Öncelikle HashiCorp Vault sistemde kurulu olmalıdır, bunun için https://developer.hashicorp.com/vault/docs/install linkinden uygun işletim sistemine göre kurulum yapılmalıdır.
(Yazının devamı Windows için anlatılmıştır.)

Kurulumdan sonra ilk olarak sonrasında 

```
vault server --dev --dev-root-token-id="00000000-0000-0000-0000-000000000000"
```
komutu ile sunucuyu ayağa kaldırıyoruz. Burada token Vault'a giriş için gerekli bir bilgidir. application.properties dosyasında verilen bilgi ile tutarlı olduğu müddetçe dilenen değer verilebilir.

Daha sonra 

```
set VAULT_ADDR=http://127.0.0.1:8200
```
ile Vault için bir port ayarlaması yapıyoruz.

Son olarak 

```
vault kv put secret/vault-demo app.config.auth.username=default_user
```
şeklinde saklanmasını istedğimiz verileri kaydedelim. Burada eklenen verinin yapısını inceledikten sonra komutu düzenleyerek istenilen veriler eklenebilir.

Bu adımlardan sonra verileri http://127.0.0.1:8200 ucundaki arayüz aracılığı ile görüntüleyebilir, uygulama ile de Spring Boot ile kullanımını inceleyebiliriz.
