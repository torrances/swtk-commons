package org.swtk.commons.dict.wordnet.indexbyname.instance.w.a.g;  import java.util.ArrayList; import java.util.Collection; import java.util.Map; import java.util.TreeMap;  import org.swtk.common.dict.dto.wordnet.IndexNoun;  import com.trimc.blogger.commons.utils.GsonUtils;  public final class WordnetNounIndexNameInstanceWAG {  	private static Map<String, Collection<IndexNoun>> map = new TreeMap<String, Collection<IndexNoun>>();  	static { 			add("{\"term\":\"wag\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00348478\", \"10782010\"]}");
	add("{\"term\":\"wage\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"13300285\"]}");
	add("{\"term\":\"wager\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"13364541\", \"00507669\"]}");
	add("{\"term\":\"wagerer\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"09871284\"]}");
	add("{\"term\":\"wages\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"07310247\"]}");
	add("{\"term\":\"waggery\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"00516080\", \"06794138\"]}");
	add("{\"term\":\"waggishness\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"06794138\"]}");
	add("{\"term\":\"waggle\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"00348478\"]}");
	add("{\"term\":\"waggon\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"02817668\", \"04550444\"]}");
	add("{\"term\":\"waggoner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10782275\"]}");
	add("{\"term\":\"waggonwright\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10782361\"]}");
	add("{\"term\":\"wagner\", \"synsetCount\":3, \"upperType\":\"NOUN\", \"ids\":[\"07293630\", \"11389829\", \"11390063\"]}");
	add("{\"term\":\"wagnerian\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10782148\"]}");
	add("{\"term\":\"wagon\", \"synsetCount\":5, \"upperType\":\"NOUN\", \"ids\":[\"02817668\", \"04550795\", \"09242765\", \"03984324\", \"04550444\"]}");
	add("{\"term\":\"wagoner\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10782275\"]}");
	add("{\"term\":\"wagonwright\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"10782361\"]}");
	add("{\"term\":\"wagram\", \"synsetCount\":2, \"upperType\":\"NOUN\", \"ids\":[\"01301528\", \"08866157\"]}");
	add("{\"term\":\"wagtail\", \"synsetCount\":1, \"upperType\":\"NOUN\", \"ids\":[\"01531037\"]}");
 	}  	private static void add(final String JSON) { 		IndexNoun indexNoun = GsonUtils.toObject(JSON, IndexNoun.class); 		Collection<IndexNoun> list = (map.containsKey(indexNoun.getTerm())) ? map.get(indexNoun.getTerm()) : new ArrayList<IndexNoun>(); 		list.add(indexNoun); 		map.put(indexNoun.getTerm(), list); 	} 	 	public static Collection<IndexNoun> get(final String TERM) { 		return map.get(TERM); 	}  	public static boolean has(final String TERM) { 		return map.containsKey(TERM); 	} 	 	public static Collection<String> terms() { 		return map.keySet(); 	} }