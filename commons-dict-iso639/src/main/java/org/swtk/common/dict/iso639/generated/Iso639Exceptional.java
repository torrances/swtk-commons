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
public class Iso639Exceptional {

	private static Map<Integer, Language> map = new HashMap<Integer, Language>();

	static {
		add("aav-pro	Proto-Austro-Asiatic	Austro-Asiatic	Latinx			");
		add("afa-pro	Proto-Afro-Asiatic	Afro-Asiatic	Latinx	Hamito-Semitic		");
		add("alg-pro	Proto-Algonquian	Algonquian	Latinx		Yes	");
		add("aql-pro	Proto-Algic	Algic	Latinx		Yes	");
		add("art-blk	Bolak	constructed	Latn			");
		add("art-bsp	Black Speech	constructed	Latn, Teng			");
		add("art-com	Communicationssprache	constructed	Latn			");
		add("art-dtk	Dothraki	constructed	Latn			");
		add("art-elo	Eloi	constructed	Latn			");
		add("art-gld	Goa'uld	constructed	Latn, Egyp, Mero			");
		add("art-lap	Lapine	constructed	Latn			");
		add("art-man	Mandalorian	constructed	Latn			");
		add("art-mun	Mundolinco	constructed	Latn			");
		add("art-nav	Na'vi	constructed	Latn			");
		add("art-nox	Noxilo	constructed	Latn			");
		add("art-top	Toki Pona	constructed	Latn			");
		add("art-una	Unas	constructed	Latn			");
		add("ath-pro	Proto-Athabaskan	Athabaskan	Latinx			");
		add("aus-bun	Bunurong	Pama-Nyungan				");
		add("aus-cww-pro	Proto-Central New South Wales	Central New South Wales	Latinx			");
		add("aus-pam-pro	Proto-Pama-Nyungan	Pama-Nyungan	Latinx			");
		add("aus-won	Wong-gie	Pama-Nyungan				");
		add("awd-pro	Proto-Arawakan	Arawakan	Latn	Proto-Arawak, Proto-Maipurean, Proto-Maipuran		");
		add("awd-taa-pro	Proto-Ta-Arawakan	Ta-Arawakan	Latn	Proto-Ta-Arawak, Proto-Caribbean Northern Arawak		");
		add("azc-cup-pro	Proto-Cupan	Cupan	Latinx			");
		add("azc-nah-pro	Proto-Nahuan	Nahuan	Latinx			");
		add("azc-num-pro	Proto-Numic	Numic	Latinx			");
		add("azc-pro	Proto-Uto-Aztecan	Uto-Aztecan	Latinx			");
		add("azc-tak-pro	Proto-Takic	Takic	Latinx			");
		add("ber-pro	Proto-Berber	Berber				");
		add("bnt-phu	Phuthi	Bantu	Latn	Siphuthi		");
		add("bnt-pro	Proto-Bantu	Bantu	Latinx			");
		add("cau-abz-pro	Proto-Abkhaz-Abaza	Abkhaz-Abaza	Latinx	Proto-Abazgi, Proto-Abkhaz-Tapanta		");
		add("cau-cir-pro	Proto-Circassian	Circassian	Latinx	Proto-Adyghe-Kabardian, Proto-Adyghe-Circassian		");
		add("cau-nec-pro	Proto-Northeast Caucasian	Northeast Caucasian	Latinx			");
		add("cau-nkh-pro	Proto-Nakh	Nakh	Latinx			");
		add("cau-nwc-pro	Proto-Northwest Caucasian	Northwest Caucasian	Latinx			");
		add("cbk-zam	Zamboanga Chavacano	creole or pidgin				");
		add("ccn-pro	Proto-North Caucasian	North Caucasian	Latinx			");
		add("ccs-gzn-pro	Proto-Georgian-Zan	Georgian-Zan	Latinx	Proto-Karto-Zan		Yes");
		add("ccs-pro	Proto-Kartvelian	Kartvelian	Latinx			Yes");
		add("cel-bry-pro	Proto-Brythonic	Brythonic	Latinx	Proto-Brittonic		");
		add("cel-gau	Gaulish	Celtic	Latn, Grek			");
		add("cel-pro	Proto-Celtic	Celtic	Latinx			");
		add("cmc-pro	Proto-Chamic	Chamic	Latinx			");
		add("cpe-mar	Maroon Spirit Language	creole or pidgin	Latn	Jamaican Maroon Spirit Possession Language		");
		add("cpe-spp	Samoan Plantation Pidgin	creole or pidgin	Latn			");
		add("crp-gep	Greenlandic Pidgin	creole or pidgin	Latn	West Greenlandic Pidgin, Greenlandic Eskimo Pidgin		");
		add("crp-rsn	Russenorsk	creole or pidgin	Cyrl, Latn			");
		add("crp-tpr	Taimyr Pidgin Russian	creole or pidgin	Cyrl			");
		add("dra-pro	Proto-Dravidian	Dravidian	Latinx			");
		add("dru-pro	Proto-Rukai	Austronesian	Latinx			");
		add("esx-esk-pro	Proto-Eskimo	Eskimo	Latinx			");
		add("esx-inu-pro	Proto-Inuit	Inuit	Latinx			");
		add("esx-pro	Proto-Eskimo-Aleut	Eskimo-Aleut	Latinx			");
		add("euq-pro	Proto-Basque	Vasconic	Latinx			");
		add("fiu-fin-pro	Proto-Finnic	Finnic	Latn			");
		add("fiu-ugr-pro	Proto-Ugric	Ugric	Latinx			");
		add("gem-pro	Proto-Germanic	Germanic	Latinx	Common Germanic	Yes	");
		add("gme-cgo	Crimean Gothic	East Germanic	Latn			");
		add("gmq-gut	Gutnish	North Germanic	Latn			");
		add("gmq-mno	Middle Norwegian	North Germanic	Latn			");
		add("gmq-oda	Old Danish	North Germanic	Latn			");
		add("gmq-osw	Old Swedish	North Germanic	Latn			");
		add("gmq-pro	Proto-Norse	North Germanic	Runr			");
		add("gmw-cfr	Central Franconian	West Germanic	Latn	Mittelfränkisch, Ripuarian, Moselle Franconian, Colognian, Kölsch		");
		add("gmw-gts	Gottscheerish	West Germanic	Latn	Gottscheerisch		");
		add("gmw-jdt	Jersey Dutch	West Germanic	Latn			");
		add("gmw-rfr	Rhine Franconian	West Germanic	Latn	Rheinfränkisch, Rhenish Franconian, Hessian, Lorraine Franconian, Lorrainian, Lothringisch		");
		add("gmw-stm	Sathmar Swabian	West Germanic	Latn	Satu Mare Swabian, Sathmarschwäbisch, Sathmarisch		");
		add("gmw-tsx	Transylvanian Saxon	West Germanic	Latn	Siebenbürger Saxon		");
		add("gmw-vog	Volga German	West Germanic	Latn			");
		add("grk-cal	Calabrian Greek	Hellenic	Latn	Italian Greek, Bova		");
		add("grk-pro	Proto-Hellenic	Hellenic	Latinx			");
		add("hmn-pro	Proto-Hmong	Hmong	Latinx			");
		add("hmx-mie-pro	Proto-Mien	Mien	Latinx			");
		add("hmx-pro	Proto-Hmong-Mien	Hmong-Mien	Latinx			");
		add("hyx-pro	Proto-Armenian	Armenian	Latn			");
		add("iir-pro	Proto-Indo-Iranian	Indo-Iranian	Latinx			");
		add("inc-pro	Proto-Indo-Aryan	Indo-Aryan	Latinx			");
		add("ine-ana-pro	Proto-Anatolian	Anatolian	Latinx			");
		add("ine-bsl-pro	Proto-Balto-Slavic	Balto-Slavic	Latinx		Yes	");
		add("ine-pro	Proto-Indo-European	Indo-European	Latinx		Yes	");
		add("ine-toc-pro	Proto-Tocharian	Tocharian	Latinx			");
		add("ira-pro	Proto-Iranian	Iranian	Latinx			");
		add("iro-min	Mingo	Iroquoian	Latn			");
		add("itc-ola	Old Latin	Italic	Latn, Ital	Archaic Latin, Early Latin, Pre-Classical Latin, Ante-Classical Latin		Yes");
		add("itc-pro	Proto-Italic	Italic	Latinx			");
		add("jpx-pro	Proto-Japonic	Japonic	Latinx			");
		add("khi-kun	_Kung	Khoisan	Latn	_O_Kung, _'O_Kung, Kung, Ekoka _Kung, Ekoka Kung, Sekele		");
		add("map-ata-pro	Proto-Atayalic	Atayalic	Latinx			");
		add("map-bms	Banyumasan					");
		add("map-pro	Proto-Austronesian	Austronesian	Latinx			");
		add("mkh-mvi	Middle Vietnamese	Vietic	Latn, Hani			");
		add("mkh-pro	Proto-Mon-Khmer	Mon-Khmer	Latinx			");
		add("mkh-vie-pro	Proto-Vietic	Vietic	Latinx			");
		add("nai-kat	Kathlamet	Chinookan	Latn	Kathlamet Chinook		");
		add("nai-pic	Picuris	Kiowa-Tanoan	Latn			");
		add("nai-pom-pro	Proto-Pomo		Latn	Proto-Pomoan		");
		add("nds-de	German Low German	West Germanic	Latn			");
		add("nds-nl	Dutch Low Saxon	West Germanic	Latn			");
		add("omq-mix-pro	Proto-Mixtecan	Mixtecan	Latn			");
		add("phi-pro	Proto-Philippine	Philippine	Latinx			");
		add("plf-pro	Proto-Central Malayo-Polynesian	Central Malayo-Polynesian	Latinx			");
		add("poz-btk-pro	Proto-Bungku-Tolaki	Bungku-Tolaki	Latinx			");
		add("poz-cet-pro	Proto-Central-Eastern Malayo-Polynesian	Malayo-Polynesian	Latinx			");
		add("poz-hce-pro	Proto-Halmahera-Cenderawasih	Halmahera-Cenderawasih	Latinx	Proto-South Halmahera - West New Guinea		");
		add("poz-lgx-pro	Proto-Lampungic	Lampungic	Latinx			");
		add("poz-mcm-pro	Proto-Malayo-Chamic	Malayo-Sumbawan	Latinx			");
		add("poz-mly-pro	Proto-Malayic	Malayic	Latinx			");
		add("poz-msa-pro	Proto-Malayo-Sumbawan	Malayo-Sumbawan	Latinx			");
		add("poz-oce-pro	Proto-Oceanic	Oceanic	Latinx			");
		add("poz-pep-pro	Proto-Eastern Polynesian	Polynesian	Latinx	Proto-Eastern-Polynesian, Proto-East Polynesian, Proto-East-Polynesian		");
		add("poz-pnp-pro	Proto-Nuclear Polynesian	Polynesian	Latinx			");
		add("poz-pol-pro	Proto-Polynesian	Polynesian	Latinx			");
		add("poz-pro	Proto-Malayo-Polynesian	Malayo-Polynesian	Latinx			");
		add("poz-ssw-pro	Proto-South Sulawesi	South Sulawesi	Latinx			");
		add("poz-sus-pro	Proto-Sunda-Sulawesi	Sunda-Sulawesi	Latinx			");
		add("poz-swa-pro	Proto-North Sarawak	North Sarawakan	Latinx			");
		add("pqe-pro	Proto-Eastern Malayo-Polynesian	Eastern Malayo-Polynesian	Latinx			");
		add("pqw-pro	Proto-Western Malayo-Polynesian	Western Malayo-Polynesian	Latinx			");
		add("qfa-cka-pro	Proto-Chukotko-Kamchatkan	Chukotko-Kamchatkan	Latinx			");
		add("qfa-ctc-cat	Catacao	Catacaoan	Latinx			");
		add("qfa-ctc-col	Colán	Catacaoan	Latinx	Colan		");
		add("qfa-kor-pro	Proto-Korean	Korean				");
		add("qfa-len-slv	Salvadoran Lenca	Lencan	Latn			");
		add("qfa-tot-pro	Proto-Totozoquean	Totozoquean				");
		add("qfa-yen-pro	Proto-Yeniseian	Yeniseian	Latinx			");
		add("roa-gal	Gallo	Romance	Latn		Yes	");
		add("roa-grn	Guernésiais	Romance	Latn	Dgèrnésiais, Guernsey French, Guernsey Norman French	Yes	");
		add("roa-jer	Jèrriais	Romance	Latn	Jersey French, Jersey Norman, Jersey Norman French	Yes	");
		add("roa-leo	Leonese	Romance	Latn			");
		add("roa-oan	Navarro-Aragonese	Romance	Latn	Old Aragonese		");
		add("roa-oca	Old Catalan	Romance	Latn		Yes	");
		add("roa-oit	Old Italian	Romance	Latn			");
		add("roa-ole	Old Leonese	Romance	Latn			");
		add("roa-opt	Old Portuguese	Romance	Latn	Galician-Portuguese, Galician Portuguese, Medieval Galician		");
		add("roa-tar	Tarantino	Romance	Latn			");
		add("sal-pro	Proto-Salish	Salishan	Latn	Proto-Salishan		");
		add("sca-pro	Proto-Siouan-Catawban	Siouan-Catawban	Latinx			");
		add("sem-amm	Ammonite	Canaanite	Phnx			");
		add("sem-pro	Proto-Semitic	Semitic	Latinx			");
		add("sem-srb	Old South Arabian	Old South Arabian	Sarb			");
		add("sio-pro	Proto-Siouan	Siouan	Latinx			");
		add("sit-pro	Proto-Sino-Tibetan	Sino-Tibetan	Latn			");
		add("sla-pro	Proto-Slavic	Slavic	Latinx	Common Slavic		Yes");
		add("smi-pro	Proto-Samic	Sami	Latn	Proto-Sami		");
		add("sqj-pro	Proto-Albanian	Albanian	Latinx			");
		add("syd-fne	Forest Nenets	Samoyedic	Cyrl			");
		add("syd-pro	Proto-Samoyedic	Samoyedic	Latn			");
		add("tai-pro	Proto-Tai	Tai	Latinx			");
		add("tai-swe-pro	Proto-Southwestern Tai	Southwestern Tai	Latinx			");
		add("trk-pro	Proto-Turkic	Turkic	Latinx			");
		add("tut-pro	Proto-Altaic	Altaic	Latinx			");
		add("tuw-pro	Proto-Tungusic		Latinx			");
		add("urj-pro	Proto-Uralic	Uralic	Latinx	Proto-Finno-Ugric, Proto-Finno-Permic		");
		add("xgn-pro	Proto-Mongolic	Mongolic	Latinx			");
		add("zlw-opl	Old Polish	West Slavic	Latn			");
		add("zlw-pom	Pomeranian					");
		add("zlw-slv	Slovincian	West Slavic	Latn			");
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
