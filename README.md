<!DOCTYPE html>
<html lang="tr">
<head>
<meta charset="UTF-8" />

</head>
<body>

<h1>Agoda Test Automation Project</h1>
<p>Automated Web Testing Framework (Java – Selenium – Gauge)</p>

<p>
Bu proje, Agoda benzeri bir web uygulamasında rezervasyon akışının otomatik olarak test edilmesi için geliştirilmiş bir Test Automation Framework içerir.
Gauge, Java, Selenium WebDriver ve Page Object Model (POM) mimarisi kullanılarak oluşturulmuştur.
</p>

<hr>

<h2>Özellikler</h2>
<ul>
    <li>Gauge test framework ile senaryo bazlı test otomasyonu</li>
    <li>Java + Selenium WebDriver altyapısı</li>
    <li>Page Object Model (POM) yapısı</li>
    <li>Reusable component ve step mimarisi</li>
    <li>Jira entegrasyonu (task/severity tanımları)</li>
    <li>Özel raporlama ve hata ekran görüntüsü yapısı</li>
    <li>Environment bazlı konfigürasyon yönetimi</li>
    <li>Utility katmanı (Driver, DB, Excel, Template, Format helpers vb.)</li>
</ul>

<hr>

<h2>Proje Dizini</h2>

<pre>
AgodaTestAutomation
│
├── testiniumwebproject
│   ├── concepts/                # Gauge concept dosyaları
│   ├── env/                     # Ortam yapılandırmaları
│   ├── specs/                   # Gauge test senaryoları (.spec)
│   ├── src/test/java/com/web
│   │   ├── base/                # Base test sınıfları
│   │   ├── pages/               # Page Object sınıfları
│   │   ├── steps/               # Step implementasyonları
│   │   ├── enums/               # Enum yapıları
│   │   ├── utils/               # Utility layer
│   │   ├── drivers/             # Driver Factory / Driver Manager
│   │   └── reporting/           # Excel ve raporlama araçları
│   ├── resources/               # Properties dosyaları
│   └── pom.xml                  # Maven bağımlılık yönetimi
│
└── README.md
</pre>

<hr>

<h2>Kullanılan Teknolojiler</h2>

<table>
<thead>
<tr>
<th>Teknoloji</th>
<th>Açıklama</th>
</tr>
</thead>
<tbody>
<tr>
<td>Java 11+</td>
<td>Ana geliştirme dili</td>
</tr>
<tr>
<td>Gauge</td>
<td>Test scenario framework</td>
</tr>
<tr>
<td>Selenium WebDriver</td>
<td>Browser automation</td>
</tr>
<tr>
<td>Maven</td>
<td>Build ve dependency management</td>
</tr>
<tr>
<td>Page Object Model (POM)</td>
<td>Test mimarisi</td>
</tr>
<tr>
<td>JUnit</td>
<td>Test runner</td>
</tr>
<tr>
<td>Jira Util</td>
<td>Jira task ve severity kullanımı</td>
</tr>
<tr>
<td>Custom Reporting</td>
<td>Hata ekran görüntüsü ve Excel raporu</td>
</tr>
</tbody>
</table>

<hr>

<h2>Gereksinimler</h2>

<p>Aşağıdakilerin kurulu olması gerekmektedir:</p>

<ul>
<li>Java 11 veya üzeri</li>
<li>Maven 3.6+</li>
<li>Chrome ve ChromeDriver</li>
<li>Gauge Framework</li>
</ul>

<p>Gauge kurulumu:</p>

<pre><code>npm install -g @getgauge/cli</code></pre>

<p>Java plugin kurulumu:</p>

<pre><code>gauge install java</code></pre>

<hr>

<h2>Testleri Çalıştırma</h2>

<h3>Maven ile çalıştırma</h3>
<pre><code>mvn clean test</code></pre>

<h3>Gauge komutu ile çalıştırma</h3>
<pre><code>gauge run specs</code></pre>

<p>Belirli bir senaryoyu çalıştırmak için:</p>

<pre><code>gauge run specs/ReservationScenario.spec</code></pre>

<hr>

<h2>Environment Yönetimi</h2>

<p><code>env/default/</code> dizini altında environment configuration dosyaları bulunur:</p>

<ul>
<li>default.properties</li>
<li>user.properties</li>
<li>java.properties</li>
</ul>

<p>Base URL, tarayıcı tipi gibi ayarlar burada yapılır.</p>

<hr>

<h2>Framework Yapısı</h2>

<h3>1) Page Object Model</h3>
<p><code>pages/</code> klasöründe her sayfaya ait locator ve aksiyonlar yer alır.</p>

<h3>2) Steps Katmanı</h3>
<p>Gauge test step’leri Steps klasöründe bulunur.</p>

<pre><code>@Step("Kullanıcı ana sayfaya gider")
public void goToHomePage() {
    homePage.navigate();
}
</code></pre>

<h3>3) Driver Yönetimi</h3>
<p>DriverFactory sınıfı ile tarayıcı başlatma süreci yönetilir.</p>

<h3>4) Utility Katmanı</h3>
<p>Aşağıdaki yardımcı araçlar bulunur:</p>

<ul>
<li>ExcelUtil</li>
<li>MailTemplate</li>
<li>DB Connection</li>
<li>PhoneFormat</li>
<li>VoucherUtil</li>
</ul>

<hr>

<h2>Test Senaryosu Örneği</h2>

<pre>
Scenario: Kullanıcı başarılı rezervasyon oluşturur
    * Kullanıcı ana sayfaya gider
    * Otel araması yapar
    * Listeleme üzerinden otel seçer
    * Rezervasyon işlemini tamamlar
</pre>

<hr>

<h2>Raporlama ve Loglar</h2>

<p>Hata durumunda otomatik olarak:</p>
<ul>
<li>Ekran görüntüsü alınır</li>
<li>Gauge HTML raporları oluşturulur</li>
<li>Excel raporu güncellenir</li>
</ul>

<p>Gauge raporları dizini:</p>

<pre><code>./reports/html-report/</code></pre>

<hr>

<h2>Katkı Sağlama</h2>
<ol>
<li>Projeyi forklayın</li>
<li>Yeni bir branch oluşturun (feature/my-feature)</li>
<li>Pull request açın</li>
</ol>

<hr>

<h2>Lisans</h2>
<p>Bu proje dahili kullanım içindir ve geliştirici ihtiyaçlarına göre özelleştirilebilir.</p>

</body>
</html>

