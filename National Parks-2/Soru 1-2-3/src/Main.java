import java.util.*;

public class Main {
    public static void main(String[] args) {
        Tree tree = new Tree();
        List<String> genericList = new ArrayList();
        MilliPark[] arr = new MilliPark[48];
        arr[47] = new MilliPark("Abant Gölü Milli Parkı", "Bolu", 2022, 1262, "Abant Gölü Millî Parkı, Türkiye'nin Bolu ilinin Mudurnu ilçesinde yer alan bir millî parktır. Batı Karadeniz sıradağlarının Karadeniz sahiline paralel ikinci kolunu oluşturan Abant ve Keremali sıradağlarının kolları arasındadır. 1.262 hektar (12,62 km2) alan kaplamaktadır.");
        arr[32] = new MilliPark("Ağrı Dağı Millî Parkı", "Ağrı", 2004, 88015, "Alan, bitki ve hayvan tür zenginliği, peyzaj ilginçliği, volkanizma ile ilgili ilginç yer şekilleri, jeolojik özellikleri, sulak alanları, turizm ve dağcılık potansiyeli ile dikkat çeker. Millî park Türkiye, İran, Nahcivan, Ermenistan sınırlarının kesişim noktasındadır. Ağrı'nın Doğubayazıt, Iğdır'ın Aralık ve Karakoyunlu ilçeleri alan sınırındadır. Ağrı merkeze 100 km mesafededir. Avrupa ve Türkiye'nin en yükseği 5137 m'lik Ağrı Dağı ve 3898 m'lik Küçük Ağrı dağı park sınırlarında bulunur.");
        arr[25] = new MilliPark("Aladağlar Millî Parkı", "Adana", 1995, 55064, "Aladağlar, Kayseri-Niğde-Adana illeri arasında bulunan dağ sırası, bitki örtüsü ve hayvan çeşitliliği bakımından zengindir. Bu nedenle dağın 54.524 hektarlık bir bölümü önce Hacer Ormanı Tabiat Parkı, 1995 yılında da Milli park ilan edilmiştir.");
        arr[21] = new MilliPark("Altınbeşik Mağarası Millî Parkı", "Antalya", 1994, 1147, "Altınbeşik Mağarası Millî Parkı, Antalya ilinde bulunan milli park. İbradi (Aydınkent) ilçesine 9.7 km uzaklıkta olan Ürünlü köyünün yaklaşık 5 km güneydoğusundadır. Derin ve sarp Manavgat vadisinin batı yamacında yer almaktadır.");
        arr[16] = new MilliPark("Altındere Vadisi Millî Parkı", "Trabzon", 1987, 4468, "Altındere Millî Parkı, Trabzon'un güneyinde Maçka yakınlarındadır. Bu millî parkın içinde, neredeyse bulutların bile üzerinde yer alan muhteşem Sümela Manastırı bulunur. 270 m yükseklikteki bir uçurum fasadında bulunan manastır en görkemli konuma Trabzon İmparatoru Alexius III. Komnenos döneminde getirilmiştir. III. Alexius'un taç giyme töreni (1349) burada yapılmıştır. Manastırın içinde kütüphane, kilise, rahip odaları, şapel, ayazma ve mutfak bölümleri bulunmaktadır");
        arr[15] = new MilliPark("Başkomutan Tarihî Millî Parkı", "Afyon", 1981, 34834, "Başkomutan Tarihî Millî Parkı, Türkiye'nin İç Anadolu Bölgesi'nde tarihî ve kültürel değerlerin korunması amacıyla , 8 Kasım 1981'de ilân edilen millî park. Millî Mücadele'nin dönüm noktası olan çarpışmaların yaşandığı; günümüzde Afyonkarahisar, Kütahya ve Uşak illeri sınırları içinde kalan toplam 42.183 hektarlık alandan oluşmaktadır. Alan içerisinde çeşitli şehitlikler, anıtlar ve bir de müze bulunmaktadır.");
        arr[12] = new MilliPark("Beydağları Sahil Millî Parkı", "Antalya", 1972, 31166, "Olimpos-Beydağları Sahil Millî Parkı Sarısu'dan itibaren Antalya - Kumluca karayoluna ve Akdeniz'e paralel olarak Gelidonya Burnu'na kadar uzanmaktadır. Akdeniz Körfezinin batı sahilinde muhteşem güzellikte doğal plajlar antik şehirler vardır. Çıralı ve Adrasan Plajı bunlardan en uzun olanıdır. Millî Park giriş noktasından itibaren Topçam, Küçük Çaltıcak, Büyük Çaltıcak, Kargıcak 1-2 gibi günübirlik mesire alanlara uzun plajlara sahip orman ve denizin kucaklaştığı ender tabiat harikalarıdır.");
        arr[19] = new MilliPark("Beyşehir Gölü Millî Parkı", "Konya", 1993, 86855, "Beyşehir Gölü Millî Parkı, Beyşehir Gölü’nün yakınında Türkiye'nin en büyük millî parkıdır. Derlenen bilgilere göre, 1993 yılında Bakanlar Kurulu kararıyla kurulan millî park 88 bin 750 hektarlık alanı kapsıyor. Doğa Koruma ve Millî Parklar Genel Müdürlüğü bünyesinde koruma altında bulundurulan Türkiye'de toplam 897 bin 657 hektarlık alana sahip 40 adet millî park bulunuyor. Bu millî park alanlarının en genişi ise Beyşehir Gölü Millî Parkı olarak dikkat çekiyor. Türkiye'nin en büyük tatlı su kaynağı olan Beyşehir Gölü'nde Beyşehir ve Kızıldağ olmak üzere iki ayrı millî park bulunuyor.");
        arr[17] = new MilliPark("Boğazköy-Alacahöyük Millî Parkı", "Çorum", 1988, 2600, "Anadolu'da kurulan en eski uygarlıklardan biri olan Hititlerden kalma arkeolojik değerler barındırır. Hitit devletinin başkenti Hattuşaş'a ait; kent surları, yer kapı, aslanlı kapı ile yazılıkaya günümüze ulaşan önemli eserlerdendir.");
        arr[43] = new MilliPark("Botan Vadisi Millî Parkı", "Siirt", 2019, 11834, "Botan Vadisi, Türkiye'nin Siirt ili sınırları içerisinde bulunan millî park statüsündeki tarihî alan. Botan Vadisi 120 bin dönümden ve 29 kilometrelik güzergahtan oluşuyor olup yamaç paraşütü, rafting gibi sporlara da elverişlidir.");
        arr[46] = new MilliPark("Derebucak Çamlık Mağaraları Millî Parkı", "Konya", 2022, 1147, "Derebucak Çamlık Mağaraları Millî Parkı, Türkiye'nin Konya ilinin Derebucak ilçesinde yer alan bir millî parktır. Batı Torosların güneydoğusunda Akdağlar üzerinde yer alır; Çamlık Kasabası’na yaklaşık 1,5 km uzaklıktadır.");
        arr[6] = new MilliPark("Dilek Yarımadası-Büyük Menderes Deltası Millî Parkı", "Aydın", 1966, 27598, "MÖ 9. yüzyılda İyon kentinin kutsal toplanma merkezi Panionion, antik Thebai kenti, Ayayorgi Manastırı, tarihi Doğanbey Köyü (Domatia) ile Karine, Hagios Antonios Manastırı ve Zeus Mağarası da Millî Park Sınırları içindedir. 27.675 hektarlık bir alana sahiptir.");
        arr[33] = new MilliPark("Gala Gölü Millî Parkı", "Edirne", 2005, 6087, "Gala Gölü Millî Parkı, Enez ve İpsala İlçeleri arasında bulunan Gala ve Pamuklu göllerini kapsayan alan 5 Mart 2005 tarihli Resmî Gazete'de yayınlanan 2005/8547 sayılı Bakanlar Kurulu kararıyla \"Gala Gölü Millî Parkı\" olarak belirlenmiştir. ");
        arr[9] = new MilliPark("Güllük Dağı Millî Parkı", "Antalya", 1970, 6700, "Güllük Dağı (Termessos) Millî Parkı, Antalya ilinde 1970 yılında, 6.702 hektarlık alan üzerinde kurulan mili park. Toros dağlarının eteklerinde, Korkuteli ilçe sınırlarında yer alır.");
        arr[44] = new MilliPark("Hakkâri Cilo ve Sat Dağları Millî Parkı", "Hakkari", 2020, 27500, "Türkiye'nin 45. millî parkıdır. 27.500 hektar (275 km2) alan kaplamaktadır. Türkiye'nin 45. millî parkıdır.");
        arr[22] = new MilliPark("Hatila Vadisi Millî Parkı", "Artvin", 1994, 16944, "Vadi boyunca değişik kayaç türleri görülmekle birlikte, bu kayaçların hemen hepsi derinlik volkanizmasının ürünüdür. Ulaşım, Artvin il merkezinden 10 km.lik stabilize bir yol ile sağlanır.");
        arr[29] = new MilliPark("Honaz Dağı Millî Parkı", "Denizli", 1995, 9429, "Honaz Dağı, Türkiye'nin Denizli ilinin güneydoğusu boyunca, Ege ve Akdeniz bölgelerini ayıran doğal sınır olarak uzanan bir dağdır. Ege Bölgesi'nin en yüksek dağı olan Honaz Dağı'nın deniz seviyesinden yüksekliği 2571 metredir. 1995 yılında millî park ilan edilmiştir.");
        arr[14] = new MilliPark("Ilgaz Dağı Millî Parkı", "Çankırı", 1976, 1128, "Ilgaz Dağı Millî Parkı, Batı Karadeniz bölümünde Kastamonu ve Çankırı illerinde, Ilgaz Dağları üzerinde 1976 yılında kurulmuş millî park. Kıyı ile iç bölgeler arasında geçiş alanı olması nedeniyle alan habitat zenginliğine sahiptir.");
        arr[36] = new MilliPark("İğneada Longoz Ormanları Millî Parkı", "Kırlareli", 2007, 3155, "İğneada Longoz Ormanları Millî Parkı, Marmara bölgesi, Kırklareli ili, Demirköy ilçesinde, 3.155 ha alanda, 2007 yılında kurulan millî park. Millî park, Bulgaristan sınırında yer alan İğneada beldesi sınırlarında yer alır.");
        arr[42] = new MilliPark("İstiklâl Yolu Tarihî Millî Parkı", "Ankara", 2018, 235, "Savaş boyunca İnebolu açıklarına gemilerle gelen cephane ve silahlar kayıklarla İnebolu'ya taşınmış, Kastamonu kadınları tarafından zor şartlarda cepheye taşınmıştır. İstiklâl Yolu'nun İnebolu-Kastamonu arası, Kastamonu il sınırları içerisindeki 95 km'lik bölümü Kastamonu Valiliği tarafından işaretlenerek yürüyüş yolu olarak düzenlenmiştir.");
        arr[24] = new MilliPark("Kaçkar Dağları Millî Parkı", "Artvin", 1994, 52970, "Kaçkar Dağları Millî Parkı büyük bölümü Rizenin Çamlıhemşin ilçesinde, bir bölümü Erzurum ve Artvin illerine uzanan millî park. 51.550 hektarlık mili park Fırtına Deresi ile Hemşin Deresi arasında yer alan Kaçkar Dağları üzerinde kurulmuştur. 51.550 hektarlık mili park Fırtına Deresi ile Hemşin Deresi arasında yer alan Kaçkar Dağları üzerinde kurulmuştur.");
        arr[23] = new MilliPark("Karagöl-Sahara Millî Parkı", "Artvin", 1994, 3251, "Karagöl-Sahara Millî Parkı, Türkiye'deki millî park alanlarından birisidir. Artvin'in Şavşat ilçesi sınırları içerisinde yer alan park, Karagöl ve Sahara Yaylası olmak üzere iki ayrı sahadan oluşur. Karagöl, Şavşat ilçe merkezinin 45 km. kuzeyinde yer almaktadır. Sahara yaylası ise ilçe merkezine 17 km. uzaklıktadır.");
        arr[1] = new MilliPark("Karatepe-Aslantaş Millî Parkı", "Osmaniye", 1958, 4143, "Karatepe-Aslantaş Millî Parkı, 1958 yılında Akdeniz Bölgesi’nde, Osmaniye İlinin Kadirli İlçesine 22 km uzaklıkta ve Ceyhan Nehrinin kenarında kurulmuştur. Mili parkta Genç Hitit devrine ait (MÖ 8. yüzyıl) yerleşme ve kale kalıntıları bulunur. Bu alanda sonraki zamanlarda Roma ve Bizans medeniyetlerine ait yerleşmeler kurulmuş kalıntılar bulunur.");
        arr[20] = new MilliPark("Kazdağı Millî Parkı", "Balıkesir", 1994, 20935, "Kazdağı Millî Parkı, Balıkesir, Edremit'te yer alan doğa temalı millî parktır. Marmara ve Ege bölgeleri arasında sınır oluşturan Kazdağı'ndan ismini alır. Bulunduğu geçiş iklimi ve yakın bölgedeki tek yüksek dağ olması ayrıca Biga Yarımadası'nda doğu-batı doğrultusunda uzanan dağın, yer yer en bilineni Şahinderesi Kanyonu olmak üzere, ırmaklar tarafından açılan kanyonlarla parçalara ayrılmış yapısı, deniz ile dağ ikliminin birbirine karışmasına olanak veren şartlar yaratmıştır.");
        arr[8] = new MilliPark("Kızıldağ Milli Parkı", "Isparta", 1969, 55106, "Kızıldağ Millî Parkı, Isparta merkeze 120, Şarkikaraağaç ilçesine ise 5 km uzaklıktadır. Kızıldağ Millî Parkı, öncelikle bir dağdır. Karaçamıyla, sedir ağaçlarıyla, meşe ve ardıç ağaçlarıyla örtülüdür. Mavi yapraklı sedir ormanının bulunduğu tek bölgedir.");
        arr[40] = new MilliPark("Kop Dağı Müdafaası Tarihî Millî Parkı", "Bayburt", 2016, 6335, "Kop Dağı Müdafaası Tarihî Millî Parkı, Türkiye'nin Bayburt ve Erzurum il sınırları içerisinde yer alan millî park. Osmanlıların 3. Ordu ile muzaffer olduğu alanın rekreasyonu da bu tarihî değeri göz önünde bulundurularak yapılmıştır.");
        arr[10] = new MilliPark("Kovada Gölü Millî Parkı", "Isparta", 1970, 6551, "Kovada Gölü Millî Parkı, Isparta'nın Eğirdir ilçesi sınırları içerisinde yer alır. Millî park sâhası içerisinde konaklama ve piknik yapma amaçlı hazırlanmış yerler mevcuttur. Burada otelde değil çadırlarda ve karavanlarda kalınalabilir. ");
        arr[13] = new MilliPark("Köprülü Kanyon Millî Parkı", "Antalya", 1973, 35719, "Millî parkta geyik, dağ keçisi, ayı, tilki, tavşan, porsuk, kurt yaşamaktadır. Coşkun akan Köprü Çayı bol oksijenli olduğundan bol miktarda alabalık bulunur. Park arazisinde sedir ormanları ve Kapadokya'daki peri bacalarına benzeyen taş oluşumları vardır. Köprü Çayı üzerindeki eski taş köprü günümüzde de kullanılmaktadır.");
        arr[3] = new MilliPark("Kuşcenneti Millî Parkı", "Balıkesir", 1959, 17058, "Kuşcenneti Millî Parkı; Marmara Bölgesi’nde, Balıkesir ili içerisindeki Manyas Kuşgölü’nün kuzeydoğusunda yer alır. Manyas, Gönen, Bandırma arasındadır.");
        arr[30] = new MilliPark("Küre Dağları Millî Parkı", "Bartın", 2000, 37753, "Küre Dağları Millî Parkı, Karadeniz Bölgesi'nin batısında Küre Dağları üzerinde yer alan millî parktır. Park Kastamonu ve Bartın il sınırları içerisinde kalmaktadır.");
        arr[41] = new MilliPark("Malazgirt Meydan Muharebesi Tarihî Millî Parkı", "Muş", 2018, 238, "Malazgirt Meydan Muharebesi Millî Parkı, Muş ilinin Malazgirt ilçesi sınırları içerisinde yer alan millî park. Malazgirt Meydan Muharebesi'nin gerçekleştiği alan üzerinde kurulu bulunmaktadır.");
        arr[26] = new MilliPark("Marmaris Millî Parkı", "Muğla", 1996, 29206, "Marmaris Millî Parkı, Marmaris ve Köyceğiz ilçelerinde 29.206 hektar alanda, 1996 yılında kurulmuştur. Alanın önemli özellikleri şu şekilde sıralanabilir; Önemli kuş alanı, önemli bitki alanı, önemli doğa alanı, önemli memeli alanı, sıcak bölge alanı, sıfır yok oluş alanı.");
        arr[11] = new MilliPark("Munzur Vadisi Millî Parkı", "Tunceli", 1971, 42674, "Munzur Vadisi Millî Parkı, Tunceli ve Ovacık arasında uzanan Munzur Vadisi'nde, 42.000 hektarlık bir alandır. Bu bölgenin millî park olarak ilan edilmesinde, başta akarsu kaynakları ve gözeler olmak üzere, zengin doğal veriler, endemik bitki türleri ve yöreye özgü hayvan türleri ile zenginleşen bitki örtüsü ve yaban hayvan varlığıdır.");
        arr[18] = new MilliPark("Nemrut Dağı Millî Parkı", "Adıyaman", 1988, 13827, "Nemrut Dağı Millî Parkı, Adıyaman ili; Kâhta ilçesinde bulunan ve içinde Kommagene Krallığı'nın bir antik kentini barındıran millî park ve ören yeri. Adıyaman il merkezinde Kâhta'ya bağlantı sağlayan karayolu ile ulaşım sağlanmakta olup, Millî Park Adıyaman il sınırları içerisindedir.");
        arr[38] = new MilliPark("Nene Hatun Tarihî Millî Parkı", "Erzurum", 2009, 387, "Nene Hatun Millî Parkı, Erzurum merkezinde yer alır. Tarihimize 93 Harbi olarak geçen 1877–1878 Osmanlı-Rus Savaşında şehrin korunmasında etkin rol üstlenen Mecidiye ve Aziziye tabyaları, Rusların kente daha fazla ilerlemesini engellemiştir.");
        arr[39] = new MilliPark("Sakarya Meydan Muharebesi Tarihî Millî Parkı", "Ankara", 2015, 13850, "Sakarya Meydan Muharebesi Tarihi Millî Parkı, Sakarya Meydan Muharebesi'nin yapıldığı alanda kurulan millî park. Sakarya Meydan Muharebesi, Kurtuluş Savaşı'nın dönüm noktası olarak görülmektedir. Savaşın gerçekleştiği alandaki siperler, mevziler, şehitlikler, savaşta kullanılan binalar kaynak değer olarak tespitleri yapılmaya başlanmıştır.");
        arr[27] = new MilliPark("Saklıkent Milli Parkı", "Antalya", 1996, 1643, "Saklıkent Millî Parkı veya yaygın adıyla Saklıkent Kanyonu, Antalya-Muğla sınırını çizen Eşen Çayı'nın kolu olan Karaçay'ın oluşturduğu kanyondur. Muğla'nın Seydikemer ilçesi sınırları içerisindedir.");
        arr[45] = new MilliPark("Sarıçalı Dağı Millî Parkı", "Ankara", 2021, 1024, "Sarıçalı Dağı Millî Parkı, Türkiye'nin Ankara ilinin Nallıhan ilçesinde yer alan bir millî parktır. 28 Ekim 2021 tarihinde kurulmuştur.");
        arr[31] = new MilliPark("Sarıkamış-Allahuekber Dağları Millî Parkı", "Erzurum", 2004, 22520, "Sarıkamış-Allahüekber Dağları Millî Parkı, Erzurum ve Kars illeri sınırları içinde, 22.519 hektarlık alanda 2004 yılında kurulmuş millî park. Binlerce Osmanlı askerinin öldüğü başarısız Sarıkamış Harekâtı, yaban hayatı zenginliği ve Sarıçam yayılışı Millî parkın temel özelliklerini oluşturur.");
        arr[2] = new MilliPark("Soğuksu Millî Parkı", "Ankara", 1959, 1186, "Soğuksu Millî Parkı, Ankara'nın Kızılcahamam ilçesinde yer alan ve 19 Şubat 1959'da kurulan bir millî parktır. Ankara şehir merkezine 80 kilometre uzaklıktadır.");
        arr[7] = new MilliPark("Spil Dağı Millî Parkı", "İzmir", 1968, 6801, "Spil Dağı Millî Parkı, Türkiye'nin Manisa ve İzmir il sınırları içerisinde yer alan bir millî parktır. Spil Dağı'nı ve çevresini kapsayan park, 22 Nisan 1968'de ilan edildi. Manisa İl Çevre ve Orman Müdürlüğü'ne bağlıdır.");
        arr[34] = new MilliPark("Sultansazlığı Millî Parkı", "Kayseri", 2006, 24538, "Sultan sazlığı, İç Anadolu Bölgesinde Kayseri il sınırları içerisinde Develi, Yahyalı ve Yeşilhisar ilçelerinin oluşturduğu üçgen içerisinde bulunmaktadır. Göl sahası oluşumu miyosen devrinde başlamış pleistosen ve holosen devirlerinde erozyon malzemeleri ile dolmaya, tabakalar teşekkül etmeye başlamıştır.");
        arr[35] = new MilliPark("Tek Tek Dağları Millî Parkı", "Şanlıurfa", 2007, 19335, "Tek Tek Dağları Millî Parkı, Şanlıurfa ilinde 19.335 ha alanda 2007 yılında ilan edilen millî park. Tektek Dağların üzerinde yer alır.");
        arr[28] = new MilliPark("Troya Tarihî Millî Parkı", "Çanakkale", 1996, 13517, "Troya Tarihî Millî Parkı, Türkiye'nin Çanakkale kentinde bulunan bir millî park. Troya Tarihî Milli Parkı içinde 1. derece Arkeolojik SİT alanı olarak ilan edilmiş 2 adet antik kent 4 tümülüs, 3 anıt eser, 3 tescilli mezar bulunur.");
        arr[4] = new MilliPark("Uludağ Millî Parkı", "Bursa", 1961, 13024, "Uludağ Millî Parkı 1961 yılında Millî Park olarak ilan edildi. 1961 yılında koruma altına alınan alanı 12.762 hektar'dır.");
        arr[5] = new MilliPark("Yedigöller Millî Parkı", "Bolu", 1965, 1623, "Bunlardan bazıları dip kaçakları ile birbirine bağlantılıdır. Genellikle yer yapısı serpantinlerden ve volkanik kayaçlardan oluşan sahada zaman zaman göçük yer hareketleri sürüklenmeye hazır arazi yapısı, göllerin meydana gelmesini hazırlayan başlıca faktörlerdir. Göller, kayan kitlelerin, vadilerin önlerini kapaması sonucu arkada suların biriktiği set gölleridir.");
        arr[0] = new MilliPark("Yozgat Çamlığı Millî Parkı", "Yozgat", 1958, 517, "Yozgat Çamlığı Millî Parkı, İç Anadolu Bölgesi'nde insan etkisi ile meydana gelen step içerisinde yer alan sayılı kalıntı ormanlardan biridir. Türkiye'nin ilk millî parkı olma özelliğine sahip olan parkın ortalama yüksekliği 1350 metredir.");
        arr[37] = new MilliPark("Yumurtalık Lagünü Millî Parkı", "Adana", 2008, 16980, "Yumurtalık Lagünü, Türkiye'nin Adana ilinin Yumurtalık ilçesinde yer alan bir lagündür. 21 Temmuz 2005'te Ramsar alanı olarak belirlenen lagün, 16 Aralık 2008'de millî park ilan edildi.");
        System.out.println("Find city name with first three letter");
        find("Tek",arr);
           for (int i = 0; i < arr.length; i++) {
            genericList.add(arr[i].getText());
        }
        System.out.println("Words and their counter");
        Hashtable<String,Integer> hashtable1=new Hashtable();
        for (int i = 0; i < genericList.size(); i++) {
            String[] words = arr[i].getText().replaceAll("\\p{P}", "").replaceAll("\\s{2,}" ," ").trim().split(" ");
            for (int j =0;j< words.length;j++){
                if (hashtable1.containsKey(words[j])){
                    int a=hashtable1.get(words[j]);
                    a++;
                    hashtable1.put(words[j],a);
                }
                else {
                    hashtable1.put(words[j],1);
                }
            }

        }
        for (String key: hashtable1.keySet()){
            System.out.println(key+ ":" + hashtable1.get(key));

        }






        for (MilliPark milliPark : arr) {
            tree.Insert(milliPark);
        }
        System.out.println("National Park Tree");
        tree.InOrder(tree.getRoot());
        int depth = tree.MaxDepth(tree.getRoot());
        int balancedTreeDepth = (int) Math.ceil(Math.log(tree.nodeNumber) / Math.log(2))-1;
        System.out.println("Tree Depth : " + depth);
        System.out.println("Node Number : " + tree.nodeNumber);
        System.out.println("İf this one is balanced three : " + balancedTreeDepth);


        System.out.println("*********************");
        System.out.println("******************Hashtable*************");
        Hashtable<String, MilliPark> hashtable = new Hashtable<>();
        for (int i = 0; i < arr.length; i++) {
            hashtable.put(arr[i].getNationalparkName(), arr[i]);
        }
        String name = "Abant Gölü Milli Parkı";
        System.out.println("Selected Name :  " + name);
        int year = 2000;
        Enumeration<String> e = hashtable.keys();
        while (e.hasMoreElements()){
            String key = e.nextElement();
            if (key.equals(name)){
                hashtable.get(key).setYear(year);

            }
        }
        System.out.println("****************Heap*******************");
        PriorityQueue<MilliPark> priorityQueue=new PriorityQueue<>();
        for (int i =0;i<arr.length;i++){
            priorityQueue.add(arr[i]);
        }
        for (int i =0;i<3;i++){
            MilliPark removedOne=priorityQueue.remove();
            System.out.println("Removed Element");
            System.out.println("Name : " + removedOne.getNationalparkName());
            System.out.println("Year : " + removedOne.getYear());
            System.out.println("Area : " + removedOne.getArea());
            System.out.println("City : " + removedOne.getCityName());
            System.out.println("Text : " + removedOne.getText());
        }
    }
    static void find (String b,MilliPark[] milliParks){
        for (int i =0;i<milliParks.length;i++){
            if ((milliParks[i].getNationalparkName().substring(0,3)).equals(b)){
                System.out.println(milliParks[i].getCityName());
            }
        }

    }
    static class Node {
        public MilliPark data;
        public Node leftChild;
        public Node rightChild;

        public void displayNode() {
            System.out.println("******Milli Park*******");


            System.out.println("National Park Name: " + data.getNationalparkName());
            System.out.println("City Name:  " + data.getCityName());
            System.out.println("Year: " + data.getYear());
            System.out.println("Area : " + data.getArea());
            System.out.println("Text : " + data.getText());


        }
    }


    static class Tree {
        private Node root;
        public int nodeNumber;

        public Tree() {
            root = null;
            nodeNumber = 0;
        }

        public Node getRoot() {
            return root;
        }

        public int MaxDepth(Node root) {
            if (root == null)
                return -1;
            else {
                int leftDepth = MaxDepth(root.leftChild);
                int rightDepth = MaxDepth(root.rightChild);

                /* use the larger one */
                if (rightDepth > leftDepth)
                    return (rightDepth + 1);
                else
                    return (leftDepth + 1);
            }
        }


        public void Insert(MilliPark newData) {

            nodeNumber++;
            Node newNode = new Node();
            newNode.data = newData;
            if (root == null)
                root = newNode;
            else {
                Node current = root;
                Node parent;


                while (true) {
                    parent = current;
                    if (current.data.getNationalparkName().compareTo(newData.getNationalparkName()) < 0) {
                        current = current.leftChild;
                        if (current == null) {
                            parent.leftChild = newNode;
                            return;
                        }
                    } else {
                        current = current.rightChild;
                        if (current == null) {
                            parent.rightChild = newNode;
                            return;
                        }
                    }
                }


            }


        }

        public void InOrder(Node localRoot) {
            if (localRoot != null) {
                InOrder(localRoot.leftChild);
                localRoot.displayNode();
                InOrder(localRoot.rightChild);
            }
        }


    }
}
