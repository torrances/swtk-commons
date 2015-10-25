package org.swtk.commons.dict.wiktionary.generated.o.u.z;  import java.util.HashMap; import java.util.Map;  import org.swtk.common.dict.dto.wiktionary.Entry;  import com.trimc.blogger.commons.utils.GsonUtils;  public class WiktionaryOUZ000 {  	private static Map<String, Entry> map = new HashMap<String, Entry>();  	static { 			add("ouzo", "{\"term\":\"ouzo\", \"etymology\":{\"influencers\":[], \"languages\":[\"Greek\", \"English\", \"Italian\", \"Turkish\"], \"text\":\"From Greek {{m|el|ούζο}}, either from Turkish {{m|tr|üzüm||grape}} or from the Italian \u0027uso Massalia\u0027 (for use in Marseille) stamped on selected silkworm cocoons exported from Tyrnavos in the 19th century, standing for \u0026quot;superior quality\u0026quot;. Other: from the ancient greek word \u0027όζω - οσμή\u0027 (\u0027ózo - osmí\u0027 \u003d smell) because of the strong smell of the drink.\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"An anise-flavoured liqueur, popular in Greece\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"A serving of this drink\", \"priority\":2}]}, \"synonyms\":{}}");

	add("ouzel", "{\"term\":\"ouzel\", \"etymology\":{\"influencers\":[], \"languages\":[\"old english (ca. 450-1100)\", \"English\"], \"text\":\"Old english (ca. 450-1100) {{m|ang|ōsle}}, from Proto-germanic {{m|gem-pro|*amslǭ}}. Cognate with German \u0027amsel\u0027\"}, \"definitions\":{\"list\":[{\"upperType\":\"NOUN\", \"text\":\"The Eurasian blackbird, \u0027Turdus merula\", \"priority\":1},{\"upperType\":\"NOUN\", \"text\":\"The , an aquatic perching bird\", \"priority\":2}]}, \"synonyms\":{}}");

 	}  	private static void add(String term, String json) { 		map.put(term, GsonUtils.toObject(json, Entry.class)); 	}  	public static Entry get(String term) { 		return map.get(term); 	} 	 	public static boolean has(String term) { 		return null != get(term); 	} }