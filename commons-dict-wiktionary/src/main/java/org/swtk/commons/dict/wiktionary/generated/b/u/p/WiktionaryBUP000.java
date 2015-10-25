package org.swtk.commons.dict.wiktionary.generated.b.u.p;  import java.util.Collection; import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryBUP000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("buphthalmos", "{\"term\":\"buphthalmos\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"abnormal enlargement of the eyeball\", \"priority\":1}]}, \"synonyms\":{}}");

	add("bupkis", "{\"term\":\"bupkis\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"Yiddish\"], \"text\":\"From Yiddish {{m|yi|באָבקעס}}, plural of {{m|yi|באָבקע||goat or sheep dropping}}, from {{suffix|באָב|קע|t1\u003dbean|lang\u003dyi|nocat\u003d1}}, from Proto-slavic {{m|sla-pro|*bobъ}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"Absolutely nothing; nothing of value, significance, or substance\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"We searched for hours and found \u0027\u0027bupkis\", \"priority\":2}]}, \"synonyms\":{}}");

	add("buppie", "{\"term\":\"buppie\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{blend|black|yuppie|lang\u003den}} or an {{abbreviation of|black urban professional|nocap\u003d1|dot\u003d,|lang\u003den}} modelled on \u0027yuppie\u0027 (from \u0027young urban professional\u0027).\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"short for \u0026quot;black urban professional\u0026quot;, a African American subset of the yuppie category. The group includes black professionals and executives in their late twenties and early thirties\", \"priority\":1}]}, \"synonyms\":{}}");

	add("bupropion", "{\"term\":\"bupropion\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An aminoketone antidepressant that acts as a norepinephrine and dopamine reuptake inhibitor and nicotinic antagonist\", \"priority\":1}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	}  	public static boolean has(String term) { 		return null != get(term); 	}  	public static Collection<String> terms() { 		return map.keySet(); 	} }