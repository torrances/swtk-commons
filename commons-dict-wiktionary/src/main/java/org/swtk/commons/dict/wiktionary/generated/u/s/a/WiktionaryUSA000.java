package org.swtk.commons.dict.wiktionary.generated.u.s.a;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryUSA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("usar", "{\"term\":\"usar\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The United States Army Reserve\", \"priority\":1}]}, \"synonyms\":{}}");

	add("usability", "{\"term\":\"usability\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|usable|ity|lang\u003den}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The state or condition of being usable\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The degree to which an object, device, software application, etc. is easy to use with no specific training\", \"priority\":2}]}, \"synonyms\":{}}");

	add("usableness", "{\"term\":\"usableness\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|usable|ness|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The quality of being usable\", \"priority\":1}]}, \"synonyms\":{}}");

	add("usage", "{\"term\":\"usage\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"old french (842-ca. 1400)\", \"anglo-norman\"], \"text\":\"From Anglo-norman and Old french (842-ca. 1400) {{m|fro|usage}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The manner or the amount of using; us\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"Habit or accepted practic\", \"priority\":2},{\"upperType\":\"NOUN\", \"text\":\"The ways and contexts in which spoken and written words are used, determined by a lexicographer\u0027s intuition or from corpus analysis\", \"priority\":3},{\"upperType\":\"NOUN\", \"text\":\"Correct or proper use of language, proclaimed by some authority\", \"priority\":4},{\"upperType\":\"NOUN\", \"text\":\"Geographic, social, or temporal restrictions on the use of words\", \"priority\":5}]}, \"synonyms\":{}}");

	add("usagist", "{\"term\":\"usagist\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|usage|ist|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"One who defines a language by usage rather than theory\", \"priority\":1}]}, \"synonyms\":{}}");

	add("usania", "{\"term\":\"usania\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\u0027USA\u0027 + \u0027-an\u0027 + \u0027-ia,\u0027 parallel to \u0027Araucania,\u0027 etc.; or a backformation from \u0027Usanian\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The United States of America\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }