package org.swtk.commons.dict.wiktionary.generated.a.p.i;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAPI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("apiarist", "{\"term\":\"apiarist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|apiary|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"beekeeper\", \"priority\":1}]}, \"synonyms\":{}}");

	add("apiary", "{\"term\":\"apiary\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Latin\"], \"text\":\"17th Century, from Latin {{m|la|apiārium}}, from \u0027apis\u0027 (lang\u003dla)\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A place where bees and their hives are kept. \u0026lt;!--Not the same as a beehive--\u0026gt\", \"priority\":1}]}, \"synonyms\":{}}");

	add("apiculture", "{\"term\":\"apiculture\", \"etymology\":{\"influencers\":[{}], \"languages\":[\"English\", \"Latin\"], \"text\":\"From Latin \u0027apis\u0027 (bee) + \u0027culture\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The keeping and maintenance of bees for commercial reasons\", \"priority\":1}]}, \"synonyms\":{}}");

	add("apiculturist", "{\"term\":\"apiculturist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|apiculture|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"beekeeper\", \"priority\":1}]}, \"synonyms\":{}}");

	add("apiin", "{\"term\":\"apiin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A chemical compound isolated from parsley and celery, and whose aglycone is apigenin\", \"priority\":1}]}, \"synonyms\":{}}");

	add("apiol", "{\"term\":\"apiol\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An oleoresin extracted from parsley\", \"priority\":1}]}, \"synonyms\":{}}");

	add("apipa", "{\"term\":\"apipa\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"a safety mechanism in dynamic host client processing to assign IP addresses within a given range when the main DHCP mechanism fails\", \"priority\":1}]}, \"synonyms\":{}}");

	add("apitherapy", "{\"term\":\"apitherapy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027apis\u0027 (lang\u003dla) + \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The medical use of bee products such as honey, pollen, propolis, royal jelly, and bee venom\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }