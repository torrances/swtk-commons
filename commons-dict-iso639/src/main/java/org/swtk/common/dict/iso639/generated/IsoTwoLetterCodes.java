package org.swtk.common.dict.iso639.generated;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.swtk.common.dict.dto.iso639.Language;
import org.swtk.common.dict.dto.iso639.adapter.LanguageAdapter;
import org.swtk.common.dict.iso639.utils.Iso639Utils;

import com.trimc.blogger.commons.utils.string.StringUtils;

/**
 * 	Purpose:
 * 		List of exceptional ISO639 codes
 * 		<https://en.wiktionary.org/wiki/Wiktionary:List_of_languages>
 * 
 * 	Columns (0-based):
 * 		0	code					code
 * 		1	cannonical name			name, short-name
 * 		2	family		
 * 		3	scripts
 * 		4	other names (csv)		variants
 * 		5	sort
 * 		6	diacritic?
 *
 */
public class IsoTwoLetterCodes {

	private static Map<Integer, Language> map = new HashMap<Integer, Language>();

	static {
		add("aa	Afar	Cushitic	Latn	Qafar		");
		add("ab	Abkhaz	Abkhaz-Abaza	Cyrl, Geor, Latn	Abkhazian, Abxazo		Yes");
		add("ae	Avestan	Iranian	Avst, Gujr	Zend, Old Bactrian		");
		add("af	Afrikaans	West Germanic	Latn, Arab		Yes	");
		add("ak	Akan	Kwa	Latn	Twi-Fante, Twi, Fante, Fanti, Asante, Akuapem		");
		add("am	Amharic	Ethiopian Semitic	Ethi			");
		add("an	Aragonese	Romance	Latn			");
		add("ar	Arabic	Arabic	Arab	Modern Standard Arabic, Standard Arabic, Literary Arabic, Classical Arabic		Yes");
		add("as	Assamese	Indo-Aryan	Beng			");
		add("av	Avar	Northeast Caucasian	Cyrl	Avaric		");
		add("ay	Aymara	Aymaran	Latn	Southern Aymara, Central Aymara		");
		add("az	Azeri	Turkic	Latn, Cyrl, fa-Arab	Azerbaijani, Azari, Azeri Turkic, Azerbaijani Turkic, North Azerbaijani, South Azerbaijani		");
		add("ba	Bashkir	Turkic	Cyrl			");
		add("be	Belarusian	East Slavic	Cyrl	Belorussian, Belarusan, Bielorussian, Byelorussian, Belarussian, White Russian	Yes	Yes");
		add("bg	Bulgarian	South Slavic	Cyrl			Yes");
		add("bh	Bihari	Indo-Aryan	Deva			");
		add("bi	Bislama	creole or pidgin	Latn			");
		add("bm	Bambara	Mande	Latn	Bamanankan		");
		add("bn	Bengali	Indo-Aryan	Beng	Bangla		");
		add("bo	Tibetan	Tibeto-Burman	Tibt			");
		add("br	Breton	Brythonic	Latn			");
		add("ca	Catalan	Romance	Latn	Valencian	Yes	");
		add("ce	Chechen	Nakh	Cyrl			Yes");
		add("ch	Chamorro	Sunda-Sulawesi	Latn	Chamoru		");
		add("co	Corsican	Romance	Latn	Corsu		");
		add("cr	Cree	Algonquian	Cans, Latn			");
		add("cs	Czech	West Slavic	Latn		Yes	");
		add("cu	Old Church Slavonic	South Slavic	Cyrs, Glag	Old Church Slavic	Yes	Yes");
		add("cv	Chuvash	Turkic	Cyrl			");
		add("cy	Welsh	Brythonic	Latn		Yes	");
		add("da	Danish	North Germanic	Latn			");
		add("de	German	West Germanic	Latn, Latf	High German, New High German, Deutsch	Yes	");
		add("dv	Dhivehi	Indo-Aryan	Thaa	Divehi, Mahal, Mahl, Maldivian		");
		add("dz	Dzongkha	Tibeto-Burman	Tibt			");
		add("ee	Ewe	Atlantic-Congo	Latn			");
		add("el	Greek	Hellenic	Grek	Modern Greek, Neo-Hellenic	Yes	");
		add("en	English	West Germanic	Latn, Shaw, Dsrt	Modern English, New English, Hawaiian Creole English, Hawai'ian Creole English, Hawaiian Creole, Hawai'ian Creole, Polari, Yinglish	Yes	");
		add("eo	Esperanto	constructed	Latn		Yes	");
		add("es	Spanish	Romance	Latn	Castilian	Yes	");
		add("et	Estonian	Finnic	Latn			");
		add("eu	Basque	Vasconic	Latn	Euskara		");
		add("fa	Persian	Iranian	fa-Arab	Farsi, New Persian, Modern Persian, Western Persian, Iranian Persian, Eastern Persian, Dari		Yes");
		add("ff	Fula	Senegambian	Latn	Adamawa Fulfulde, Bagirmi Fulfulde, Borgu Fulfulde, Central-Eastern Niger Fulfulde, Fulani, Fulfulde, Maasina Fulfulde, Nigerian Fulfulde, Pular, Pulaar, Western Niger Fulfulde		");
		add("fi	Finnish	Finnic	Latn	Suomi	Yes	Yes");
		add("fj	Fijian	Central-Eastern Oceanic	Latn			");
		add("fo	Faroese	North Germanic	Latn			");
		add("fr	French	Romance	Latn	Modern French	Yes	");
		add("fy	West Frisian	Frisian	Latn	Western Frisian, Frisian		");
		add("ga	Irish	Goidelic	Latn	Irish Gaelic	Yes	");
		add("gd	Scottish Gaelic	Goidelic	Latn	Gàidhlig, Highland Gaelic, Scots Gaelic, Scottish	Yes	");
		add("gl	Galician	Romance	Latn			");
		add("gn	Guaraní	Tupian	Latn			");
		add("gu	Gujarati	Indo-Aryan	Gujr			");
		add("gv	Manx	Goidelic	Latn	Manx Gaelic	Yes	");
		add("ha	Hausa	West Chadic	Latn, Arab			");
		add("he	Hebrew	Canaanite	Hebr, Phnx	Ivrit		Yes");
		add("hi	Hindi	Indo-Aryan	Deva			");
		add("ho	Hiri Motu	creole or pidgin	Latn	Pidgin Motu, Police Motu		");
		add("ht	Haitian Creole	creole or pidgin	Latn	Creole, Haitian, Kreyòl		");
		add("hu	Hungarian	Ugric	Latn	Magyar	Yes	");
		add("hy	Armenian	Armenian	Armn	Modern Armenian, Eastern Armenian, Western Armenian	Yes	Yes");
		add("hz	Herero	Bantu	Latn			");
		add("ia	Interlingua	constructed	Latn			");
		add("id	Indonesian	Malayic	Latn			");
		add("ie	Interlingue	constructed	Latn	Occidental		");
		add("ig	Igbo	Benue-Congo	Latn			");
		add("ii	Sichuan Yi	Tibeto-Burman	Yiii			");
		add("ik	Inupiak	Inuit	Latn	Inupiaq, Iñupiaq, Inupiatun		");
		add("io	Ido	constructed	Latn			");
		add("is	Icelandic	North Germanic	Latn			");
		add("it	Italian	Romance	Latn		Yes	");
		add("iu	Inuktitut	Inuit	Cans, Latn	Eastern Canadian Inuktitut, Eastern Canadian Inuit, Western Canadian Inuktitut, Western Canadian Inuit, Western Canadian Inuktun, Inuinnaq, Inuinnaqtun, Inuvialuk, Inuvialuktun, Nunavimmiutit, Nunatsiavummiut, Aivilimmiut, Natsilingmiut, Kivallirmiut, Siglit, Siglitun		");
		add("ja	Japanese	Japonic	Jpan, Latn, Hira	Modern Japanese, Nipponese, Nihongo		");
		add("jv	Javanese	Sunda-Sulawesi	Latn, Java			");
		add("ka	Georgian	Georgian-Zan	Geor, Geok	Kartvelian		Yes");
		add("kg	Kongo	Bantu	Latn	Kikongo, Koongo, Laari, San Salvador Kongo, Yombe		");
		add("ki	Kikuyu	Bantu	Latn	Gikuyu, Gĩkũyũ		");
		add("kj	Kwanyama	Bantu	Latn	Kuanyama, Oshikwanyama		");
		add("kk	Kazakh	Turkic	Cyrl, Latn, Arab, kk-Arab			");
		add("kl	Greenlandic	Inuit	Latn	Kalaallisut		");
		add("km	Khmer	Mon-Khmer	Khmr	Cambodian		");
		add("kn	Kannada	Dravidian	Knda			");
		add("ko	Korean	Korean	Kore	Modern Korean		");
		add("kr	Kanuri	Nilo-Saharan	Latn	Kanembu, Bilma Kanuri, Central Kanuri, Manga Kanuri, Tumari Kanuri		");
		add("ks	Kashmiri	Dardic	ks-Arab, Deva			");
		add("ku	Kurdish	Iranian	Latn, ku-Arab, Armn, Cyrl			");
		add("kw	Cornish	Brythonic	Latn			");
		add("ky	Kyrgyz	Turkic	Cyrl, Latn, Arab	Kirghiz, Kirgiz		");
		add("la	Latin	Italic	Latn			Yes");
		add("lb	Luxembourgish	West Germanic	Latn			");
		add("lg	Luganda	Bantu	Latn	Ganda		");
		add("li	Limburgish	West Germanic	Latn	Limburgan, Limburgian, Limburgic		");
		add("ln	Lingala	Bantu	Latn			");
		add("lo	Lao	Southwestern Tai	Laoo	Laotian		");
		add("lt	Lithuanian	Baltic	Latn			Yes");
		add("lu	Luba-Katanga	Bantu	Latn			");
		add("lv	Latvian	Baltic	Latn	Lettish, Lett		");
		add("mg	Malagasy	East Barito	Latn	Betsimisaraka Malagasy, Betsimisaraka, Northern Betsimisaraka Malagasy, Northern Betsimisaraka, Southern Betsimisaraka Malagasy, Southern Betsimisaraka, Bara Malagasy, Bara, Masikoro Malagasy, Masikoro, Antankarana, Antankarana Malagasy, Plateau Malagasy, Sakalava, Tandroy Malagasy, Tandroy, Tanosy, Tanosy Malagasy, Tesaka, Tsimihety, Tsimihety Malagasy		");
		add("mh	Marshallese	Micronesian	Latn		Yes	");
		add("mi	Maori	Polynesian	Latn	Māori		");
		add("mk	Macedonian	South Slavic	Cyrl			Yes");
		add("ml	Malayalam	Dravidian	Mlym			");
		add("mn	Mongolian	Mongolic	Cyrl, Mong	Khalkha Mongolian		");
		add("mr	Marathi	Indo-Aryan	Deva			");
		add("ms	Malay	Malayic	Latn, Arab			");
		add("mt	Maltese	Arabic	Latn			");
		add("my	Burmese	Burmish	Mymr	Myanmar		");
		add("na	Nauruan	Micronesian	Latn	Nauru		");
		add("nb	Norwegian Bokmål	North Germanic	Latn	Bokmål		");
		add("nd	Northern Ndebele	Bantu	Latn	North Ndebele		");
		add("ne	Nepali	Indo-Aryan	Deva	Nepalese		");
		add("ng	Ndonga	Bantu	Latn			");
		add("nl	Dutch	West Germanic	Latn	Netherlandic, Flemish	Yes	");
		add("nn	Norwegian Nynorsk	North Germanic	Latn	New Norwegian, Nynorsk		");
		add("no	Norwegian	North Germanic	Latn			");
		add("nr	Southern Ndebele	Bantu	Latn	South Ndebele		");
		add("nv	Navajo	Apachean	nv-Latn		Yes	");
		add("ny	Chichewa	Bantu	Latn	Chicheŵa, Chinyanja, Nyanja, Chewa		");
		add("oc	Occitan	Romance	Latn	Provençal, Auvergnat, Auvernhat, Gascon, Languedocien, Lengadocian	Yes	");
		add("oj	Ojibwe	Algonquian	Cans, Latn	Chippewa, Ojibway, Ojibwemowin, Southwestern Ojibwa		");
		add("om	Oromo	Cushitic	Latn, Ethi	Orma, Borana-Arsi-Guji Oromo, West Central Oromo		");
		add("or	Oriya	Indo-Aryan	Orya	Odia, Oorya		");
		add("os	Ossetian	Iranian	Cyrl, Geor, Latn	Ossete, Ossetic, Digor, Iron		Yes");
		add("pa	Punjabi	Indo-Aryan	Guru, Arab, Deva	Panjabi		");
		add("pi	Pali	Indo-Aryan	Latn, Deva, Sinh, Mymr, Khmr, Thai		Yes	");
		add("pl	Polish	West Slavic	Latn		Yes	");
		add("ps	Pashto	Iranian	ps-Arab	Pashtun, Pushto, Pashtu, Central Pashto, Northern Pashto, Southern Pashto, Pukhto, Pakhto, Pakkhto, Afghani		");
		add("pt	Portuguese	Romance	Latn	Modern Portuguese	Yes	");
		add("qu	Quechua	Quechuan	Latn			");
		add("rm	Romansch	Romance	Latn	Romansh, Rumantsch, Romanche		");
		add("rn	Kirundi	Bantu	Latn			");
		add("ro	Romanian	Romance	Latn, Cyrl	Daco-Romanian, Roumanian, Rumanian		");
		add("ru	Russian	East Slavic	Cyrl		Yes	Yes");
		add("rw	Kinyarwanda	Bantu	Latn			");
		add("sa	Sanskrit	Indo-Aryan	Deva, Beng, Brah, Gran, Gujr, Guru, Khar, Knda, Mlym, Mymr, Orya, Shrd, Sinh, Taml, Telu, Thai, Tibt			");
		add("sc	Sardinian	Romance	Latn	Campidanese, Campidanese Sardinian, Logudorese, Logudorese Sardinian, Nuorese, Nuorese Sardinian		");
		add("sd	Sindhi	Indo-Aryan	sd-Arab			");
		add("se	Northern Sami	Sami	Latn	North Sami, Northern Saami, North Saami		Yes");
		add("sg	Sango	creole or pidgin	Latn			");
		add("sh	Serbo-Croatian	South Slavic	Latn, Cyrl	BCS, Croato-Serbian, Serbocroatian, Bosnian, Croatian, Montenegrin, Serbian		Yes");
		add("si	Sinhalese	Indo-Aryan	Sinh	Singhalese, Sinhala		");
		add("sk	Slovak	West Slavic	Latn		Yes	");
		add("sl	Slovene	South Slavic	Latn	Slovenian		Yes");
		add("sm	Samoan	Polynesian	Latn			");
		add("sn	Shona	Bantu	Latn			");
		add("so	Somali	Cushitic	Latn, Arab, Osma			Yes");
		add("sq	Albanian	Albanian	Latn, Elba		Yes	");
		add("ss	Swazi	Bantu	Latn	Swati		");
		add("st	Sotho	Bantu	Latn	Sesotho, Southern Sesotho, Southern Sotho		");
		add("su	Sundanese	Malayo-Sumbawan	Latn, Sund			");
		add("sv	Swedish	North Germanic	Latn			");
		add("sw	Swahili	Bantu	Latn, Arab		Yes	");
		add("ta	Tamil	Dravidian	Taml			");
		add("te	Telugu	Dravidian	Telu			");
		add("tg	Tajik	Iranian	Cyrl, fa-Arab, Latn	Tadjik, Tadzhik, Tajiki, Tajik Persian	Yes	Yes");
		add("th	Thai	Southwestern Tai	Thai			");
		add("ti	Tigrinya	Ethiopian Semitic	Ethi			");
		add("tk	Turkmen	Turkic	Latn, Cyrl			");
		add("tl	Tagalog	Philippine	Latn, Tglg			");
		add("tn	Tswana	Bantu	Latn	Setswana		");
		add("to	Tongan	Polynesian	Latn			");
		add("tr	Turkish	Turkic	Latn			");
		add("ts	Tsonga	Bantu	Latn			");
		add("tt	Tatar	Turkic	Cyrl, Latn, Arab, tt-Arab			");
		add("ty	Tahitian	Polynesian	Latn			");
		add("ug	Uyghur	Turkic	ug-Arab, Latn, Cyrl	Uigur, Uighur, Uygur		");
		add("uk	Ukrainian	East Slavic	Cyrl			Yes");
		add("ur	Urdu	Indo-Aryan	ur-Arab			Yes");
		add("uz	Uzbek	Turkic	Latn, Cyrl, fa-Arab	Northern Uzbek, Southern Uzbek		");
		add("ve	Venda	Bantu	Latn			");
		add("vi	Vietnamese	Vietic	Latn, Hani	Annamese, Annamite		");
		add("vo	Volapük	constructed	Latn			");
		add("wa	Walloon	Romance	Latn		Yes	");
		add("wo	Wolof	Senegambian	Latn, Arab			");
		add("xh	Xhosa	Bantu	Latn			");
		add("yi	Yiddish	West Germanic	Hebr			");
		add("yo	Yoruba	Volta-Niger	Latn			");
		add("za	Zhuang	Tai	Latn, Hani			");
		add("zh	Chinese	Sino-Tibetan	Hani			");
		add("zu	Zulu	Bantu	Latn	isiZulu		");
	}

	private static void add(String line) {
		Language language = new Language();

		String[] tokens = StringUtils.splitByWholeSeparatorPreserveAllTokens(line, "\t");
		language.setId(tokens[0]);
		language.setName(tokens[1]);
		language.setShortName(language.getName());
		language.setVariations(LanguageAdapter.getVariations(language.getName()));

		map.put(language.hashCode(), language);
	}

	public static Language findById(String id) {
		return Iso639Utils.findById(id, map);
	}

	public static Language findByName(String name) {
		return Iso639Utils.findByName(name, map);
	}

	public static Map<String, Collection<String>> getLanguageNamesWithVariantsAsMap() {
		return Iso639Utils.getLanguageNamesWithVariantsAsMap(map);
	}

	public static Collection<String> getLanguageNamesWithVariantsAsSet() {
		return Iso639Utils.getLanguageNamesWithVariantsAsSet(map);
	}

	public static boolean hasById(String id) {
		return null != findById(id);
	}

	public static boolean hasByName(String name) {
		return null != findByName(name);
	}
}
