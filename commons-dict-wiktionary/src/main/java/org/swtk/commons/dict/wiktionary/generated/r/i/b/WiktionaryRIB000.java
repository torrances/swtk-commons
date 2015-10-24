package org.swtk.commons.dict.wiktionary.generated.r.i.b;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryRIB000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ribat", "{\"term\":\"ribat\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From the Arabic {{l|ar|رباط}} {{IPAchar|(ribāʈ)}}, hospice, hostel.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An Islamic monastery\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ribaldo", "{\"term\":\"ribaldo\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Mora moro\u0027, the common mora, a deep-sea cod-like fish\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ribauldequin", "{\"term\":\"ribauldequin\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"French\"], \"text\":\"From French \u0027ribaudequin\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An engine of war used in the Middle Ages, consisting of a protected elevated staging on wheels, and armed in front with pikes. After the 14th century it was furnished with small cannon\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A huge bow fixed on the wall of a fortified town for casting javelins\", \"priority\":2}]}, \"synonyms\":{}}");

	add("ribbonfish", "{\"term\":\"ribbonfish\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|ribbon|fish|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several lampriform fish, of the genus , having long, ribbon-like bodies\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ribgrass", "{\"term\":\"ribgrass\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|rib|grass|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"ribwort; Old World plantain\", \"priority\":1}]}, \"synonyms\":{}}");

	add("riboregulation", "{\"term\":\"riboregulation\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From {{prefix|ribo|regulation|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"genetic regulation by RNA\", \"priority\":1}]}, \"synonyms\":{}}");

	add("riboregulator", "{\"term\":\"riboregulator\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|ribo|regulator|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An RNA that regulates expression of itself or another nucleic acid in response to a signaling event\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ribosome", "{\"term\":\"ribosome\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"20th century: from ribonucleic (acid) + Ancient greek (to 1453) \u0027σῶμα\u0027 (body)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Small organelles found in all cells; involved in the production of proteins by translating messenger RNA\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ribosyl", "{\"term\":\"ribosyl\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|ribose|yl|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"any univalent radical derived from ribose\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ribroast", "{\"term\":\"ribroast\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|rib|roast|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A cut of beef from the main rib\", \"priority\":1}]}, \"synonyms\":{}}");

	add("ribwort", "{\"term\":\"ribwort\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|rib|wort|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"ribgrass; Old World plantain\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }