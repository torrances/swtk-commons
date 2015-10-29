package org.swtk.commons.dict.wordnet.indexbyname.instance.g.o.t;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceGOT {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"gota canal\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03453758\"]}");
	add("{\"term\":\"goteborg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08784500\"]}");
	add("{\"term\":\"goth\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"10159294\", \"10430560\"]}");
	add("{\"term\":\"gothenburg\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"08784500\"]}");
	add("{\"term\":\"gothic\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"05850914\", \"06839639\", \"06968446\"]}");
	add("{\"term\":\"gothic arch\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"03453900\"]}");
	add("{\"term\":\"gothic architecture\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"05850914\"]}");
	add("{\"term\":\"gothic romance\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06381028\"]}");
	add("{\"term\":\"gothic romancer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10159464\"]}");
	add("{\"term\":\"gothite\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"14701475\"]}");
	add("{\"term\":\"gotterdammerung\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06384548\"]}");
	add("{\"term\":\"gottfried wilhelm leibnitz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11145183\"]}");
	add("{\"term\":\"gottfried wilhelm leibniz\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11145183\"]}");
	add("{\"term\":\"gotthold ephraim lessing\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"11149655\"]}");
	add("{\"term\":\"gottlieb daimler\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10940761\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }