package org.swtk.commons.dict.wiktionary.generated.k.a.m;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryKAM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("kamboja", "{\"term\":\"kamboja\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"The etymology of Kamboja is unclear. It is supposed by some scholars\u0026lt;!--Dr C. Lassen, Dr M. Witzel and numerous others--\u0026gt; to be related to Kambujiya, although \u0026quot;there are also scholars who denounce a connection between Kamboja and Kambujiya [...] and who defend another etymology\u0026quot;\u0026lt;ref\u0026gt;\u0027\u00272007\u0027\u0027, Jan Tavernier, \u0027Iranica in the Achaemenid period (ca. 550-330 B.C.): lexicon of Old Iranian proper names\u0027, page 19, citing Benveniste 1958: 48n.1\u0026lt;/ref\u0026gt;. Compare {{m|en|Kambuja}}, {{m|en|Kamboj}} and {{w|Kamboja (name)}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An ancient Indo-Iranian region, located originally in Central Asia\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1995\u0027\u0027, Narendra K Wagle, \u0027Society at the time of the Buddha\u0027, page 35\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Denying this claim, the Buddha tells Assalayana how in Yona and \u0027\u0027Kamboja\u0027\u0027 and other outlying regions there are two \u0027vannas\u0027, the master and the slave, and that it is possible for a master to become a slave or for a slave to become a master\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"A people from this region\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"1990\u0027\u0027, DC Sircar, \u0027Studies in the Geography of Ancient and Medieval India\u0027, page 196\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"The most significant fact about the mention of the \u0027\u0027Kamboja\u0027\u0027 people in the early literary and epigraphic records of India is that they are usually associated with the Yavanas and often with both the Yavanas and Gandharas\", \"priority\":6}]}, \"synonyms\":{}}");

	add("kamchatkite", "{\"term\":\"kamchatkite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Kamchatka|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An orthorhombic-pyramidal greenish brown mineral containing chlorine, copper, oxygen, potassium, and sulfur\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kamees", "{\"term\":\"kamees\", \"etymology\":{\"influencers\":[], \"languages\":[\"Arabic\", \"English\"], \"text\":\"From Arabic {{l|ar|قميص}} \u0027qamīs\u0027, perhaps from late Latin camisa ‘shirt’.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A loose shirt worn in some South Asian and Islamic countries\", \"priority\":1}]}, \"synonyms\":{}}");

	add("kamik", "{\"term\":\"kamik\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Inuktitut\"], \"text\":\"From Inuktitut\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A mukluk\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1987\u0027\u0027, Jill Elizabeth Oakes, \u0027Factors influencing kamik production in Arctic Bay, Northwest Territories\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Regional differences affect \u0027\u0027kamik\u0027\u0027 styles\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"1996\u0027\u0027, William T Vollmann, \u0027The Atlas\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"The old man in old grayish \u0027\u0027kamiks\u0027\u0027 still had very good vision\", \"priority\":5}]}, \"synonyms\":{}}");

	add("kamora", "{\"term\":\"kamora\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The diacritic , used in the Old Cyrillic alphabet to represent palatalisation of certain consonants\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }