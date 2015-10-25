package org.swtk.commons.dict.wiktionary.generated.a.a.r;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAAR000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("aarau", "{\"term\":\"aarau\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A town in Northern Switzerland, capital of Aargau canton, and capital of the Helvetic Republic between 1798 and 1803\", \"priority\":1}]}, \"synonyms\":{}}");

	add("aardvark", "{\"term\":\"aardvark\", \"etymology\":{\"influencers\":[{},{},{}], \"languages\":[\"Afrikaans\", \"middle dutch (ca. 1050-1350)\", \"English\", \"Dutch\"], \"text\":\"From Afrikaans \u0027aardvark\u0027 (obsolete), \u0027erdvark\u0027 from Afrikaans \u0027aarde\u0027 (earth) (from Dutch from Middle dutch (ca. 1050-1350) \u0027aerde\u0027 + Afrikaans \u0027vark\u0027 (pig) (from Middle dutch (ca. 1050-1350) \u0027varken\u0027 (pig) .Early European colonists in South Africa noticed that the animal was similar to a pig, while \u0026quot;aarde\u0026quot; hints at the animal\u0027s habit of burrowing.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The nocturnal, insectivorous, burrowing, mammal \u0027Orycteropus afer\u0027, of the order Tubulidentata, somewhat resembling a pig, common in some parts of sub-Saharan Africa\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The \u0027\u0027aardvark\u0027\u0027 burrows in the ground and feeds mostly on termites, which it catches with its long, slimy tongue\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A silly or credulous person who is prone to mistakes or blunders\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"I walked into the wrong bathroom like a total \u0027\u0027aardvark\", \"priority\":4}]}, \"synonyms\":{}}");

	add("aardwolf", "{\"term\":\"aardwolf\", \"etymology\":{\"influencers\":[], \"languages\":[\"Afrikaans\", \"English\"], \"text\":\"From Afrikaans \u0027aardwolf\u0027 {{wikisource1911Enc|Aard-wolf}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The nocturnal, insectivorous, mammal, of southern and eastern Africa, related to and resembling the hyena\", \"priority\":1}]}, \"synonyms\":{}}");

	add("aargau", "{\"term\":\"aargau\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A canton of Switzerland (its German name\", \"priority\":1}]}, \"synonyms\":{}}");

	add("aarhus", "{\"term\":\"aarhus\", \"etymology\":{\"influencers\":[], \"languages\":[\"Danish\", \"English\"], \"text\":\"From Danish \u0027aarhus\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A city and port in Denmark, in East Jutland. The second-largest city in Denmark\", \"priority\":1}]}, \"synonyms\":{}}");

	add("aaronite", "{\"term\":\"aaronite\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Aaron|ite|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A descendant of Aaron; a Levite\", \"priority\":1}]}, \"synonyms\":{}}");

	add("aarush", "{\"term\":\"aarush\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From India, \u0026quot;first ray of Sun\u0026quot;. {{etystub|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"used in India\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }