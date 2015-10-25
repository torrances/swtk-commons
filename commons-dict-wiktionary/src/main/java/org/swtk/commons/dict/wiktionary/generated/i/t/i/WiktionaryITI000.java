package org.swtk.commons.dict.wiktionary.generated.i.t.i;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryITI000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("itis", "{\"term\":\"itis\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"From suffix \u0027-itis\u0027 (disease characterized by inflammation) Compare \u0027phobia\u0027 from \u0027-phobia\u0027 \u0027sophy\u0027 from \u0027-sophy\u0027 \u0027ism\u0027 from \u0027-ism\u0027 and \u0027ana\u0027 from \u0027-ana\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A medical condition accompanied by inflammation\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"1973\u0027\u0027, April 16, “[http://cnnsi.printthis.clickability.com/pt/cpt?action\u003dcpt\u0026amp;title\u003dScorecard+-+04.16.73+-+SI+Vault\u0026amp;expire\u003d\u0026amp;urlID\u003d29498645\u0026amp;fb\u003dY\u0026amp;url\u003dhttp%3A%2F%2Fvault.sportsillustrated.cnn.com%2Fvault%2Farticle%2Fmagazine%2FMAG1135573%2Findex.htm\u0026amp;partnerID\u003d289881 Scorecard]”, Robert W. Creamer ed., in \u0027Sports Illustrated\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"“. . . Arthritis, tendinitis and all those other \u0027\u0027itises\u0027\u0027 will eventually catch up with you\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The feeling of sleepiness after eating a heavy meal, usually \u0027the itis\", \"priority\":4}]}, \"synonyms\":{}}");

	add("itinerary", "{\"term\":\"itinerary\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\"], \"text\":\"From \u0027lang\u003dla|itinerarius\u0027 () neuter \u0027lang\u003dla|itinerarium\u0027 () from \u0027lang\u003dla|iter\u0027 () see itinerate.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A route or proposed route of a journey\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"An account or record of a journey\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"A guidebook for travellers\", \"priority\":3}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }