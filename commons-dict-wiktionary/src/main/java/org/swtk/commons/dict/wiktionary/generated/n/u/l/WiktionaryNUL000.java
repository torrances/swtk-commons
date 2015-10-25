package org.swtk.commons.dict.wiktionary.generated.n.u.l;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryNUL000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("null", "{\"term\":\"null\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"middle french (ca. 1400-1600)\", \"Latin\"], \"text\":\"From Middle french (ca. 1400-1600) \u0027nul\u0027 from Latin \u0027nullus\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A non-existent or empty value or set of values\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Zero quantity of expressions; nothing\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"Something that has no force or meaning\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"the ASCII or Unicode character (\u0026lt;big\u0026gt;\u0026lt;big\u0026gt;\u0026lt;/big\u0026gt;\u0026lt;/big\u0026gt;), represented by a zero value, that indicates no character and is sometimes used as a string terminator\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"the attribute of an entity that has no valid value\", \"priority\":5},{\"upperType\":\"NOUN\", \"text\":\"Since no date of birth was entered for the patient, his age is \u0027\u0027null\", \"priority\":6},{\"upperType\":\"NOUN\", \"text\":\"One of the beads in nulled work\", \"priority\":7},{\"upperType\":\"NOUN\", \"text\":\"null hypothesis\", \"priority\":8}]}, \"synonyms\":{}}");

	add("nulliparity", "{\"term\":\"nulliparity\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Never having completed a pregnancy beyond 20 weeks\", \"priority\":1}]}, \"synonyms\":{}}");

	add("nulliploidy", "{\"term\":\"nulliploidy\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The condition of being nulliploid\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }