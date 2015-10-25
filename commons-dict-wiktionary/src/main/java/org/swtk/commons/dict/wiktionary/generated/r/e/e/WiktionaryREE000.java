package org.swtk.commons.dict.wiktionary.generated.r.e.e;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryREE000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("reedbuck", "{\"term\":\"reedbuck\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|reed|buck|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Any of several African antelopes of the genus\", \"priority\":1}]}, \"synonyms\":{}}");

	add("reedfish", "{\"term\":\"reedfish\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{compound|reed|fish|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A fish related to the bichir\", \"priority\":1}]}, \"synonyms\":{}}");

	add("reeding", "{\"term\":\"reeding\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Decorative moulding of parallel strips that resemble reeds\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Milling on the edge of a coin\", \"priority\":2}]}, \"synonyms\":{}}");

	add("reedist", "{\"term\":\"reedist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|reed|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A musician who plays reed instruments (usually more than one\", \"priority\":1}]}, \"synonyms\":{}}");

	add("reelin", "{\"term\":\"reelin\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|reel|in|lang\u003den}}, from the abnormal gait of \u0027\u0027 mice, later found to be deficient in this protein.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A protein that helps to regulate processes of neuronal migration and positioning in the developing brain\", \"priority\":1}]}, \"synonyms\":{}}");

	add("reembarkation", "{\"term\":\"reembarkation\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|re|embarkation|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"embarkation again or anew\", \"priority\":1}]}, \"synonyms\":{}}");

	add("reenactment", "{\"term\":\"reenactment\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{confix|re|enact|ment|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The repetition of an earlier (usually historic) event, as a performance or social event\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"They\u0027re going to the Civil War battle \u0027\u0027reenactment\u0027\u0027 this weekend\", \"priority\":2}]}, \"synonyms\":{}}");

	add("reentry", "{\"term\":\"reentry\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|re|entry|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The act of reentering\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"a \u0027\u0027reentry\u0027\u0027 into public life\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The return of a spacecraft into the atmosphere\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"The reactivation of (a region of) myocardial tissue by a single, returning impuls\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"A resuming or retaking possession of what one has lately foregone, especially land; the entry by a lessor upon the premises leased, on failure of the tenant to pay rent or perform the covenants in the lease\", \"priority\":5}]}, \"synonyms\":{}}");

	add("reexchange", "{\"term\":\"reexchange\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|re|exchange|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A renewed exchange\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A reversal of an exchange\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The expense chargeable on a bill of exchange or draft that has been dishonoured in a foreign country and returned to its country of origin, and then taken up\", \"priority\":3}]}, \"synonyms\":{}}");

	add("reexperience", "{\"term\":\"reexperience\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{prefix|re|experience|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A renewed or repeated experience\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }