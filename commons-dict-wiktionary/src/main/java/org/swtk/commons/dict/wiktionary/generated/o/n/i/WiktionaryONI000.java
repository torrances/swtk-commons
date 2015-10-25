package org.swtk.commons.dict.wiktionary.generated.o.n.i;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryONI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("onion", "{\"term\":\"onion\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle english (1100-1500)\", \"old french (842-ca. 1400)\", \"Latin\", \"anglo-norman\"], \"text\":\"From Middle english (1100-1500) \u0027onyon\u0027 \u0027union\u0027 \u0027oinyon\u0027 from Anglo-norman \u0027union\u0027 et al. and Old french (842-ca. 1400) \u0027oignon\u0027 from Latin {{m|la|ūniōnem}}, accusative of {{m|la|ūniō||onion, large pearl}}. Displaced the inherited term \u0027\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A monocotyledonous plant (\u0027Allium cepa\u0027), allied to garlic, used as vegetable and spice\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The bulb of such a plant\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"1962\u0027\u0027 (quoting \u0027\u00271381\u0027\u0027 text), \u0026amp; Sherman M. Kuhn, eds., \u0027\u0027, Ann Arbor, Mich.: , ISBN 978-0-472-01044-8, page 1242\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"dorrẹ\u0026amp\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"773;\u0027\u0027, \u0027\u0027dōrī\u0027\u0027 adj. \u0026amp; n. \u0026lt;u\u0026gt;cook\u0026lt;/u\u0026gt;. glazed with a yellow substance; pome(s ~, sopes ~. 1381 \u0026lt;u\u0026gt;Pegge Cook. Recipes\u0026lt;/u\u0026gt; p. 114: For to make Soupys dorry. Nym \u0027\u0027onyons\u0027\u0027 Nym wyn toste wyte bred and do yt in dischis, and god Almande mylk\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"The genus as a whole\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"A ball\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"A person from Bermuda or of Bermudian descent\", \"priority\":8}]}, \"synonyms\":{}}");

	add("oniochalasia", "{\"term\":\"oniochalasia\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The purchasing of objects as a form of mental relaxation\", \"priority\":1}]}, \"synonyms\":{}}");

	add("oniomania", "{\"term\":\"oniomania\", \"etymology\":{\"influencers\":[], \"languages\":[\"German\", \"English\", \"ancient greek (to 1453)\"], \"text\":\"From Ancient greek (to 1453) \u0027ὤνιος\u0027 (for sale) + \u0027\u0027 after German \u0027oniomanie\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An abnormal impulse to buy things, or a condition characterised by such impulses\", \"priority\":1}]}, \"synonyms\":{}}");

	add("onionskin", "{\"term\":\"onionskin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A thin, strong, light, translucent paper; used especially for making carbon copies\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }