package org.swtk.commons.dict.wiktionary.generated.z.i.m;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryZIM000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("zimbo", "{\"term\":\"zimbo\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{suffix|Zimbabwean|o|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A Zimbabwean\", \"priority\":1}]}, \"synonyms\":{}}");

	add("zimbabwe", "{\"term\":\"zimbabwe\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Shona\"], \"text\":\"From Shona \u0027dzimba-dze-mabwe\u0027 (house of stones) in reference to {{w|Great Zimbabwe}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Country in Southern Africa. Official name: Republic of Zimbabwe. Formerly called Southern Rhodesia or Rhodesia\", \"priority\":1}]}, \"synonyms\":{}}");

	add("zimblish", "{\"term\":\"zimblish\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|Zimbabwean|English|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A language combining English with Zimbabwean languages, such as Shona, Zulu, Ndebele and Xhosa.\u0026lt;!-- It is similar to Funnygalo and Kitchen Kaffa (although kaffa is an insulting term for an African-American)--\u0026gt\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }