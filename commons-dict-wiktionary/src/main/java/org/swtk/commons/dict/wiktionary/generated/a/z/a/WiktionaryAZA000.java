package org.swtk.commons.dict.wiktionary.generated.a.z.a;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryAZA000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("azaguanine", "{\"term\":\"azaguanine\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A purine analogue with chemical formula C\u0026lt;sub\u0026gt;4\u0026lt;/sub\u0026gt;H\u0026lt;sub\u0026gt;4\u0026lt;/sub\u0026gt;N\u0026lt;sub\u0026gt;6\u0026lt;/sub\u0026gt;O, used in the treatment of acute leukemia\", \"priority\":1}]}, \"synonyms\":{}}");

	add("azalea", "{\"term\":\"azalea\", \"etymology\":{\"influencers\":[], \"languages\":[\"English\", \"ancient greek (to 1453)\"], \"text\":\"From from Ancient greek (to 1453) \u0027ἀζαλέος\u0027 (dry) because it grows in dry soil; from \u0027αζειν\u0027 (to dry up) from Proto-indo-european {{m|ine-pro|*h₂éHōs}}.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"A plant of the obsolete genus \u0027Azalea\", \"priority\":1}]}, \"synonyms\":{}}");

	add("azarole", "{\"term\":\"azarole\", \"etymology\":{\"influencers\":[], \"languages\":[], \"text\":\"{{rfe|lang\u003den}}\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The , \u0027Crataegus azarolus\u0027, a shrub of southern Europe\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The fruit of this plant\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }